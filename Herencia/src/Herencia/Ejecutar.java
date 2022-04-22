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
public class Ejecutar {
    
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
        
        System.out.println("Ingrese su programa de formacion: ");
        String programaFormacion = leer.next();
        
        System.out.println("Ingrese su codigo: ");
        String codigoAprendiz = leer.next();
        
           
     
        
         
         //Instanciar la clase

         Aprendiz aprendiz = new Aprendiz(nombre, apellido, edad, correo, telefono);
         aprendiz.setCodigoAprendiz(codigoAprendiz);
         aprendiz.setProgramaFormacion(programaFormacion);
         
        //Instanciar metodo de la clase aprendiz
        aprendiz.generarCredenciales();
         
        System.out.println("--------------------------------");
        System.out.println("Ejercicio de Herencia - Karen Vargas");
     
       
    }
}
