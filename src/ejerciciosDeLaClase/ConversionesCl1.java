/**
 *                                        //-- EJERCITACION DE CLASE --//
 * --Realizar la ejercitacion sobre el este main.
 * 1) Realiza las siguientes conversiones:
 *   a) De cm a mts. => {1cm = 0.01mts}
 *   b) De Celsius a Farenheit => {(0°C × 9/5) + 32 = 32F}
 *   c) De Dolar a Peso => {1 Dolar = 1100 Pesos}
 * 2) Declarar un numero y mostrar si es par o impar usando el operador 'ternario'
 * 3) Declara 2 variables y  muestre el resultado de las siguientes comparaciones:
 *    a) Igualdad
 *    b) Desigualdad
 *    c) Mayor que
 *    d) Menor que
 *    e) Mayor o igual que
 *    f) Menor o igual que
 *4) Enseñar las tablas de multiplicar del 1 al 10
 */
package ejerciciosDeLaClase;

public class ConversionesCl1 {
    public static void main(String[] args) {
        // 1)
        // a)
        int cm = 100;
        double mts = cm * 0.01;
        System.out.println(cm + "cm = " + mts + "mts");
        // b)
        double celsius = 0;
        double farenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + "°C = " + farenheit + "°F");
        // c)
        double dolar = 1;
        double peso = dolar * 1100;
        System.out.println(dolar + " Dolar = " + peso + " Pesos");

        // 2)
        int numero = 5;
        String parImpar = numero % 2 == 0 ? "par" : "impar";
        System.out.println(numero + " es " + parImpar);

        // 3)
        int a = 5;
        int b = 10;
        // a)
        System.out.println(a + " == " + b + " => " + (a == b));
        // b)
        System.out.println(a + " != " + b + " => " + (a != b));
        // c)
        System.out.println(a + " > " + b + " => " + (a > b));
        // d)
        System.out.println(a + " < " + b + " => " + (a < b));
        // e)
        System.out.println(a + " >= " + b + " => " + (a >= b));
        // f)
        System.out.println(a + " <= " + b + " => " + (a <= b));

        // 4)
        for (int i = 1; i <= 10; i++) {
            System.out.println("Tabla del " + i);
            for (int j = 1; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
        }
    }
}
