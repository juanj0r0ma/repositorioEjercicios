package clase03;

import java.util.Scanner;

public class unirNumeros {
    public static void main(String[] args) {
        /*
         * Escriba una función en la que pueda ingresar tres números enteros y diferentes. Imprima estos valores en orden ascendente.
         * Por ejemplo:
         * 
         * Input : 3 , 100 , 1
         * Output : 13100
         * Tenga en cuenta que la respuesta es un texto. 
         * Los números los puede concatenar.
         */
        var scan = new Scanner(System.in);
        var menor = 0;
        var medio = 0;
        var alto = 0;
        System.out.print("Ingrese el primer número-> ");
        var num1 = scan.nextInt();
        System.out.print("Ingrese el segundo número-> ");
        var num2 = scan.nextInt();
        System.out.print("Ingrese el tercer número-> ");
        var num3 = scan.nextInt();
        //Ordenamiento
        if (num1<num2 && num1<num3) {
            menor = num1;
        }else if (num1 > num2 && num1 > num3) {
            alto = num1;
        }else{
            medio = num1;
        }
        if (num2<num1 && num2<num3) {
            menor = num2;
        }else if (num2 > num1 && num2 > num3) {
            alto = num2;
        }else{
            medio = num2;
        }
        if (num3<num2 && num3<num2) {
            menor = num3;
        }else if (num3 > num2 && num3 > num2) {
            alto = num3;
        }else{
            medio = num3;
        }
        System.out.printf("Número resultante = %d%d%d", menor, medio, alto);
        scan.close();
    }
}
