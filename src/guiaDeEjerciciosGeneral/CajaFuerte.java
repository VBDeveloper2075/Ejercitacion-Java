/*
5 . Realiza el control de acceso a una caja fuerte donde la combinación será ingresada por teclado, un número de 4
cifras. Si no acertamos, se nos mostrará el mensaje “Lo siento, esa no es la combinación” y si acertamos se nos dirá “La caja fuerte
 se ha abierto satisfactoriamente”. Tendremos cuatro oportunidades para abrir la caja fuerte.
*/

package guiaDeEjerciciosGeneral;
import java.util.Scanner;

public class CajaFuerte {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int combinacion;
        int intentos = 0;
        do {
            System.out.println("Ingrese la combinacion de la caja fuerte: ");
            combinacion = scanner.nextInt();
            if (combinacion == 1234) {
                System.out.println("La caja fuerte se ha abierto satisfactoriamente");
                System.out.println("Fin del programa");
                System.exit(0);
            } else {
                System.out.println("Lo siento, esa no es la combinacion");
                intentos++;
            }
        } while (intentos < 4);
    }
}



        



