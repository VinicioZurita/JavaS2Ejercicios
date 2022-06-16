/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javas2ejercicios;

import static com.mycompany.javas2ejercicios.JavaS2Ejercicios.num2;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio2 {
    public static Scanner scTeclado = new Scanner (System.in);
    public static int dia,mes;
    
    public static void main(String[] args) {
        System.out.println("Realice un programa que muestre el signo del zodiaco de una persona. Para ello el\n" +
"usuario debe introducir únicamente el día y el mes de nacimiento y el programa\n" +
"determinará inmediatamente el signo zodiacal de la persona y su horóscopo (pequeño).\n" +
"Luego volverá a mostrar el menú de ingreso, hasta escoger salir.\n*********************************************************************************");
    }
    
     //Menu
    public static void MenuPrincipal(){
     int op;
    
        do { 
            System.out.println("*******MENU PRINCIPAL******");
            System.out.println("1: Ver Horóscopo");
            System.out.println("2: Salir");
            System.out.println("Ingrese la opción del Menú");
            
            op= scTeclado.nextInt();
            switch (op){
               case 1:
                   suma(num1, num2);
                   break;
               case 2:
                   //Opcion2();
                   break;
             
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (op!=2);
    }//Fin menu
    //ingfreso datos
    public static void ingresoMesDiaNacimiento(int dia, int mes) {
         System.out.println("Escoja su mes de nacimiento.");
            dia=scTeclado.nextInt();
            
    }
}
