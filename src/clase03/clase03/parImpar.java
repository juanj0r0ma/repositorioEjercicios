package clase03;

import java.util.Scanner;

public class parImpar {
    public static void main(String[] args) {
        //Escriba un programa que permita ingresar un número e identificar si es par o impar.
        var scan = new Scanner(System.in);
        System.out.print("Ingrese un número-> ");
        var num = scan.nextInt();
        if (num%2 == 0) {
            System.out.printf("El número %d es Par", num);
        }else{
            System.out.printf("El número %d es Impar", num);
        }
        scan.close();
    }
}
