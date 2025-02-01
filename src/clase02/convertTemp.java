package clase02;

import java.util.Scanner;

public class convertTemp {
    public static void main(String[] args) {
        /*
         * Escribe un programa que convierta una temperatura dada en grados Celsius 
         * a grados Fahrenheit y Kelvin. 
         * Fahrenheit = Celsius * 9/5 + 32
         * Kelvin = Celsius + 273.15
         */
        var scan = new Scanner(System.in);
        System.out.print("Ingrese una temperatura en grados Celsius-> ");
        var celsius = scan.nextFloat();
        System.out.printf("""
                °C = %.2f
                °F = %.2f
                °K = %.2f
                """, celsius, celsius*9/5+32, celsius+273.15);
        scan.close();
    }
    
}
