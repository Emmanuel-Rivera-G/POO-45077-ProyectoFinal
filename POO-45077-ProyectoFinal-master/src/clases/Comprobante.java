package clases;

public abstract class Comprobante {

	protected int numeroComprobante;
	protected String fechaEmision;
	protected String detalles;
	protected double subTotal;
	protected double igv;
	protected boolean anulado = false;

	public Comprobante(int numeroComprobante, String fechaEmision, String detalles, double subTotal, double igv,
			boolean anulado) {
		super();
		this.numeroComprobante = numeroComprobante;
		this.fechaEmision = fechaEmision;
		this.detalles = detalles;
		this.subTotal = subTotal;
		this.igv = igv;
		this.anulado = anulado;
	}

	public int getNumeroComprobante() {
		return numeroComprobante;
	}

	public void setNumeroComprobante(int numeroComprobante) {
		this.numeroComprobante = numeroComprobante;
	}

	public String getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(String fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	
	public String getDetalles() {
		return detalles;
	}

	public void setDetalles(String detalles) {
		this.detalles = detalles;
	}

	
	public double getSubTotal() {
		return subTotal;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	public double getIgv() {
		igv = getSubTotal() * 0.18 ;
		return igv;
	}

	public void setIgv(double igv) {
		this.igv = igv;
	}

	public boolean isAnulado() {
		return anulado;
	}

	public void setAnulado(boolean anulado) {
		this.anulado = anulado;
	}

	@Override
	public String toString() {
		return "-----------------------" + 
				"\nComprobante Venta " + 
				"\n-----------------------"+
				"\nNumero Comprobante : " + this.numeroComprobante + 
				"\nFecha :" + this.fechaEmision + 
				"\nSub Total :" + this.subTotal + 
				"\nIGV :" + this.igv + 
				"\nDetalles : "+ this.detalles;
	}

}
