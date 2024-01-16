package nivelatorio;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int x = 3;
        int index = Arrays.binarySearch(array, x);

        if (index >= 0) {
            System.out.println("El número " + x + " se encuentra en el índice " + index + ".");
        } else {
            System.out.println("El número " + x + " no se encontró en el array.");
        }
    }
}

