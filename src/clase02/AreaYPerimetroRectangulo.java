package clase02;

import java.util.Scanner;

public class AreaYPerimetroRectangulo {
    public static void main(String[] args) {
        var scan = new Scanner(System.in);
        System.out.print("Ingrese la base del Rectangulo-> ");
        var base = scan.nextFloat();
        System.out.print("Ingrese la altura del Rectangulo-> ");
        var altura = scan.nextFloat();
        //Calculando base
        var area = base*altura;
        //Calculado perimetro
        var perimetro = 2*(base+altura);
        //Imprimir resultados
        System.out.printf("""
                Rectangulo
                Base = %.2f
                Altura = %.2f
                Area = %.2f
                Perimetro = %.2f
                """, base, altura, area, perimetro);
        scan.close();
    }
    
}
