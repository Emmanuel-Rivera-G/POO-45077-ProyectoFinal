package clases;
import interfaces.AccionesComprobante;

public abstract class ComprobanteVenta extends Comprobante implements AccionesComprobante {
	protected Pedido pedido;

	public ComprobanteVenta(int numeroComprobante, String fechaEmision, String detalles, double subTotal, double igv,
			boolean anulado, Pedido pedido) {
		super(numeroComprobante, fechaEmision, detalles, subTotal, igv, anulado);
		this.pedido = pedido;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}


	@Override
	public double calcularDescuento() {
		double porcentajeDescuento = 0.10;
		double descuento= this.subTotal * porcentajeDescuento;
		return descuento;
	}

	@Override
	public double calcularTotal() {
		double montoTotal = (this.subTotal-calcularDescuento()) + this.igv;
		return montoTotal;
	}

	@Override
	public boolean anularComprobante() {
		if (!anulado) {
			anulado = true;
			return true; // Éxito: el comprobante se ha anulado con éxito.
		}
		return false; // Error: el comprobante ya se anuló previamente.
	}
	@Override
	public String toString() {
		return super.toString()+getPedido()+ "\nMONTO TOTAL : " +calcularTotal() ;
	}

}
