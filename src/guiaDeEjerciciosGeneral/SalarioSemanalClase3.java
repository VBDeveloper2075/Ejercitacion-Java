/*
Clase3
Temas
Entrada y salida de datos.[Clase Scanner, Clase JOptionPane, SOUT].
Ejercicios
1 . Entre la clase Scanner y la clase JOptionPane. ¿Cuál crees que consumirá menos recursos?¿Por qué?
....Scanner consume menos recursos porque no necesita importar ninguna libreria all no usar una interfaz gráfica de usuario (GUI). JOptionPane necesita importar la libreria javax.swing.

2 . Explica con tus palabras ventajas y desventajas de usar Scanner o JOptionPane
....Scanner: Ventajas: No necesita importar ninguna libreria. Desventajas: No es tan amigable para el usuario.
....JOptionPane: Ventajas: Es mas amigable para el usuario. Desventajas: Necesita importar la libreria javax.swing, por lo que consume mas recursos.

3 . ¿Puedo imprimir un objeto en pantalla con SOUT directamente?
....System.out ofrece varios métodos para imprimir datos en la consola, como println, print, y printf.
Se pueden imprimir objetos utilizando su método toString(). Si tienes una clase personalizada, puedes sobrescribir el  método toString() para controlar cómo se imprime el objeto.

4 . Escribe un programa que calcule el salario semanal de un trabajador teniendo en cuenta que las horas ordinarias (40 primeras horas de trabajo) se pagan a 12 euros la hora. A partir de la hora 41, se pagan a 16 euros la hora(Se recibe las horas totales por teclado).
*/

package guiaDeEjerciciosGeneral;

import javax.swing.*;

public class SalarioSemanalClase3 {
    public static void main(String[] args) {
        int horasTrabajadas;
        int horasOrdinarias = 40;
        int horasExtra;
        JOptionPane.showMessageDialog(null, "Calculo de Salario Semanal");
        do {
            horasTrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas trabajadas:  "));
            if (horasTrabajadas > 0 && horasTrabajadas <= horasOrdinarias) {
                JOptionPane.showMessageDialog(null, "Usted trabajo: " + horasTrabajadas + " horas. Su salario semanal es de: " + (horasTrabajadas * 12) + " €. No tiene horas extra.");
            } else if (horasTrabajadas > horasOrdinarias){
                horasExtra = horasTrabajadas - horasOrdinarias;
                JOptionPane.showMessageDialog(null, "Usted trabajo: " + horasTrabajadas + " horas. El salario semanal es de: " + ((horasOrdinarias * 12) + (horasExtra * 16)) + " €. Tiene " + horasExtra + " horas extra.");
            }else{
                JOptionPane.showMessageDialog(null, "Por favor ingrese el numero de horas correctamente");
            }
        } while (horasTrabajadas <= 0);
    }

}

