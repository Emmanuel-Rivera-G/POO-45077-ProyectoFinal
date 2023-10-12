package avance.comprobante_paquete;
import java.util.*;

public class BoletaVenta extends ComprobanteVenta {
    
    private double numeroBoleta;
    private double subTotal;
    
    public BoletaVenta(double numeroComprobante,String fecha,String detalles,double numeroBoleta, double subTotal) {
        super(numeroComprobante,fecha,detalles);
        this.numeroBoleta = numeroBoleta;
        this.subTotal = subTotal;
    }

    public double getNumeroBoleta() {
        return numeroBoleta;
    }

    public void setNumeroBoleta(double numeroBoleta) {
        this.numeroBoleta = numeroBoleta;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public String toString() {
        return super.toString()+"BoletaVenta [numeroBoleta=" + numeroBoleta + ", subTotal=" + subTotal + "]";
    }
}