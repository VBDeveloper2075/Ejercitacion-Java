/*
Crea una aplicación que pida un número por teclado y después comprobaremos si el número introducido es capicúa, es decir, que se lee igual sin importar la dirección.
        Por ejemplo, si introducimos 30303 es capicúa, si introducimos 30430 no es capicua. Piensa cómo puedes dar la vuelta al número.
        TIP: Una forma de pasar un número a un array es esta Character.getNumericValue(cadena.charAt(posicion)).
*/

package nivelatorio;
import javax.swing.*;

public class Capicua {

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Ingrese un numero: ");
        StringBuilder sb = new StringBuilder(numero);
        String numero2 = sb.reverse().toString();

        if (numero.equals(numero2)){
            JOptionPane.showMessageDialog(null, "El numero " + numero + " es capicua");
        } else {
            JOptionPane.showMessageDialog(null, "El numero " + numero + " no es capicua");
        }

    }
}
