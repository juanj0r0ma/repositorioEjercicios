package clase02;

public class precioOrdenador {
    public static void main(String[] args) {
        /*
         * Estás interesado en comprarte un nuevo PC y en la tienda de tu barrio 
         * cuesta 660€ con todos los accesorios incluidos. Sin embargo, el vendedor 
         * te descuenta el 10% por pronto pago ¿Cuánto tienes que pagar en total por 
         * el ordenador con todos los accesorios?
         */
        var valorBruto = 660f;
        var descuentoAplicado = valorBruto*0.10f;
        var valorPagar = valorBruto-descuentoAplicado;
        System.out.printf("Con un descuento del 10%% el precio final es de %.2f\u20AC", valorPagar);
    }
}
