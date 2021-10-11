package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Sintaxis de Switch
	/*  switch(condicion){
        case 1:
            codigo
                    break;
        case 2:
            codigo
                    break;
            default;
            break; */



        //Ejercicio de Calculadora

       /* Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa un número");
        int numero1 = sc.nextInt();
        System.out.println("Ingresa otro número");
        int numero2 = sc.nextInt();
        System.out.println("Ingresa la operación deseada:\n1) Suma \n2) Resta" + " \n3) Multiplicacion \n4) División" );
        int operacion = sc.nextInt();
        sc.nextLine();
        float resultado = 0;

        switch(operacion){
            case 1:
                resultado = numero1 + numero2;
                break;
            case 2:
                resultado = numero1 - numero2;
                break;
            case 3:
                resultado = numero1 * numero2;
            case 4:
                resultado = numero1 / numero2;
                break;
            default:
                System.out.println("La operación que seleccionaste es inválida");
                break;
        }

        System.out.println(resultado);
    */
        //// Pedir un número al usuario y dependiendo la respuesta
        // mostrar un día de la semana, ejemplo: 1) Domingo, 2) Lunes ... 7)Sábado
        // Si elige un número fuera de ese rango mostar un mensaje de error;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresa un número");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                num = 1;
                System.out.println("Lunes");
                break;
            case 2:
                num = 2;
                System.out.println("Martes");
                break;
            case 3:
                num = 3;
                System.out.println("Miércoles");
                break;
            case 4:
                num = 4;
                System.out.println("Jueves");
                break;
            case 5:
                num = 5;
                System.out.println("Viernes");
                break;
            case 6:
                num = 6;
                System.out.println("Sábado");
                break;
            case 7:
                num = 7;
                System.out.println("Domingo");
                break;
            default:
                System.out.println("ERROR");

        }

    }
}
