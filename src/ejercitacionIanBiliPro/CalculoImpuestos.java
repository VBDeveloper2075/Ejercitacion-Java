/*
* Cálculo de impuestos: En una empresa se necesita calcular el impuesto a
pagar por cada empleado según su salario anual. Si el salario es menor o
igual a $100,000, el impuesto es del 10% del salario anual; si el salario es
mayor a $100,000 pero menor o igual a $500,000, el impuesto es del 20% del
salario anual; y si el salario es mayor a $500,000, el impuesto es del 30% del
salario anual.
* */

package ejercitacionIanBiliPro;

import javax.swing.*;

public class CalculoImpuestos {
    public static void main(String[]args){
        JOptionPane.showMessageDialog(null,"Bienvenido al Calculo de Impuestos");
        int salarioAnual = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Su Salario Anual:  "));
//      ahora declaro la variable impuesto y le asigno el valor de 0
        int impuesto = 0;
//      comienzo a hacer las comparaciones para calcular el impuesto segun el salario anual
        if (salarioAnual <= 100000) {
            impuesto = (int) (salarioAnual * 0.1);
/*
        (int) antes de salarioAnual es un operador de casting (es el proceso de convertir un tipo de dato en otro, en este caso convierte el resultado de la operación a su
        derecha en un entero.)
*/
            JOptionPane.showMessageDialog(null, "Su impuesto es de: " + impuesto);
        } else if (salarioAnual > 100000 && salarioAnual <= 500000) {
            impuesto = (int) (salarioAnual * 0.2);
            JOptionPane.showMessageDialog(null, "Su impuesto es de: " + impuesto);
        } else if (salarioAnual > 500000) {
            impuesto = (int) (salarioAnual * 0.3);
            JOptionPane.showMessageDialog(null, "Su impuesto es de: " + impuesto);
        } else {
            JOptionPane.showMessageDialog(null, "No ingreso un numero");
        }
    }
}
