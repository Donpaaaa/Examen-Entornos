import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
public class FacturaTest {

    @Test
    public void testCalcularTotalConDescuentoValido() {

        Factura factura = new Factura(100.0, 10.0, false);
        assertEquals(90.0, factura.calcularTotal(), "El total con descuento válido no es correcto.");
    }
    @Test
    public void testCalcularTotalSinDescuento() {

        Factura factura = new Factura(100.0, 0.0, false);
        assertEquals(100.0, factura.calcularTotal(), "El total con descuento válido no es correcto.");
    }

    @Test
    public void testCalcularTotalConDescuentoInvalidoMayor() {
        Factura factura = new Factura(100.0, 120.0, false);
        assertEquals(100.0, factura.calcularTotal(), "El total con descuento inválido no es correcto.");

    }

    @Test
    public void testCalcularTotalConDescuentoInvalidoMenor() {
        Factura factura = new Factura(100.0, -10.0, false);
        assertEquals(100.0, factura.calcularTotal(), "El total con descuento negativo no es correcto.");
    }

    @Test
    public void testCalcularTotalClienteFidelizado() {
        Factura factura = new Factura(100.0, 10.0, true);
        assertEquals(85.5, factura.calcularTotal(), "El total para cliente fidelizado no es correcto.");
    }

    @Test
    public void testCalcularTotalConTotalNegativo() {
        Factura factura = new Factura(-50.0, 10.0, false);
        assertEquals(0.0, factura.calcularTotal(),  "El total no debe ser negativo.");
    }
}

















