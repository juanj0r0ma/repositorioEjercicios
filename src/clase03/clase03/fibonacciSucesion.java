package clase03;

import java.util.Scanner;

public class fibonacciSucesion {
    public static void main(String[] args) {
        /*
         * Esta sucesión comienza con los números 0 y 1. El siguiente miembro se 
         * calcula como la suma de los dos inmediatamente anteriores.
         * Crea un programa reciba un número (N) del usuario y muestre los primeros N 
         * números de sucesión.
         * 0, 1, 1, 2, 3, 5, 8, 13, 21...
         */
        var scan = new Scanner(System.in);
        var pasado = 0;
        var nuevo = 0;
        System.out.printf("%nIngrese un número -> ");
        var num = scan.nextInt();
        for(var i=0; i<num; i++){
            if (num<=0) {
                System.out.printf("Opción no válida");
            }else{
                if (nuevo==0) {
                    System.out.printf("%d", pasado);
                    nuevo++;
                }else{
                    nuevo = pasado + nuevo;
                    pasado = nuevo;
                    System.out.printf(", %d", nuevo);
                }
            }
        }
        scan.close();
    }
}
