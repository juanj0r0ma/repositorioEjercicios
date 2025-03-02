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
        var precioUnidad = 0.0;
        System.out.print("Ingrese el número de camisas a comprar-> ");
        var numC = scan.nextInt();
        //Determinación precio Unidad
        if (numC > 0 && numC <= 50) {
            precioUnidad = 50_000;
        }else if (numC > 50 && numC <= 100) {
            precioUnidad = 45_000;
        }else if (numC > 100 && numC <= 150) {
            precioUnidad = 40_000;
        }else if (numC > 150 && numC <= 200) {
            precioUnidad = 35_000;
        }else if (numC > 200) {
            precioUnidad = 25_000;
        }else{
            System.out.println("Cantidad no válida");
        }
        //Calcular precio Pedido
        System.out.println("Resumen Pedido");
        System.out.print("_______________");
        System.out.printf("%nNúmero Unidades = %d", numC);
        System.out.printf("%nPrecio Unidad = %.2f", precioUnidad);
        var precio = numC*precioUnidad;
        System.out.printf("%nTotal a pagar = $%.2f", precio);
        scan.close();
    }
}
