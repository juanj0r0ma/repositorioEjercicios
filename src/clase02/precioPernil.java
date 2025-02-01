package clase02;

public class precioPernil {
    public static void main(String[] args) {
        /*
         * El precio del producto Pernil Iberic D'Engreix Llen. Azuaga en porción 
         * de 100 gramos cuesta 5,95€ y el vendedor nos dice que el precio por kilo 
         * cuesta 29,75€. ¿Crees que es correcto el precio?
         */
        //Calcular precio gramo
        var precioGramo = 5.95f / 100;
        //Calcular precio Kilo
        var precioKilo = precioGramo*1000;
        System.out.printf("Precio Kilo de pernil = %.2f\u20AC", precioKilo);
    }
    
}
