package guiaDeEjerciciosGeneral;

import javax.swing.JOptionPane;

public class Fibonacci {
        public static void main(String[] args) {
            String input = JOptionPane.showInputDialog("Introduce el número de términos de la serie de Fibonacci que deseas ver:");
            int n = Integer.parseInt(input);

            int t1 = 0, t2 = 1;
            for (int i = 1; i <= n; ++i) {
                System.out.print(t1 + ", ");

                int sum = t1 + t2;
                t1 = t2;
                t2 = sum;
            }
        }
}
