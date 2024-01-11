//  4) Enseñar las tablas de multiplicar del 1 al 10

package ejerciciosDeLaClase;

public class TablasDeMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print("\nTabla del " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.print("\n" + i + " x " + j + " = " + (i * j));
            }
        }
    }
}
