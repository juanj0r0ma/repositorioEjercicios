package clase03;

public class numerosAleatorios {
    public static void main(String[] args) {
        /*
         * Escriba un programa que genere 120 números aleatorios entre -100 y 100. 
         * Imprime los siguientes cálculos:
         * 
         * Sumar los valores positivos.
         * Sumar los valores negativos.
         * Calcule la media de los números negativos.
         * Calcule la media de los números positivos.
         * Cuente la cantidad de ceros.
         */
        var positivos = 0;
        var sumaPositivos = 0f;
        var negativos = 0;
        var sumaNegativos = 0f;
        var cero = 0;
        for(var i = 0; i < 120; i++){
            int num = (int) (Math.random() * 201 - 100);
            if (num>0) {
                positivos++;
                sumaPositivos += num;
            }else if (num<0){
                negativos++;
                sumaNegativos += num;
            }else{
                cero++;
            }
        }
        System.out.printf("%n------------------------------------");
            System.out.printf("%n - Números positivos   %d", positivos);
            System.out.printf("%n   - Media números positivos -> %.2f",  sumaPositivos/positivos);
            System.out.printf("%n - Números negativos   %d", negativos);
            System.out.printf("%n   - Media números negativos -> %.2f", sumaNegativos/negativos);
            System.out.printf("%n - Total de ceros       %d", cero);
    }
}
