/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javas2ejercicios;


import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Ejercicio2 {
    public static Scanner scTeclado = new Scanner (System.in);
    public static int dia,mes,op,opMes;
    
    public static void main(String[] args) {
        System.out.println("Realice un programa que muestre el signo del zodiaco de una persona. Para ello el\n" +
"usuario debe introducir únicamente el día y el mes de nacimiento y el programa\n" +
"determinará inmediatamente el signo zodiacal de la persona y su horóscopo (pequeño).\n" +
"Luego volverá a mostrar el menú de ingreso, hasta escoger salir.\n*********************************************************************************");
        MenuPrincipal();
    }
    
     //Menu
    public static void MenuPrincipal(){
        do { 
            System.out.println("*******MENU PRINCIPAL******");
            System.out.println("1: Ver Horóscopo");
            System.out.println("2: Salir");
            System.out.println("Ingrese la opción del Menú");
            
            op= scTeclado.nextInt();
            switch (op){
               case 1:
                   ingresoMesDiaNacimiento();
                   break;
                default:
                    System.out.println("Opción no valida");
                    break;
            }
        } while (op!=2);
    }//Fin menu
    //ingfreso datos
    public static void ingresoMesDiaNacimiento() {
         System.out.println("Ingrese su dia de nacimiento.");
         dia=scTeclado.nextInt();
         mesNacimiento();
    }
    public static int mesNacimiento() {
        do { 
            System.out.println("*******MES DE NACIMIENTO******");
            System.out.println("1: ENERO");
            System.out.println("2: FEBRERO");
            System.out.println("3: MARZO");
            System.out.println("4: ABRIL");
            System.out.println("5: MAYO");
            System.out.println("6: JUNIO");
            System.out.println("7: JULIO");
            System.out.println("8: AGOSTO");
            System.out.println("9: SEPTIEMBRE");
            System.out.println("10: OCTUBRE");
            System.out.println("11: NOVIEMBRE");
            System.out.println("12: DICIEMBRE");
            System.out.println("Escoja su mes de nacimiento: ");
            
            opMes= scTeclado.nextInt();
            switch (opMes){
               case 1:
                   horoscopo(dia, 1);
                   break;
               case 2:
                   horoscopo(dia, 2);
                   break;
               case 3:
                    horoscopo(dia, 3);
                   break;
               case 4:
                   horoscopo(dia, 4);
                   break;    
               case 5:
                   horoscopo(dia, 5);
                   break;
               case 6:
                   horoscopo(dia, 6);
                   break; 
               case 7:
                  horoscopo(dia, 7);
                     break;
               case 8:
                   horoscopo(dia, 8);
                     break;
               case 9:
                  horoscopo(dia, 9);
                     break;
               case 10:
                   horoscopo(dia, 10);
                     break;
               case 11:
                   horoscopo(dia, 11);
                   break;
               case 12:
                  horoscopo(dia, 12);
                   break;
               default:
                    System.out.println("Opción no válida");
                    break;
            }
        } while (opMes<1 || opMes>12);
        return opMes;
    } //fin meses
    public static void horoscopo(int dia, int mes) {
        if ((dia>=21 && mes==4)||(dia<=21 && mes==5)) {
            System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Aries: No obtendrás ningún resultado positivo del uso de estas actitudes. \n********************************************\n");
        }else if ((dia>=21 && mes==3)||(dia<=20 && mes==4)) {
                 System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Tauro: Nada mejor que una buena rutina de ejercicios para sacar esos kilitos de más. \n********************************************\n");
            }else if ((dia>=22 && mes==5)||(dia<=21 && mes==6)) {
             System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Géminis: No dejes que recientes rachas de mala suerte afecten permanentemente la confianza en tus habilidades profesionales. \n********************************************\n");
        }else if ((dia>=22 && mes==6)||(dia<=23 && mes==7)) {
            System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Cáncer: Debes mantener en mente que las necesidades de la persona a tu lado no siempre son las mismas que las propias. \n********************************************\n");
        }else if ((dia>=24 && mes==7)||(dia<=23 && mes==8)) {
            System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Leo: No puedes obviar las necesidades de las personas que te rodean simplemente para procurar la satisfacción de las propias. \n********************************************\n");
        }else if ((dia>=24 && mes==8)||(dia<=23 && mes==9)) {
             System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Virgo: Poco a poco lograrás integrarte a tu nuevo entorno laboral. Hazte notar con tus superiores en cada oportunidad que tengas. \n********************************************\n");
        }else if ((dia>=24 && mes==9)||(dia<=23 && mes==10)) {
            System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Libra: Recuerda que la mejor publicidad para tu trabajo es un cliente satisfecho. Procura mejorar tu trato con ellos. \n********************************************\n");
        }else if ((dia>=24 && mes==10)||(dia<=22 && mes==11)) {
             System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Escorpio: En lo laboral no es momento de decisiones drásticas. Debes poner en la mesa todas las posibilidades que objetivamente posees. \n********************************************\n");
        }else if ((dia>=23 && mes==11)||(dia<=22 && mes==12)) {
             System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Sagitario: Te sentirás muy exigido por responsabilidades familiares. No cargues con más ocupaciones de las que puedes resolver. \n********************************************\n");
        }else if ((dia>=23 && mes==12)||(dia<=20 && mes==1)) {
            System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Capricornio: Estarás disconforme con varias áreas de tu vida. Tómate un respiro y evalúa objetivamente tu situación. \n********************************************\n");
        }else if ((dia>=21 && mes==1)||(dia<=19 && mes==2)) {
             System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Acuario: Tendrás que asumir decisiones, buscar nuevas estrategias para materializar tus objetivos económicos.  \n********************************************\n");
        }else if ((dia>=20 && mes==2)||(dia<=20 && mes==3)) {
             System.out.println("\n********************************************\n");
            System.out.println("Dia de Nacimiento: "+dia);
            System.out.println("Mes de Nacimiento: "+mes);
            System.out.println("Piscis: Podrás ponerle punto final a ciertas actividades que representaran una gran preocupación para ti durante la semana.  \n********************************************\n");
        }else{
             System.out.println("Datos Incorrectos");
        }
    }
}
