public class Factura {

    private double total; // total de la factura en euro-cent

    private double descuento; // descuento aplicado en porcentaje

    private boolean clienteFidelizado;

    public Factura(double total, double descuento, boolean clienteFidelizado) {
        this.total = total;

        this.descuento = descuento;

        this.clienteFidelizado = clienteFidelizado;
    }


    /**

     Constructor para crear una factura.

     */


    public double calcularTotal() {

        double totalConDescuento = total;

        if (descuento > 0 && descuento <= 100)

        {

            totalConDescuento -= totalConDescuento * (descuento / 100);

        }

        if (clienteFidelizado) {

            totalConDescuento -= totalConDescuento * 0.05; // Descuento adicional para clientes fidelizados

        }

        if (totalConDescuento < 0) {

            totalConDescuento = 0; // El total no puede ser negativo

        }

        return totalConDescuento;

    }
}

