package clase03;

public class tableroAjedrez {
    public static void main(String[] args) {
        /*
         * Realice un programa que genere el tablero de ajedrez en consola usando 
         * instrucciones de repetición.
         * donde N representa al cuadro negro y B representa al cuadro blanco.
         * 8*8
         */
        for(var fila = 0; fila < 8; fila++){
            for(var columna = 0; columna < 8; columna++){
                if ((fila+columna)%2 == 0) {
                    System.out.print(" |B| ");
                }else{
                    System.out.print(" |N| ");
                }
            }
            System.out.println();
        }
    }
}
