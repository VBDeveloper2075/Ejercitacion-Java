/*
Crea una aplicación que pida un número por teclado y después comprobaremos si el número introducido es capicúa, es decir, que se lee igual sin importar la dirección.
        Por ejemplo, si introducimos 30303 es capicúa, si introducimos 30430 no es capicua. Piensa cómo puedes dar la vuelta al número.
        TIP: Una forma de pasar un número a un array es esta Character.getNumericValue(cadena.charAt(posicion)).
*/

package ejercicios;
import javax.swing.*;
import java.lang.Object;    // Para usar el método toString

public class capicua {

    static int esCapicua(int numero){
        return (numero);
    }

    public static void main(String[] args) {
        String numero = JOptionPane.showInputDialog("Ingrese un numero: ");
        StringBuilder sb = new StringBuilder(numero);
        String numero2 = sb.reverse().toString();

        if (numero.equals(numero2)){
            System.out.println("El numero " + numero + " es capicua");
        } else {
            System.out.println("El numero " + numero + " no es capicua");
        }
    }
}
