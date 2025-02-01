package clase02;

public class gastosCarmen {
    public static void main(String[] args) {
        /*
         * Para aprovechar el día del espectador, Carmen decide ir al cine con sus 
         * amigos y sale de su casa con 23€. Al regresar se da cuenta que le quedan 
         * 12.75€ ¿Sabrías programar cuánto se ha gastado?
         */
        var saldoInicial = 23;
        var saldoFinal = 12.75f;
        var gastado = saldoInicial-saldoFinal;
        System.out.printf("Carmen ha gastado un total de %.2f", gastado);
    }
    
}
