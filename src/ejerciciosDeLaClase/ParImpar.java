//2) Declarar un numero y mostrar si es par o impar usando el operador 'ternario'

package ejerciciosDeLaClase;

public class ParImpar {
    public static void main(String[] args) {
        int numero = 5;
        String parImpar = (numero % 2 == 0 ? "par" : "impar");
        System.out.println(numero + " es " + parImpar);
    }
}
