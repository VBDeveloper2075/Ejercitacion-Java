package guiaDeEjerciciosGeneral;

import javax.swing.*;

/*
	Implementa un programa que calcule las estadísticas en un rango dado
    (sumas de números primos, números no primos, sumas totales, cantidad de números del rango,promedio).
    Utiliza estructuras de control y operadores adecuados.
* */
public class Estadisticas {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido al programa de estadísticas");
        int min = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número mínimo del rango:"));
        int max = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número máximo del rango:"));
        int sumPrimos = 0;
        int sumNoPrimos = 0;
        int sumTotal = 0;
        int cantNum = 0;
        int promedio = 0;


        for (int i = min; i <= max; i++) {
            if (esPrimo(i)) {
                sumPrimos += i;
            } else {
                sumNoPrimos += i;
            }
            sumTotal += i;
            cantNum++;
        }
        promedio = sumTotal / cantNum;

        System.out.println("Suma de numeros primos: " + sumPrimos);
        System.out.println("Suma de numeros no primos: " + sumNoPrimos);
        System.out.println("Suma total: " + sumTotal);
        System.out.println("Cantidad de numeros: " + cantNum);
        System.out.println("Promedio: " + promedio);
    }

    public static boolean esPrimo(int num) {
        boolean esPrimo = true;
        int contador = 2;

        while ((esPrimo) && (contador != num)) {
            if (num % contador == 0) {
                esPrimo = false;
            }
            contador++;
        }
        return esPrimo;
    }
}
