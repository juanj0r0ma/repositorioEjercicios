package clase03;

import java.util.Scanner;

public class llegadaHermanos {
    public static void main(String[] args) {
        /*
         * Tres hermanos acuerdan reunirse. Los hermanos son identificados por los 
         * siguientes números: 1 para el mayor, 2 para el del medio y 3 para el menor.
         * Cuando llega la hora de la reunión, uno de los hermanos va tarde. Dados los números de los hermanos que llegan a tiempo, determine el número del hermano que llegará tarde.
         * 
         * Por ejemplo:
         * Input : 1 2
         * Output : 3
         */
        var scan = new Scanner(System.in);
        var ultimo = 0;
        System.out.print("Primero en llegar -> ");
        var primero = scan.nextInt();
        System.out.print("Segundo en llegar -> ");
        var segundo = scan.nextInt();
        if (primero != 1 && segundo != 1) {
            ultimo = 1;
        }else if (primero != 2 && segundo != 2) {
            ultimo = 2;
        }else{
            ultimo = 3;
        }
        System.out.printf("Último hermano en llegar = %d", ultimo);
        scan.close();
    }
}
