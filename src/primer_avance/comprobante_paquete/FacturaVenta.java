package primer_avance.comprobante_paquete;

public class FacturaVenta extends ComprobanteVenta {

    private double numeroFactura;
    private double ruc;
    
	public FacturaVenta(double numeroComprobante, String fecha, String detalles, double numeroFactura, double ruc) {
		super(numeroComprobante, fecha, detalles);
		this.numeroFactura = numeroFactura;
		this.ruc = ruc;
	}

	public double getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(double numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public double getRuc() {
		return ruc;
	}

	public void setRuc(double ruc) {
		this.ruc = ruc;
	}
    
	@Override
	public String toString() {
		return super.toString()+"";
	}
    

}