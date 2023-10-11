package primer_avance.comprobante_paquete;

public abstract class ComprobanteVenta {

    protected double numeroComprobante;
    protected String fecha;
    protected String detalles;
    
	public ComprobanteVenta(double numeroComprobante, String fecha, String detalles) {
		super();
		this.numeroComprobante = numeroComprobante;
		this.fecha = fecha;
		this.detalles = detalles;
	}

	public double getNumeroComprobante() {
		return numeroComprobante;
	}

	public void setNumeroComprobante(double numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	@Override
	public String toString() {
		return "ComprobanteVenta [numeroComprobante=" + numeroComprobante + ", fecha=" + fecha + ", detalles="
				+ detalles + "]";
	}
    
	
    


}
