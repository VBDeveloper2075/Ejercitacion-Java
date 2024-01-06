/*
Escribir un algoritmo que permita calcula el indice de masa corporal ingresando peso y altura.
*/

package nivelatorio;

import java.util.Scanner;

public class MasaCorporal {

    static float calcularIndMaCorporal(float peso, float altura){
        return peso/(altura*altura);
    }

    public static void main(String[] args){
        float peso;
        float altura;
        float imCorporal;
        Scanner scan=new Scanner(System.in);

        System.out.println("\n\n Bienvenido a la Calculadora de Masa Corporal \n Ingresa los datos solicitados: ");
        System.out.println("\n Ingresa tu Peso en kg:  ");
        peso= scan.nextFloat();
        System.out.println("\n Ingresa tu Altura en m:  ");
        altura= scan.nextFloat();

        imCorporal=calcularIndMaCorporal(peso,altura);

        System.out.println("\n Su indice de masa corporal es:  " + imCorporal);

        if (imCorporal<20){
            System.out.println("Usted se encuentra en Mal Estado dijo Misa");
        }else if (imCorporal<22){
            System.out.println("Usted se encuentra en Bajo de Peso");
        }else if (imCorporal<25){
            System.out.println("Usted se encuentra en su Peso Normal");
        }else if (imCorporal<30){
            System.out.println("Usted se encuentra con Sobrepeso");
        }else if (imCorporal<40){
            System.out.println("Usted se encuentra con Sobrepeso Cronico");
        }else {
            System.out.println("Usted debe ser Hospitalizado");
        }
    }
}
