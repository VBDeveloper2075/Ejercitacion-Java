/*
* Desarrolla un programa que reciba el nombre completo de un usuario y su fecha de nacimiento. Utiliza la clase String para extraer el primer nombre y la clase LocalDate para calcular la edad del usuario.
* */

import java.util.Scanner;
import java.time.LocalDate;

public class Fecha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre:  ");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese su apellido:  ");
        String apellido = scanner.nextLine();
        System.out.println("Ingrese su fecha de nacimiento (YYYY-MM-DD):  ");
        String fechaNacimiento = scanner.nextLine();
        String[] fecha = fechaNacimiento.split("-");
        int anio = Integer.parseInt(fecha[0]);
        int mes = Integer.parseInt(fecha[1]);
        int dia = Integer.parseInt(fecha[2]);

        String fechaActual = LocalDate.now().toString();

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Edad: " + (2024 - anio));
        System.out.println("Fecha actual: " + fechaActual);
    }
}
