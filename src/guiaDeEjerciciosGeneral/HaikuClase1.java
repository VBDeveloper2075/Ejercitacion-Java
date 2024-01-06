package guiaDeEjerciciosGeneral;

public class HaikuClase1 {
    public HaikuClase1() {
    }

    public static void main(String[] args) {
        String haiku = "Dev Haiku.C0dig0 danz4, err0res 3nseñan,desarr0ll0 av4nza, l1neas traz4n.Desafí0s emergen, cima de saber,ideas brot4n, jardín del aprender.En binari0, crece, pr0gram4 el ser.";
        haiku = haiku.replace("0", "o").replace("4", "a").replace("3", "e").replace("1", "i");

        String textColor = "\033[0;35m"; // violeta color
        String resetColor = "\033[0m"; // Reset color

        System.out.println(textColor + "Dev Haiku" + resetColor);
        System.out.println(textColor + haiku + resetColor);
    }
}

/*
Ejercicios teóricos de la clase 1:
     1)   Explica con tus propias palabras por qué JAVA es un lenguaje de programación distinto a los demás.
Java se distingue de otros lenguajes de programación por varias razones: una vez compilado el codigo Java puede
ejecutarse en cualquier plataforma que tenga una Máquina Virtual Java (JVM), sin necesidad de recompilación.
Es completamente orientado a objetos y, por eso, facilita la gestión y mantenimiento de sistemas de software
complejos. Tambien puede manejar la asignación y desasignación de memoria automáticamente a través de su recolector de
basura, reduciendo el riesgo de fugas de memoria.  Tiene un conjunto rico de APIs para realizar diferentes tareas como
redes, conexión a bases de datos, utilidades, análisis de XML, etc.  Permite el desarrollo de aplicaciones altamente
interactivas y responsivas gracias a su caracteristica multihilo. Y su comunidad activa es muy amplia, lo que significa
que la ayuda y los recursos están fácilmente disponibles.
      2)  ¿Nuestro proyecto JAVA es dependiente de algún sistema operativo en particular? Justifica.
No, porque el código Java se compila en un formato de byte-code que puede ser ejecutado por cualquier máquina virtual
      3)  ¿Cuál es la principal diferencia entre las variables ‘primitivas’ y ‘de referencia’?
Las variables primitivas son aquellas que almacenan valores simples, como números enteros, decimales, caracteres, etc
. En cambio, las variables de referencia son aquellas que almacenan direcciones de memoria de objetos. Es decir, son
objetos, y no valores simples. Que ademas tienen metodos predeterminados que ayudan mucho al programador.
      4)  Enumera 3 proyectos en los que propondría JAVA para llevar a cabo su desarrollo.
Desarrollo de juegos para android, desarrollo de aplicaciones web como el homebanking, desarrollo de aplicaciones
móviles.
      5)  Arregla este  ‘Haiku (Recuerda poner el título con algún color que te guste) y disfruta el mensaje’:
        “Dev Haiku.C0dig0 danz4, err0res 3nseñan,desarr0ll0 av4nza, l1neas traz4n.Desafí0s emergen, cima de saber,ideas brot4n, jardín del aprender.En binari0, crece, pr0gram4 el ser.”
        */
