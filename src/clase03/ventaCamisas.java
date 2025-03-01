package clase03;

import java.util.Scanner;

public class ventaCamisas {
    public static void main(String[] args) {
        /*
         * Un vendedor al por mayor de camisas ofrece diferentes precios de acuerdo 
         * a la cantidad de unidades que le compren. La siguiente tabla muestra la 
         * información:
         * 
         * Unidades	Precio por unidad
         * [1 - 50]	$50.000
         * (50 - 100]	$45.000
         * (100 - 150]	$40.000
         * (150 - 200]	$35.000
         * > 200	$25.000
         * Escriba un programa que dado un número de camisas retorne el precio por 
         * unidad.
         */
        var scan = new Scanner(System.in);
        System.out.print("Ingrese el número de camisas a comprar-> ");
        var numC = scan.nextInt();
        if (numC > 0 && numC <= 50) {
            
        }
        scan.close();
    }
}
