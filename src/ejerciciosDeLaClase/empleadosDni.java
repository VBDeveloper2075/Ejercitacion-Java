package ejerciciosDeLaClase;

//usar una coleccion de tipo Map para almacenar los datos de los empleados de una empresa: apellido y dni, luego
// ordenarlos de menor a mayor por dni y mostrarlos por pantalla

import java.util.HashMap;
import java.util.Map;

public class empleadosDni {
    public static void main(String[] args) {
        Map<String, Integer> empleados = new HashMap<>();
        empleados.put("Perez", 12345678);
        empleados.put("Gonzalez", 24654321);
        empleados.put("Gomez", 23456789);
        empleados.put("Rodriguez", 10765432);
        empleados.put("Fernandez", 34567890);

        System.out.println("Empleados ordenados por DNI:");
        empleados.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}