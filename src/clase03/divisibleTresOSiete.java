package clase03;

import java.util.Scanner;

public class divisibleTresOSiete {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar un número y determine si es 
         * divisible por dos y siete.
         */
        var scan = new Scanner(System.in);
        System.out.print("Ingrese un número-> ");
        var num = scan.nextInt();
        //Divisible en 2?
        System.out.printf("%n(%d) ¿Es divisible entre 2?", num);
        if (num%2 == 0) {
            System.out.printf("%nSÍ");
        }else{
            System.out.printf("%nNO");
        }
        //Divisible en 7?
        System.out.printf("%n(%d) ¿Es divisible entre 7?", num);
        if (num%7 == 0) {
            System.out.printf("%nSÍ");
        }else{
            System.out.printf("%nNO");
        }
        scan.close();
    }
}
