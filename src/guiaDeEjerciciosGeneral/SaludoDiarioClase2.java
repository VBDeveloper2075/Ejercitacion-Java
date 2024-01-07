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

/*
Ejercicios teóricos de la clase 2:
1) Clasifica y menciona al menos 2 ejemplos de Operadores.
dos ejemplos de operadores son:

Operador aritmético: %
El operador módulo (%) devuelve el resto de una división. Por ejemplo, 10 % 3 devuelve 1 porque
10 dividido por 3 es 3 y sobra 1. En gral se usa para ver si un númeroes par o impar.

Operador de asignación %=
Se trata de un operador de asignación compuesto que toma el módulo del operando del lado
izquierdo por el operando del lado derecho y luego asigna el resultado al operando del lado izquierdo. Por ejemplo:

int a = 10; // asignamos el valor 10 a la variable 'a'
a %= 3; // a ahora es 1, porque 10 modulo 3 es 1
System.out.println(a); // imprimirá 1
es como hacer la siguiente operación: a = a % 3  pero de forma resumida.

2) ¿Cual es la principal diferencia entre las sentencias ‘if’ y switch?
La principal diferencia es que la sentencia if permite evaluar cualquier tipo de expresión booleana, mientras que la
sentencia switch solo permite evaluar los posibles valores de una sola variable.

3) Explica con tus palabras el funcionamiento de la estructura de control de iteración ‘foreach’.
   El bucle foreach en Java se utiliza para iterar sobre elementos de una colección (como un arreglo o una lista) sin necesidad de conocer la longitud de la misma.
 Es una forma de "solo lectura" de iterar a través de una colección o array, ya que no se puede modificar la durante la iteración, porque no tiene condicion.
 */
