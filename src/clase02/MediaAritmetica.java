package clase02;

import java.util.Scanner;

public class MediaAritmetica {
    public static void main(String[] args) {
        /*
         * Crea un programa que calcule la media aritmética de tres números 
         * introducidos por el usuario.
         */
        var scan = new Scanner(System.in);
        //Solicitud de datos
        System.out.print("Ingrese el numero 1-> ");
        var num1 = scan.nextInt();
        System.out.print("Ingrese el numero 2-> ");
        var num2 = scan.nextInt();
        System.out.print("Ingrese el numero 3-> ");
        var num3 = scan.nextInt();
        //Impresion y calculo de media
        System.out.printf("""
                Numeros recibidos:
                > %d
                > %d
                > %d
                Media Aritmetica = %.2f
                """, num1, num2, num3, (num1+num2+num3)/3f);
        scan.close();
    }
}
