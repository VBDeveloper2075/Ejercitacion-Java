/*
Escribir un programa que genere un número aleatorio entre 1 y 100, y permita
al usuario adivinar el número. El programa debe indicar si el número adivinado
es mayor o menor que el número generado, hasta que el usuario adivine
correctamente.
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String user;

        Scanner scan = new Scanner(System.in);

        user= scan.nextLine();

        System.out.println("Hello " + user);


    }
}