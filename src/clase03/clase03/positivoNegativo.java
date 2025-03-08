package clase03;

import java.util.Scanner;

public class positivoNegativo {
    public static void main(String[] args) {
        /*
         * Escriba un programa en el que ingrese un número y le diga si es positivo 
         * o negativo. Repita el proceso hasta que se ingrese el número cero.
         */
        var scan = new Scanner(System.in);
        var noCero = true;
        do {
            System.out.printf("%nIngrese un número -> ");
            var num = scan.nextInt();
            if (num==0) {
                System.out.println("Programa finalizado..."); 
                System.exit(0);
            }else{
                System.out.print("----------------------");
                System.out.printf("%nNúmero       Tipo");
                if (num > 0) {
                    System.out.printf("%n  %d           +", num);
                }else{
                    System.out.printf("%n  %d           -", num);
                }
                System.out.printf("%n----------------------");
            }
        } while (noCero);
        scan.close();
    }
}
