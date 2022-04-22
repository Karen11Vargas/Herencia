/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Scanner;

/**
 *
 * @author KAREN
 */
public class Aprendiz extends Persona{
    
      //Declaramos varibales
    private String codigoAprendiz;
    private String programaFormacion;

   

    //Se herda el constructor 
    
    public Aprendiz(String nombre, String apellido, int edad, String correo, double telefono){
        super(nombre, apellido, edad, telefono, correo);
    }
    
   
    //Get y Set 

    public String getCodigoAprendiz() {
        return codigoAprendiz;
    }

    public void setCodigoAprendiz(String codigoAprendiz) {
        this.codigoAprendiz = codigoAprendiz;
    }
      public String getProgramaFormacion() {
        return programaFormacion;
    }

    public void setProgramaFormacion(String programaFormacion) {
        this.programaFormacion = programaFormacion;
    }
    
   
    // Se crea el metodo
    public void generarCredenciales(){
        
        System.out.println("______________SENA-APRENDIZ__________");
        System.out.println("El nombre del aprendiz es:" + getNombre());
        System.out.println("El apellido del aprendiz:" + getApellido());
        System.out.println("La edad del aprendiz es:" + getEdad());
        System.out.println("El correo del aprendiz es: " + getCorreo() );
        System.out.println("El telefono del aprendiz es: " + getTelefono());
        System.out.println("El programa de formacion del aprendiz es: " + getProgramaFormacion());
        System.out.println("El codigo del aprendiz es:" + getCodigoAprendiz());


      
    }
     
}
