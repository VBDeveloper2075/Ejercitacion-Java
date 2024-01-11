//3) Declara 2 variables y  muestre el resultado de las siguientes comparaciones:
//        *    a) Igualdad
//        *    b) Desigualdad
//        *    c) Mayor que
//        *    d) Menor que
//        *    e) Mayor o igual que
//        *    f) Menor o igual que

package ejerciciosDeLaClase;

public class ComparacionesNumericas {
    public static void main(String[] args) {
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
    }
}
