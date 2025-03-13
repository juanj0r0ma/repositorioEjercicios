package clase03;

import java.util.Scanner;

public class piedraPapelTijera {
    public static void main(String[] args) {
        /*
         * Realizar un programa que permita controlar el juego de piedra, papel, 
         * tijera introduciendo P para piedra, L para papel y T para tijera por cada 
         * jugador.
         * El sistema debe indicar qué jugador gana la ronda o si hay empate. Al final 
         * de cada ronda preguntar si desea volver a jugar.
         */
        var scan = new Scanner(System.in);
        var jugar = true;
        //Primer jugador
        do {
        System.out.printf("%nIngrese su jugada-> ");
        var player1 = scan.nextLine().charAt(0);
        player1 = Character.toUpperCase(player1);
        //Segundo jugador
        System.out.printf("%nIngrese su jugada-> ");
        var player2 = scan.nextLine().charAt(0);
        player2 = Character.toUpperCase(player2);
        if ((player1 == 'P' || player1 == 'L' || player1 == 'T') && (player2 == 'P' || player2 == 'L' || player2 == 'T')){
            if (player1 == 'P') {
                String ganador = switch (player2) {
                    case 'L'-> "Jugador 2";
                    case 'T'-> "Jugador 1"; 
                    default-> "Empate";
                };
                System.out.printf("%n-->Ganador es %s", ganador);
            }else if (player1 == 'L') {
                String ganador = switch (player2){
                    case 'P'-> "Jugador 1";
                    case 'T'-> "Jugador 2";
                    default-> "Empate";
                };
                System.out.printf("%n-->Ganador es %s", ganador);
            }
            else{
                String ganador = switch (player2){
                    case 'P'-> "Jugador 2";
                    case 'L'-> "Jugador 1";
                    default-> "Empate";
                };
                System.out.printf("%n-->Ganador es %s", ganador);
            }
        }else{
            System.out.println("* Opción no válida");
        }
        System.out.printf("%n¿Jugar de nuevo? (y/n)");
        var opt = scan.nextLine().charAt(0);
        opt = Character.toUpperCase(opt);
        if (opt == 'N') {
            System.out.println("Juego finalizado, hasta la próxima...");
            jugar = false;
        }else if (opt == 'Y') {
            jugar = true;
        }else{
            System.out.println("*Opción no válida");
            System.out.println("Saliendo del programa...");
            jugar = false;
        }
        } while (jugar);
        scan.close();
    }
}
