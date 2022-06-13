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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


public class Java2ejercicio2{
    
    static final int ARIES = 0;
    static final int TAURO = 1;
    static final int GEMENIS = 2;
    static final int CANCER = 3;
    static final int LEO = 4;
    static final int VIRGO = 5;
    static final int LIBRA = 6;
    static final int ESCORPIO = 7;
    static final int SAGITARIO = 8;
    static final int CAPRICORNIO = 9;
    static final int ACUARIO = 10;
    static final int PISCIS = 11;
    
    public static void main(String args[]){
    
               MenuPrincipal(); 
 
    }
    public static void MenuPrincipal(){
        
        int op = 0;
        int dia = 0, mes = 0;
        int obtenerSignoZodiacal;
        String [] signoZodiacal = {"Aries","Tauro","Gemenis",
                                   "Cancer","LEO","VIRGO","LIBRA","ESCORPIO",
                                   "Sagitario","Capricornio","Acuario","Piscis"};
          
        String [] horoscopo = {"Horóscopo de Aries",
                               "Horóscopo de Tauro",
                               "Horóscopo de Gemenis",
                               "Horóscopo de Cancer",
                               "Horóscopo de LEO",
                               "Horóscopo de VIRGO",
                               "Horóscopo de LIBRA: Este día aprenderas a programar",
                               "Horóscopo de ESCORPIO",
                               "Horóscopo de Sagitario",
                               "Horóscopo de Capricornio",
                               "Horóscopo de Acuario",
                               "Horóscopo de Piscis"};
        
        Scanner scTeclado = new Scanner (System.in);
        
        do{
            System.out.println("*******MENU PRINCIPAL******");
            System.out.println("[1] Ingresar Datos");
            System.out.println("[2] Salir"); 
            System.out.print  ("Ingrese la Opción: "); 
            op = scTeclado.nextInt();
            
            if(op == 1){
                System.out.print("Ingrese el día de Nacimiento: ");
                dia = scTeclado.nextInt();
                System.out.print("Ingrese el Mes de Nacimiento: ");
                mes = scTeclado.nextInt();
                obtenerSignoZodiacal = DeterminarSignoZodiacal(dia, mes);
                System.out.println("El signo Zodiacal es :" + signoZodiacal[obtenerSignoZodiacal]);
                System.out.println("El Horóscopo es :" + horoscopo[obtenerSignoZodiacal]);
                System.out.println("El mes de nacimiento es :" + mes +", el día de Nacimeinto es :" + dia);
            }
            
        }while(op != 2);
        System.out.println("*******FIN PROGRAMA******");
        
    }
    
    public static int DeterminarSignoZodiacal( int dia, int mes){
        
        int signoZodial = -1;
        
        switch(mes){
            case 3: //Validar entre Aries y Piscis
                    if(dia>=1 && dia<=20){
                       signoZodial = PISCIS;
                    }else{
                       signoZodial = ARIES;
                    }
                    break;
            case 4: //Validar entre Aries y Tauro
                   if(dia>=1 && dia <=19){
                       signoZodial = ARIES;
                   }else{
                       signoZodial= TAURO;
                   }
                   break;
            case 5: //Validar entres Tauro y Gémenis
                   if(dia>=1 && dia <=20){
                       signoZodial= TAURO;
                   }else{
                       signoZodial= GEMENIS;
                   }
                   break;
            case 6:// Validamos entre Gémenis y Cancer
                if(dia>=1 && dia <=20){
                    signoZodial= GEMENIS;
                }else{
                    signoZodial= CANCER;
                }
                break;
            case 7://Validamos entre Cancer y Leo
                if(dia>=1 && dia <=22){
                    signoZodial= CANCER;
                }else{
                    signoZodial=LEO;
                }
                break;
            case 8://Validamos entre Leo y Virgo
                if(dia>=1 && dia <=22){
                    signoZodial= LEO;
                }else{
                    signoZodial= VIRGO;
                }
                break;
            case 9://Validamos entre Virgo y Libra
                if(dia>=1 && dia <=22){
                    signoZodial= VIRGO;
                }else{
                    signoZodial=LIBRA;
                }
                break;
            case 10://Validamos entre Libra y Escorpio
                if(dia>=1 && dia<=22){
                    signoZodial= LIBRA;
                }else{
                    signoZodial=ESCORPIO;
                }
                break;
            case 11://Validamos entre Escorpio y Sagitario
                if(dia>=1 && dia<=21){
                    signoZodial= ESCORPIO;
                }else{
                    signoZodial=SAGITARIO;
                }
                break;
            case 12://Validamos entre Sagitario y Capricornio
                if(dia>=1 && dia<=21){
                    signoZodial= SAGITARIO;
                }else{
                    signoZodial=CAPRICORNIO;
                }
                break;
            case 1://Validamos entre Capricornio y Acuario
                if(dia>=1 && dia<=20){
                    signoZodial= CAPRICORNIO;
                }else{
                    signoZodial=ACUARIO;
                }
                break;
            case 2://Validamos entre Acuario y Piscis
                if(dia>=1 && dia<=19){
                    signoZodial= ACUARIO;
                }else{
                    signoZodial=PISCIS;
                }
                break;
            default:
                break;
            
        }
        return signoZodial;
        
    }
    
    
    
}
