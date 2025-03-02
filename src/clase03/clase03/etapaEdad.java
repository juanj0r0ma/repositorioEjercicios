package clase03;

import java.util.Scanner;

public class etapaEdad {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar un número (va a representar la cantidad de años) y de como respuesta la etapa en la que se encuentra la persona de acuerdo con la siguiente tabla.
         * Años	Etapas
         * 0 - 5	Primera infancia
         * 6 - 11	Infancia
         * 12 - 18	Adolescencia
         * 19 - 26	Juventud
         * 27 - 59	Adultez
         * > 59	Persona mayor
         */
        var scan = new Scanner(System.in);
        System.out.print("Ingresa tu edad -> ");
        var edad = scan.nextInt();
        if (edad >= 0 && edad <= 5) {
            System.out.printf("Edad -%d- |Primera Infancia|", edad);
        }else if (edad > 5 && edad <= 11) {
            System.out.printf("Edad -%d- |Infancia|", edad);
        }else if (edad > 11 && edad <= 18){
            System.out.printf("Edad -%d- |Adolescencia|", edad);
        }else if (edad > 18 && edad <= 26) {
            System.out.printf("Edad -%d- |Juventud|", edad);
        }else if (edad > 26 && edad <=59) {
            System.out.printf("Edad -%d- |Adultez|", edad);
        }else if (edad > 59) {
            System.out.printf("Edad -%d- |Persona Mayor|", edad);
        }else{
            System.out.printf("Edad -%d- |No válida|", edad);
        }
        scan.close();
    }
}
