package clases;
public class alumnos extends persona{
    private String NroMatricula;

 public alumnos (String rut, String nombre, String apellidos, int edad) {
        super(rut, nombre, apellidos, edad);
        NroMatricula = "Desconocido";   
    } 
 public alumnos (String rut, String nombre, String apellidos, int edad,  String Nmatricula) {
        super(rut, nombre, apellidos, edad);
        NroMatricula = Nmatricula;   
    }
 public void setNalumno (String Nalumno) { 
        this.NroMatricula = Nalumno;   
    }
 public String getNumeroMatricula () { 
        return NroMatricula;   
    }
 
 public void mostrarDatosAlumno() {
 System.out.println ("Alumno: " + getNombre() + " " +  getApellidos() + " Codigo de Secciones: " + getNumeroMatricula() ); 
 }




   
}
