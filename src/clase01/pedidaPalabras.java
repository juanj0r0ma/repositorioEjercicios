package clase01;

import java.util.Scanner;

public class pedidaPalabras {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Ingrese la palabra 1-> ");
        var palabra1 = scan.nextLine();
        System.out.print("Ingrese la palabra 2-> ");
        var palabra2 = scan.nextLine();
        System.out.print("Ingrese la palabra 3-> ");
        var palabra3 = scan.nextLine();
        System.out.println("Lista de palabras: " + palabra1 + " - " + palabra2 + " - " + palabra3);
        scan.close();
    }
}
