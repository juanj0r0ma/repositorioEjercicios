package clase03;

import java.util.Scanner;

public class divSandia {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Peso sandía -> ");
        var pesoSandia = scan.nextFloat();
        if (pesoSandia%2 == 0) {
            System.out.println("SI");
        }else{
            System.out.println("NO");
        }
        scan.close();
    }
}
