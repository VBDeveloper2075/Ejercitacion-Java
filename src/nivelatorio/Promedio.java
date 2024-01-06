/*
Escribir un algoritmo que permita calcula el promedio de tres notas. Si es menor a 6 muestre:Reprobado, si es mayor que 6 y menor que 9:Aprobado, si es mayor que 9: Sobresaliente.
*/

package nivelatorio;

import java.util.Scanner;

public class Promedio {

    static int calcularPromedio(int nota1, int nota2, int nota3){
        return (nota1+nota2+nota3)/3;    //esto me lo dijo Juan, para ahorrar espacio
    }

    public static void main(String[] args) {
        int nota1, nota2, nota3, tuPromedio;
        Scanner scan=new Scanner(System.in);

        System.out.println("\n\nAQUI CALCULAS EL PROMEDIO DE TU CURSO DE JAVA \n Haz click en Enter e Ingresa tus notas en numeros enteros: ");
        System.out.println("\n INGRESE SUS TRES NOTAS:  ");
        nota1= scan.nextInt();
        nota2= scan.nextInt();
        nota3= scan.nextInt();

        tuPromedio=calcularPromedio(nota1,nota2,nota3);

        System.out.println("\n Tu promedio es:  " + tuPromedio);

        if (tuPromedio<6){
            System.out.println("Reprobado");
        }else if (tuPromedio<9){
            System.out.println("Aprobado");
        }else {
            System.out.println("Sobresaliente");
        }
    }

}
