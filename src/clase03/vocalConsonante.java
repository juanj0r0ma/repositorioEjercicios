package clase03;

import java.util.Scanner;

public class vocalConsonante {
    public static void main(String[] args) {
        /*
         * Escriba un programa que permita ingresar una letra e identifique si 
         * es vocal o consonante.
         */
        var scan = new Scanner(System.in);
        System.out.print("Ingrese una letra-> ");
        var letra = scan.next().charAt(0);
        if (Character.isAlphabetic(letra)) {
            letra = Character.toUpperCase(letra);
            String tipo = switch (letra){
                case 'A', 'E', 'I', 'O', 'U' -> "Vocal";
                default -> "Consonante";
            };
            System.out.printf("El Character (%c) es una %s", letra, tipo);
        }else{
            System.out.printf("El valor (%c) no es válido", letra);
        }
        scan.close();
    }
}
