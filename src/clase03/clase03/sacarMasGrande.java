package clase03;

import java.util.Scanner;

public class sacarMasGrande {
    public static void main(String[] args) {
        /*
         * Escriba un programa que le permita ingresar tres números e imprima 
         * en la consola el más grande de ellos.
         */
        var scan = new Scanner(System.in);
        var mayor = 0;
        System.out.print("Ingrese tres (3) números, el programa escogerá el de mayor valor");
        System.out.printf("%nIngrese el primer valor-> ");
        var num1 = scan.nextInt();
        System.out.printf("Ingrese el segundo valor-> ");
        var num2 = scan.nextInt();
        System.out.printf("Ingrese el tercer valor-> ");
        var num3 = scan.nextInt();
        if (num1 > num2 && num1 > num2) {
            System.out.println();
            mayor = num1;
        }else if(num2 > num1 && num2 > num3){
            mayor = num2;
        }else{
            mayor = num3;
        }
        System.out.printf("De los números dados, el número mayor es %d", mayor);
        scan.close();
    }
}
