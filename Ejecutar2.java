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
public class Ejecutar2 {
    
    public static void main(String[] args) {
        
        //Se piden los datos 

        Scanner leer = new Scanner(System.in);
        System.out.println ("Ingrese el nombre");
        String nombre = leer.next();


        System.out.println("Ingrese su apellido: ");
        String apellido = leer.next();
        
        System.out.println("Ingrese su edad: ");
        int edad = leer.nextInt();
        
        System.out.println("Ingrese su correo: ");
        String correo = leer.next();
        
         System.out.println("Ingrese su telefono: ");
        Double telefono = leer.nextDouble();
        
    
           
        System.out.println("Ingrese el estado: ");
        String estadoInstructor = leer.next();
        
        System.out.println("Ingrese la materia: ");
        String materiaInstructor = leer.next();
        
        System.out.println("Ingrese el codigo: ");
        Double codigoInstructor = leer.nextDouble(); 
        
        //Insranciar clase padre
        
        Instructor instructor = new Instructor(nombre, apellido, edad, correo, telefono);
        instructor.setEstadoInstructor(estadoInstructor);
        instructor.setMateriaInstructor(materiaInstructor);
        instructor.setCodigoInstructor(codigoInstructor);
        
        //Intancias clase hija
        
        instructor.credenciales();
        
        System.out.println("--------------------------------");
        System.out.println("Ejercicio de Herencia - Karen Vargas");

         
    }
    
}
