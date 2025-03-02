package clase03;

import java.util.Scanner;

public class minusculaMayuscula {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar una letra e identifique si la 
         * letra es mayúscula o minúscula.
         */
        var scan = new Scanner(System.in);
        System.out.print("Ingrese una letra-> ");
        var letra = scan.next().charAt(0);
        if (Character.isUpperCase(letra)) {
            System.out.println("Mayuscula");
        }else{
            System.out.println("Minuscula");
        }
        scan.close();
    }
}
