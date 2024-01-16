/*
* Crea un programa que simule un juego con las siguientes particularidades:
a)	Se debe ingresar por teclado un número entero positivo.
b)	El jugador comienza con 0 puntos.
c)	Si el número ingresado es un cuadrado perfecto:
i)	El jugador gana 4 puntos.
ii)	Se mostrará el mensaje "Es un cuadrado perfecto, ganas 4 puntos. Puntos actuales: x".
d)	Si no es un cuadrado perfecto:
i)	El jugador pierde 2 puntos.
ii)	Se mostrará el mensaje "No es un cuadrado perfecto, pierdes 2 puntos. Puntos actuales: x".
e)	Cada nuevo número ingresado debe ser mayor al anterior.
f)	El juego termina cuando el jugador alcanza los 30 puntos.
g)	Si los puntos caen por debajo de 0, la partida también termina.
* */

import java.util.Scanner;
import java.lang.Math;


public class Juego {
    public static void main(String[] args) {
        //le pido al usuario que ingrese un numero entero positivo
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo:  ");
        //guardo el numero ingresado en una variable
        int n = scanner.nextInt();
        int puntos = 0;
        int i = 1;
        //mientras el numero ingresado sea mayor a 0 y menor a 30 hago el for while para que se repita las siguientes
        // operaciones
        while (puntos < 30 && puntos >= 0) {
            if (Math.sqrt(n) % 1 == 0) {
                puntos += 4;
                System.out.println("Es un cuadrado perfecto, ganas 4 puntos. Puntos actuales: " + puntos);
            } else {
                puntos -= 2;
                System.out.println("No es un cuadrado perfecto, pierdes 2 puntos. Puntos actuales: " + puntos);
            }
            //le pido al usuario que ingrese un numero entero positivo mayor al anterior
            System.out.println("Ingrese un numero entero positivo mayor al anterior:  ");
            n = scanner.nextInt();
            //le sumo 1 a la variable i para que el while se repita
            i++;
        }
        //si los puntos son mayores o iguales a 30 imprimo "Ganaste!" y si no  "Perdiste!"
        if (puntos >= 30) {
            System.out.println("Ganaste!");
        } else {
            System.out.println("Perdiste!");
        }
    }
}
