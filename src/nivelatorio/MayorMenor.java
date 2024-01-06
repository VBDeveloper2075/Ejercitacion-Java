/*
Realizar un programa que indique el mayor y menor de 5 valores numericos
*/

package nivelatorio;

import java.util.Scanner;

public class MayorMenor {
    public static void main(String[] args) {
        int num1, num2, num3, num4, num5;

        Scanner scan=new Scanner(System.in);

        System.out.println("\n\n QUE NUMERO ES MAYOR y CUAL ES MENOR? \n Ingresa tus 5 números: ");
        System.out.println("luego de cada numero pulsa enter y luego escribe el siguiente:  ");
        num1= scan.nextInt();
        num2= scan.nextInt();
        num3= scan.nextInt();
        num4= scan.nextInt();
        num5= scan.nextInt();

        if (num1>num2 && num1>num3 && num1>num4 && num1>num5){
            System.out.println("El numero mayor es: " + num1);
        }else if (num2>num1 && num2>num3 && num2>num4 && num2>num5){
            System.out.println("El numero mayor es: " + num2);
        }else if (num3>num1 && num3>num2 && num3>num4 && num3>num5){
            System.out.println("El numero mayor es: " + num3);
        }else if (num4>num1 && num4>num2 && num4>num3 && num4>num5){
            System.out.println("El numero mayor es: " + num4);
        }else if(num5>num1 && num5>num2 && num5>num4 && num5>num3){
            System.out.println("El numero mayor es: " + num5);
        }

        if (num1<num2 && num1<num3 && num1<num4 && num1<num5){
            System.out.println("El numero menor es: " + num1);
        }else if (num2<num1 && num2<num3 && num2<num4 && num2<num5){
            System.out.println("El numero menor es: " + num2);
        }else if (num3<num1 && num3<num2 && num3<num4 && num3<num5){
            System.out.println("El numero menor es: " + num3);
        }else if (num4<num1 && num4<num2 && num4<num3 && num4<num5){
            System.out.println("El numero menor es: " + num4);
        }else if(num5<num1 && num5<num2 && num5<num4 && num5<num3){
            System.out.println("El numero menor es: " + num5);
        }

 }

    }
        


