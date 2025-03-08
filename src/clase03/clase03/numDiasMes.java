package clase03;

import java.util.Scanner;

public class numDiasMes {
    public static void main(String[] args) {
        /*
         * Escriba una función en la que ingrese un número entero entre 1 y 12. 
         * Este número corresponde con un mes (1 enero, 2 febrero, ..., 12 diciembre). 
         * El resultado debe ser el número de días del mes ingresado.
         * Ejemplo:
         * Input : 12
         * Output : 31
         * A continuación encuentras la cantidad de días que tienen cada mes.
         * 
         * Mes	                   Días
         * 1, 3, 5, 7, 8, 10 y 12   31
         * 4, 6, 9, 11              30
         * 2                        28
         */
        var scan = new Scanner(System.in);
        System.out.print("Ingrese el número de mes (1-12) -> ");
        var numMes = scan.nextInt();
        String mes = switch (numMes) {
            case 1 -> "Enero";
            case 2 -> "Febrero";
            case 3 -> "Marzo";
            case 4 -> "Abril";
            case 5 -> "Mayo";
            case 6 -> "Junio";
            case 7 -> "Julio";
            case 8 -> "Agosto";
            case 9 -> "Septiembre";
            case 10 -> "Octubre";
            case 11 -> "Noviembre";
            case 12 -> "Diciembre";
            default -> "Mes no válido";
        };
        if (mes == "Mes no válido") {
            System.out.printf("%nEstado de búsqueda: %s", mes);
            System.exit(0);
        }else{
            Integer numDias = switch (numMes) {
                case 1, 3, 5, 7, 8, 10, 12 -> 31;
                case 4, 6, 9, 11 -> 30;
                case 2 -> 28;
                default -> 0;
            };
            //Resultados
            System.out.print("----------------");
            System.out.printf("%nMes - %s (%d)", mes, numMes);
            System.out.printf("%nDías - %d%n", numDias);
            System.out.print("----------------");
        }
        scan.close();
    }
}
