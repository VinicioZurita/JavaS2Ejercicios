/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javas2ejercicios;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class JavaS2Ejercicios {
public static int num1,num2;
public static Scanner scTeclado = new Scanner (System.in);
    public static void main(String[] args) {
        ingresoNumeros();
        MenuPrincipal();
    }
    //ingreso
     public static void ingresoNumeros(){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingrese el primer número");
        num1=sc.nextInt();
        System.out.println("Ingrese el segundo número");
        do{
            System.out.println("Ingrese número diferente de cero.");
            num2=sc.nextInt();
        }while (num2==0);
        
   }
    //Menu
    public static void MenuPrincipal(){
     int op;
    
        do { 
            System.out.println("*******MENU PRINCIPAL******");
            System.out.println("1: Suma");
            System.out.println("2: Resta");
            System.out.println("3: Multiplicación");
            System.out.println("4: División ");
            System.out.println("5: Salir");
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
        } while (op!=5);
    }//Fin menu
    //suma
    public static void suma(int numero1,int numero2){
    int resultado= numero1+numero2; 
    System.out.println("La suma es: "+ resultado);
    }
    //resta
    public static void resta(int numero1,int numero2){
    int resultado= numero1-numero2; 
    System.out.println("La suma es: "+ resultado);
    }
    //multiplicacion
    public static void multiplicacion(int numero1,int numero2){
    int resultado= numero1*numero2; 
    System.out.println("La suma es: "+ resultado);
    }
    //division
    public static void division(int numero1,int numero2){
    int resultado= numero1/numero2; 
    System.out.println("La suma es: "+ resultado);
    }
    
}
