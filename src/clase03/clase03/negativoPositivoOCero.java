package clase03;

import java.util.Scanner;

public class negativoPositivoOCero {
    public static void main(String[] args) {
        /*
        Escriba un programa que permita ingresar un número real e identifique
        si el número es negativo, positivo o cero
        */
        var scan = new Scanner(System.in);
        System.out.print("Ingrese un número a analizar-> ");
        var num = scan.nextInt();
        if (num>0) {
            System.out.printf("El número %d es Positivo", num);
        }else if (num<0) {
            System.out.printf("El número %d es Negativo", num);
        }else{
            System.out.print("El número es Cero");
        }
        scan.close();
    }
}
