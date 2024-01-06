/*
Declara una variable ‘hora’ de tipo ‘int’ y que muestra los buenos días, buenas tardes o buenas noches según la hora. Se utilizarán los tramos de 6 a 12, de 13 a 20 y de 21 a 5. respectivamente. Sólo se tienen en cuenta las horas, los minutos no se deben usar.
*/

package guiaDeEjerciciosGeneral;

import javax.swing.*;

public class SaludoDiarioClase2 {
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("Por favor, ingrese la hora (formato de 24 horas):");
        int hora = Integer.parseInt(input);

        String textColor = "\033[0;33m"; // Amarillo color
        String resetColor = "\033[0m"; // Reset color

        if (hora >= 6 && hora <= 12) {
            System.out.println(textColor + "Buenos días" + resetColor);
        } else if (hora >= 13 && hora <= 20) {
            System.out.println(textColor + "Buenas tardes" + resetColor);
        } else if ((hora >= 21 && hora <= 24) || (hora >= 0 && hora <= 5)) {
            System.out.println(textColor + "Buenas noches" + resetColor);
        } else {
            System.out.println(textColor + "Hora no válida" + resetColor);
        }
    }
}
