package ejerciciosDeLaClase;

/*
 3) Escribe un programa que calcule cuántos días laborables (sin contar fines de semana)
      entre 2 fechas.
*/

//importo libreria para usar scanner, para poder ingresar datos por consola y guardarlos en variables.
import java.util.Scanner;
//importo libreria para usar LocalDate, para poder trabajar con fechas. (java.time.LocalDate)
import java.time.LocalDate;
//importo libreria para usar ChronoUnit, para poder calcular la diferencia entre dos fechas. (java.time.temporal.ChronoUnit)
import java.time.temporal.ChronoUnit;


public class DiaLaborable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la fecha de inicio (yyyy-mm-dd): ");
//      guardo en variables las fechas ingresadas por consola. que despues las parseo a LocalDate mas abajo.
        String fechaInicio = scanner.nextLine();
        System.out.println("Ingrese la fecha de fin (yyyy-mm-dd): ");
        String fechaFin = scanner.nextLine();

//      convierto las fechas ingresadas a LocalDate y las guardo en variables parseadas porque el metodo between de
//      ChronoUnit recibe LocalDate y no String.
        LocalDate fechaInicioLocalDate = LocalDate.parse(fechaInicio);
        LocalDate fechaFinLocalDate = LocalDate.parse(fechaFin);

        long diasEntreFechas = ChronoUnit.DAYS.between(fechaInicioLocalDate, fechaFinLocalDate);

        /* System.out.println("Dias entre las fechas ingresadas: " + diasEntreFechas); */

//      creo una variable para guardar la cantidad de dias laborables entre las fechas ingresadas. y la inicializo en 0.
        long diasLaborables = 0;

//      recorro todos los dias entre las fechas ingresadas y si el dia no es sabado ni domingo, sumo un dia a la variable diasLaborables.
        for (int i = 0; i < diasEntreFechas; i++) {
            if (fechaInicioLocalDate.getDayOfWeek().getValue() != 6 && fechaInicioLocalDate.getDayOfWeek().getValue() != 7) {
//      voy sumando un dia a la variable diasLaborables
                diasLaborables++;
//      y vuelve a recorrer el for para reconocer si el nuevo dia es sabado o domingo.
            }
//      getDay0fWeek().getValue() devuelve un numero del 1 al 7, siendo 1 lunes y 7 domingo.
//      .getvalue() devuelve el valor del dia de la semana.
//      plusDays(1) suma un dia a la fecha.
            fechaInicioLocalDate = fechaInicioLocalDate.plusDays(1);
        }
        System.out.println("Dias laborables entre las fechas ingresadas: " + diasLaborables);
//      Cierro el scanner
        scanner.close();
    }
}
