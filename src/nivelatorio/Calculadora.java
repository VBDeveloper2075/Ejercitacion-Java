/*
Realizar un programa que simule una calculadora, donde realice las operaciones básicas (suma, resta, multiplicación, división), el usuario debe primero ingresar dos valores, y especificar con un carácter la operación a realizar.
 */

package nivelatorio;
import javax.swing.*;

public class Calculadora {
        public static void main(String[] args) {
                String strNum1 = JOptionPane.showInputDialog("Ingrese el primer numero: ");
                String strNum2 = JOptionPane.showInputDialog("Ingrese el segundo numero: ");
                String operacion = JOptionPane.showInputDialog("Ingrese la operacion a realizar (+, -, *, /): ");

                double num1 = Double.parseDouble(strNum1);
                double num2 = Double.parseDouble(strNum2);
                double resultado;

                switch (operacion) {
                        case "+":
                                resultado = num1 + num2;
                                break;
                        case "-":
                                resultado = num1 - num2;
                                break;
                        case "*":
                                resultado = num1 * num2;
                                break;
                        case "/":
                                if (num2 != 0) {
                                        resultado = num1 / num2;
                                } else {
                                        JOptionPane.showMessageDialog(null, "Error: Division por cero");
                                        return;
                                }
                                break;
                        default:
                                JOptionPane.showMessageDialog(null, "Operacion no reconocida");
                                return;
                }

                JOptionPane.showMessageDialog(null, "El resultado de la operacion es: " + resultado);
        }
}
