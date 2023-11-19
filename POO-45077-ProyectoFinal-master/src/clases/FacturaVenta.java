package clases;

/*import primer_avance.Pedido;
import usuariosRestaurant.Cliente;*/

public class FacturaVenta extends ComprobanteVenta {

	protected int numeroFactura;
	protected int ruc;

	public FacturaVenta(int numeroComprobante, String fechaEmision, String detalles, double subTotal, double igv,
			boolean anulado, Pedido pedido, int numeroFactura, int ruc) {
		super(numeroComprobante, fechaEmision, detalles, subTotal, igv, anulado, pedido);
		this.numeroFactura = numeroFactura;
		this.ruc = ruc;
	}

	public int getNumeroFactura() {
		return numeroFactura;
	}

	public void setNumeroFactura(int numeroFactura) {
		this.numeroFactura = numeroFactura;
	}

	public int getRuc() {
		return ruc;
	}

	public void setRuc(int ruc) {
		this.ruc = ruc;
	}

	@Override
	public String toString() {
		return super.toString() + "Factura" + 
					"\nNumero Factura : "+ this.numeroFactura + 
					"\nRUC : " + this.ruc+
					"\n|FINALIZADO| "+
					"\n------------------------------------"+
					"\n------------------------------------";
	}

}
