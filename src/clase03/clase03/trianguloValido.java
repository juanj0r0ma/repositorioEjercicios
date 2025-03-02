package clase03;

import java.util.Scanner;

public class trianguloValido {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar tres números (representan la 
         * longitud de una línea) y compruebe si con estos números se puede formar 
         * un triángulo.
         */
        var scan = new Scanner(System.in);
        System.out.println("Ingrese la longitud de las líneas");
        System.out.print("1 -> ");
        var side1 = scan.nextInt();
        System.out.print("2 -> ");
        var side2 = scan.nextInt();
        System.out.print("3 -> ");
        var side3 = scan.nextInt();
        if ((side1+side2)>side3 && (side1+side3)>side2 && (side2+side3)>side1) {
            System.out.println("Triangulo Válido");
        }else{
            System.out.print("Triangulo NO válido");
        }
        scan.close();
    }
}
