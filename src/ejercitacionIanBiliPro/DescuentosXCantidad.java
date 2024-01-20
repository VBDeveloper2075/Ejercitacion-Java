/*
Una tienda ofrece descuentos por cantidad en la compra de un producto. Si se compran menos de 10 unidades, no hay
descuento; si se compran entre 10 y 50 unidades, hay un descuento del 5%; si se compran entre 51 y 100 unidades, hay un descuento del 10%; y si se compran más de 100 unidades, hay un descuento del 15%.
*/



package ejercitacionIanBiliPro;

import javax.swing.*;

public class DescuentosXCantidad {

    static void precioFinalYDescuento(float preciofinal, float descuento){
        JOptionPane.showMessageDialog(null, "El precio final fue de " + preciofinal + " y obtuvo un descuento del " + descuento + "%");
    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Bienvenido Nuestra Tienda de Comics");
        float comics = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad de Comics que desea comprar:  "));
        final float precioCadaComit=20;
        float preciofinal;

//      ahora declaro la variable descuento y le asigno el valor de 0
        float descuento;

//      comienzo a hacer las comparaciones para calcular el descuento segun la cantidad de comics que compra el usuario.
        if (comics > 0 && comics < 10) {

        } else if (comics > 9 && comics < 51) {
            preciofinal = precioCadaComit*comics;
            descuento = (float) (preciofinal*0.05);
            precioFinalYDescuento(preciofinal,descuento);
        } else if (comics > 50 && comics < 101) {
            JOptionPane.showMessageDialog(null, "Exelente! Tenemos para Usted un Descuento de un 10% !");
        }else if (comics < 0) {
                JOptionPane.showMessageDialog(null, "Por favor ingrese el numero de comics correctamente");
        } else if (comics > 101) {
            JOptionPane.showMessageDialog(null, "Felicidades! Tenemos para Usted un Descuento de un 15% !");
        }
    }
}
