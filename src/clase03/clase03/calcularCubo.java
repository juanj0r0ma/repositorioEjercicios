package clase03;

import java.util.Scanner;

public class calcularCubo {
    public static void main(String[] args) {
        /*
         * Realice un programa en el que ingrese un número y muestre el cubo. 
         * Repita el proceso hasta que se introduzca un valor negativo.
         */
        var scan = new Scanner(System.in);
        var positivo = true;
        do {
            System.out.printf("%nIngrese un número-> ");
            var num = scan.nextDouble();
            if (num>= 0) {
                System.out.printf("%nEl cubo de %.1f, es %.1f", num, Math.pow(num, num));
                continue;
            }else{
                System.out.println("*Programa terminado");
                positivo = false;
            }
        } while (positivo);
        scan.close();
    }
}
