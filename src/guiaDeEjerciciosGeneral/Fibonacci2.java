/*
* Implementa un programa que genere e imprima la serie de Fibonacci hasta el término n ingresado por el usuario. Utiliza operadores y estructuras de control de manera eficiente.
* */

import java.util.Scanner;

public class Fibonacci2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros de la serie Fibonacci que desea obtener:  ");
        String num = scanner.nextLine();
        int n = Integer.parseInt(num);

        int t1 = 0, t2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(t1 + ", ");

            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
        }
    }
}
