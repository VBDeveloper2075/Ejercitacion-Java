/*
Realiza un mini cuestionario con 5 preguntas tipo test. Cada pregunta acertada sumará un punto. El programa mostrará al final la calificación obtenida.
*/

package guiaDeEjerciciosGeneral;
import javax.swing.JOptionPane;

public class JuegoPreguntasClase2 {

    public static void main(String[] args) {
            // Preguntas
        String[] preguntas = {
                    "¿Cuál es la capital de Francia?",
                    "¿Cuál es la capital de España?",
                    "¿Cuál es la capital de Italia?",
                    "¿Cuál es la capital de Alemania?",
                    "¿Cuál es la capital de Portugal?"
        };

            // Opciones de respuesta
        String[][] opciones = {
                    {"Paris", "Madrid", "Roma"},
                    {"Lisboa", "Madrid", "Berlin"},
                    {"Roma", "Paris", "Lisboa"},
                    {"Berlin", "Madrid", "Paris"},
                    {"Lisboa", "Roma", "Berlin"}
        };

        // Respuestas correctas (índices de las opciones correctas)
        int[] respuestasCorrectas = {0, 1, 0, 0, 0};

        int puntuacion = 0;

        for (int i = 0; i < preguntas.length; i++) {
            String pregunta = preguntas[i];
            String respuesta = (String) JOptionPane.showInputDialog(null, pregunta, "Quiz",
                    JOptionPane.QUESTION_MESSAGE, null, opciones[i], opciones[i][0]);

            if (respuesta.equals(opciones[i][respuestasCorrectas[i]])) {
                puntuacion++;
            }
        }

            JOptionPane.showMessageDialog(null, "Tu puntuación es: " + puntuacion);
    }

}
