package usoclses_y_herencias;
import clases.profesor;
import clases.alumnos;
import java.util.ArrayList;
public class UsoClses_y_Herencias {
    //declaro una lista de elemnetos como global
    //creamos el objeto lista
    static ArrayList<profesor> profesores = new ArrayList<>();
    static ArrayList<alumnos> alumnos = new ArrayList<>();
    
    public static void main(String[] args) {
        profesor profesor1 = new profesor("1-9", "Juan", "Soto Perez", 33);
        profesor1.setIdProfesor("2100-01-2016");
        profesor1.mostrarDatosProfesor();
        
        //procedimiento local
        cargaDatos();
        //funcion local
        int ubicacion= recorreListaProfesores();
        
        //muestra los datos del profesor de mayor edad
        muestraDatos(ubicacion);
        
        alumnos alumno1=new alumnos ("1-9","Victor","Navarro Soto",26);
        alumno1.setNalumno("24500-03");
        alumno1.mostrarDatosAlumno();
        
        
        datosalumno();
        promedioEdad();
    }
    
    private static void datosalumno(){
        alumnos alumno1 = new alumnos("1-9", "Victor", "Navarro Soto", 26);
        alumnos alumno2 = new alumnos("2-8", "Juan", "Perez Soto", 22);
        alumnos alumno3 = new alumnos("3-7", "John", "Beiza", 19);
        alumnos alumno4 = new alumnos("4-6", "Pedro", "Perez Pereira", 25);
        alumnos alumno5 = new alumnos("5-5", "Juan", "Swarschtaiger", 31);
        
        alumnos.add(alumno1);
        alumnos.add(alumno2);
        alumnos.add(alumno3);        
        alumnos.add(alumno4);        
        alumnos.add(alumno5);        
    
    
    }
    
    //permite cargar datos a la lista de elementos 
    private static void cargaDatos() {
        //creo el objeto profesor
        profesor profesor1 = new profesor("1-9", "Juan", "Soto Perez", 20);
        profesor profesor2 = new profesor("2-7", "Luis", "Perez Soto", 73);
        profesor profesor3 = new profesor("3-5", "Pedro", "Jirafales", 53);
        //almacenamos a cada profesor en la lista
        profesores.add(profesor1);
        profesores.add(profesor2);
        profesores.add(profesor3);        
        
        //retorna al hilo principal (main)
    }
    
    
    //permite recorrer los elementos
    private static int recorreListaProfesores() {
        //recorro los elemento de la lista
        int edadMayor = 0;
        int ubicacion = 0;
        //para esto le pregunto al su tamaño y lo recorro 
        //con la precaucion de indicarle que sea menor al maximo 
        //ya que i esta inicializada en cero
        for (int i = 0; i < profesores.size(); i++) {
            //consulto por una propiedad en particular
            int edadProfesor = profesores.get(i).getEdad();
            if (edadProfesor > edadMayor)
            {
                edadMayor = profesores.get(i).getEdad();
                ubicacion = i;
            }
        }
        return ubicacion;    
        //retorna al hilo principal (main)
    }

    //muestra datos asociados al objeto seleccionado
    private static void muestraDatos(int idProfesor) {
       
        //se debe recordar que al hacer uso de listas el primer indice valido es 0             
        System.out.println ("El Profesor: " + profesores.get(idProfesor).getNombre() + " " +  profesores.get(idProfesor).getApellidos() 
                 + " es el de mayor edad con : " + profesores.get(idProfesor).getEdad() + " años." ); 
        
        //retorna al hilo principal (main)
    }

    private static void promedioEdad() {
        int suma = 0;
        int promedio = 0;       
        for (int i = 0; i < alumnos.size(); i++) {            
            int edades = alumnos.get(i).getEdad();            
                suma = suma+edades;
        }
        promedio= suma/alumnos.size();
        System.out.println("El Promedio de edades es: "+promedio);  
        
    }
  
    
}
    
