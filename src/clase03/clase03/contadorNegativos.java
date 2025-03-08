package clase03;

import java.util.Scanner;

public class contadorNegativos {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar un número mientras estos 
         * sean negativos. Detener cuando el número ingresado sea positivo y 
         * de cómo resultado la cantidad de números negativos ingresados.
         */
        var scan = new Scanner(System.in);
        var seguir = true;
        var contador = 1;
        do {
            System.out.printf("%nIngresar un número -> ");
            var num = scan.nextInt();
            if (num >= 0) {
                System.out.printf("%nPrograma finalizado...");
                System.out.printf("%nNúmeros ingresados hasta terminar = %d", contador);
                seguir = false;
            }else{
                contador++;
            }
        } while (seguir);
        scan.close();
    }
}
