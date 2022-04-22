/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author KAREN
 */
public class Instructor extends Persona{
    
        //Declaramos Variables

     private String estadoInstructor;
    private String materiaInstructor;
    private double codigoInstructor;
    
 

    //Se hereda constructor
    
    public Instructor (String nombre, String apellido, int edad, String correo, double telefono){
        super(nombre, apellido, edad, telefono, correo);
    }
    
    
    //Encapsulamos
     
    
       public String getEstadoInstructor() {
        return estadoInstructor;
    }

    public void setEstadoInstructor(String estadoInstructor) {
        this.estadoInstructor = estadoInstructor;
    }

    public String getMateriaInstructor() {
        return materiaInstructor;
    }

    public void setMateriaInstructor(String materiaInstructor) {
        this.materiaInstructor = materiaInstructor;
    }

    public double getCodigoInstructor() {
        return codigoInstructor;
    }
    public void setCodigoInstructor(double codigoInstructor) {
        this.codigoInstructor = codigoInstructor;
    }
   
    
    //Se crea el metodo
    
    public void credenciales (){
        
         System.out.println("______________SENA-INSTRUCTOR__________");
        System.out.println("El nombre del instructor es:" + getNombre());
        System.out.println("El apellido del instructor es :" + getApellido());
        System.out.println("La edad del instructor es:" + getEdad());
        System.out.println("El correo del instructor es: " + getCorreo() );
        System.out.println("El telefono del instructor es: " + getTelefono());
        System.out.println("El estado del instructor es: " + getEstadoInstructor());
        System.out.println("La materia del instructor es: " + getMateriaInstructor());
        System.out.println("El codigo del instructor es: " + getCodigoInstructor());


      
    }
    
}
