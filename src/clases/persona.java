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
public class persona {
    private String rut;
    private String nombre;
    private String apellidos;
    private int edad;

    //Constructor
    public persona (String rut, String nombre, String apellidos, int edad) {
        this.rut = rut;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;                   
    }

    //Métodos de acceso
    //el get me permite obtener información
    public String getRut () { 
        return rut;   
    }
    
    public String getNombre () { 
        return nombre;  
    }

    public String getApellidos () { 
        return apellidos;  
    }

    public int getEdad () { 
        return edad;   
    }    
   
}
