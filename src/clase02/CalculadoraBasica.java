package clase02;

import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        /*
         * Escribe un programa que solicite al usuario dos números y luego 
         * realice las operaciones de suma, resta, multiplicación y división 
         * con esos números. Muestra los resultados en la consola.
         */
        var scan = new Scanner(System.in);
        System.out.print("Ingrese un numero-> ");
        var num1 = scan.nextFloat();
        System.out.print("Ingrese un numero-> ");
        var num2 = scan.nextFloat();
        //Suma
        System.out.printf("%nSuma = %.2f", num1+num2);
        //Resta
        System.out.printf("%nResta = %.2f", num1-num2);
        //Multiplicacion
        System.out.printf("%nMultiplicacion = %.2f", num1*num2);
        //Division
        System.out.printf("%nDivision = %.2f", num1/num2);
        scan.close();
    }
}
