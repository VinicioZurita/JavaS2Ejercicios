/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javas2ejercicios;

/**
 *
 * @author victo
 */
import java.util.Scanner;

public class Java2Ejerccio1{
    
    public static void main(String args[]){
        
        MenuPrincipal();
        
    }
    
    public static void MenuPrincipal(){
        
        int op = 0;
        float numero1 = 0, numero2 = 0;
        
        Scanner scTeclado = new Scanner (System.in);
        
        do{
            System.out.println("*******MENU PRINCIPAL******");
            System.out.println("[1] Suma");
            System.out.println("[2] Resta");
            System.out.println("[3] Multiplicacion");
            System.out.println("[4] Division"); 
            System.out.println("[5] Salir"); 
            System.out.print  ("Ingrese la Opcion: "); 
            op = scTeclado.nextInt();
            
            if(op >= 1 && op <=4){
                System.out.print("Ingrese el Numero 1: ");
                numero1 = scTeclado.nextFloat();
                System.out.print("Ingrese el Numero 2: ");
                numero2 = scTeclado.nextFloat();
                switch(op){
                    case 1: MostrarResultado(SumarDosNumeros(numero1, numero2));
                            break;
                    case 2: MostrarResultado(RestaDosNumeros(numero1, numero2));
                            break;  
                    case 3: MostrarResultado(MultiplicarDosNumeros(numero1, numero2));
                            break;
                    case 4: 
                            if(ValidarDivision(numero1, numero2) == 0){
                                MostrarResultado(DividirDosNumeros(numero1, numero2));
                            }
                            break;
                    default:
                            break;
                }
            }
            
        }while(op != 5);
        System.out.println("*******FIN PROGRAMA******");
        
    }
    
    public static String SumarDosNumeros(float numParam1, float numParam2){
    
        float suma = numParam1 +numParam2;
        String respuesta = "La Suma es :" + suma;
        
        return respuesta;
    }
    
    public static String RestaDosNumeros(float numParam1, float numParam2){
    
        float resta = numParam1 - numParam2;
        String respuesta = "La Resta es :" + resta;
        
        return respuesta;
    }
    public static String MultiplicarDosNumeros(float numParam1, float numParam2){
    
        float multiplicar = numParam1 * numParam2;
        String respuesta = "La Multiplicación es :" + multiplicar;
        
        return respuesta;
    }
    public static String DividirDosNumeros(float numParam1, float numParam2){
    
        float division = numParam1 / numParam2;
        String respuesta = "La Division es :" + division;
        
        return respuesta;
    }
    
    public static void MostrarResultado(String cadenaTexto){
        
        System.out.println(cadenaTexto);
    }
    
    public static int ValidarDivision(float numParam1, float numParam2){
        
        int error = 0;
        
        //Validar si el divisor es 0
        if(numParam2 == 0 ){
            System.out.println("[ERROR] (ERROR) No se puede dividir entre 0");
            error = 1;
        }
        //Validar si el numero 1 es negativo
        if(numParam1 < 0){
            System.out.println("[ERROR] (ERROR) El parámetro1 es Negativos");
            error = 1;
        }
         //Validar si el numero 2 es negativo
        if(numParam2 < 0){
            System.out.println("[ERROR] (ERROR) El parámetro2 es Negativos");
            error = 1;
        }
        return error;
    }
    
       
}

