/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author jquintanilla
 */
public class profesor extends persona {
    //Campos específicos de la subclase.
    private String codigoProfesor;

    //Constructor de la subclase: incluimos como parámetros 
    //al menos los del constructor de la superclase o clase padre
    public profesor (String rut, String nombre, String apellidos, int edad) {
        super(rut, nombre, apellidos, edad);
        codigoProfesor = "Desconocido";   
    } //Cierre del constructor
    
    //Constructor de la subclase: incluimos como parámetros todos los de la clase padre y de la clase heredera
    public profesor (String rut, String nombre, String apellidos, int edad,  String codProfesor) {
        super(rut, nombre, apellidos, edad);
        codigoProfesor = codProfesor;   
    } //Cierre del constructor

    //Métodos de acceso de la subclase, get permite obtener un valor y el set asignar un valor
    public void setIdProfesor (String IdProfesor) { 
        this.codigoProfesor = IdProfesor;   
    }

    public String getCodigoProfesor () { 
        return codigoProfesor;   
    }

    //Métodos específicos de la subclase
    public void mostrarDatosProfesor() {
        // Si tratáramos de acceder directamente a un campo privado de la superclase, se presenta un error
        // pero podemos acceder a variables de instancia a través de los métodos de acceso públicos de la superclase
        // en este caso getNombre() --estos se conocen como accesadores get y set
        System.out.println ("Profesor: " + getNombre() + " " +  getApellidos() + " Codigo de Secciones: " + getCodigoProfesor() ); 
    }
    
}
