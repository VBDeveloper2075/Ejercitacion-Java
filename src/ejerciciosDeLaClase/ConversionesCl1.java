/**
 * 1) Realiza las siguientes conversiones:
 *   a) De cm a mts. => {1cm = 0.01mts}
 *   b) De Celsius a Fahrenheit => {(0°C × 9/5) + 32 = 32F}
 *   c) De Dolar a Peso => {1 Dolar = 1100 Pesos}
 */

package ejerciciosDeLaClase;

import javax.swing.*;

public class ConversionesCl1 {
    public static void main(String[] args) {
        // a)
        String input = JOptionPane.showInputDialog("Introduce el número en cm que deseas pasar a m:");
        int cm = Integer.parseInt(input);
        double mts = cm * 0.01;
        JOptionPane.showMessageDialog(null, "Tu valor en metros es: " + mts);

        // b)
        String input2 = JOptionPane.showInputDialog("Introduce la temperatura en °C y la convertimos en °F:");

        try {
            int celsius = Integer.parseInt(input2);
            double fahrenheit = (celsius * 9/5) + 32;
            JOptionPane.showMessageDialog(null, "Tu valor en °F es: " + fahrenheit);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No ingresaste un número");
        }
//        int celsius = Integer.parseInt(input2);
//        double fahrenheit = (celsius * 9/5) + 32;
//        JOptionPane.showMessageDialog(null, "Tu valor en °F es: " + fahrenheit);
//        //        double celsius = 0;
////        double farenheit = (celsius * 9/5) + 32;
////        System.out.println(celsius + "°C = " + farenheit + "°F");
////

        try {
            String input3 = JOptionPane.showInputDialog("Introduce un monto en u$s y lo convertimos en $:");
            int dolar = Integer.parseInt(input3);
            double peso = dolar * 1100;
            JOptionPane.showMessageDialog(null, "Tu valor en pesos es: " + peso);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "No ingresaste un número");
        }

//        String input3 = JOptionPane.showInputDialog("Introduce un monto en u$s y lo convertimos en $:");
//        int dolar = Integer.parseInt(input3);
//        double peso = dolar * 1100;
//        JOptionPane.showMessageDialog(null, "Tu valor en pesos es: " + peso);
//        double dolar = 1;
//        double peso = dolar * 1100;
//        System.out.println(dolar + " Dolar = " + peso + " Pesos");


//        OPCION 2 FORMA DESPLEGABLE

        String[] conversiones = {
                "Introducir un número en cm y pasarlo a m:",
                "Introducir una temperatura en °C para convertirla en °F:",
                "Introducir un monto en U$s y para convertirlo en $:"
        };

        String seleccion = (String) JOptionPane.showInputDialog(null, "Elige una opción", "Conversiones",
                JOptionPane.QUESTION_MESSAGE, null, conversiones, conversiones[0]);

        switch (seleccion) {
            case "Convertir cm a m":
                String input1 = JOptionPane.showInputDialog("Introduce el número en cm que deseas pasar a m:");
                int cms = Integer.parseInt(input1);
                double mtss = cms * 0.01;
                JOptionPane.showMessageDialog(null, "Tu valor en metros es: " + mtss);
                break;

            case "Convertir Celsius a Fahrenheit":
                String input6 = JOptionPane.showInputDialog("Introduce la temperatura en °C y la convertimos en °F:");
                int celsius = Integer.parseInt(input6);
                double fahrenheit = (celsius * 9.0/5) + 32;
                JOptionPane.showMessageDialog(null, "Tu valor en °F es: " + fahrenheit);
                break;

            case "Convertir Dolar a Peso":
                String input8 = JOptionPane.showInputDialog("Introduce un monto en u$s y lo convertimos en $:");
                int dolar = Integer.parseInt(input8);
                double peso = dolar * 1100;
                JOptionPane.showMessageDialog(null, "Tu valor en pesos es: " + peso);
                break;
        }
    
    }

        // Respuestas correctas (índices de las opciones correctas)
//        int celsius=0, farenheit=(celsius * 9/5) + 32;
//        int[] respuestas = {0, (celsius + "°C = " + farenheit + "°F"), 0, 0, 0};
//
//        int puntuacion = 0;

//        for (int i = 0; i < preguntas.length; i++) {
//            String pregunta = preguntas[i];
//            String respuesta = (String) JOptionPane.showInputDialog(null, pregunta, "Quiz",
//                    JOptionPane.QUESTION_MESSAGE, null, opciones[i], opciones[i][0]);
//
//            if (respuesta.equals(opciones[i][respuestasCorrectas[i]])) {
//                puntuacion++;
//            }
//        }

//        JOptionPane.showMessageDialog(null, "Tu puntuación es: " + puntuacion);
    }

