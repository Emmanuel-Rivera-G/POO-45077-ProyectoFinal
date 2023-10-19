package clases;

import java.util.List;

public class BoletaCompra extends ComprobanteCompra{
	
	protected String tipoPago;
	protected String detallesAdicionales;
	
	public BoletaCompra(int numeroComprobante, String fechaEmision, String detalles, double subTotal, double igv,
			boolean anulado, Proveedor proveedor, String nombreProducto, int cantidad, double precioUnitario,
			double descuentoProveedor, List<Transaccion> transaccionesRelacionadas, String tipoPago,
			String detallesAdicionales) {
		super(numeroComprobante, fechaEmision, detalles, subTotal, igv, anulado, proveedor, nombreProducto, cantidad,
				precioUnitario, descuentoProveedor, transaccionesRelacionadas);
		this.tipoPago = tipoPago;
		this.detallesAdicionales = detallesAdicionales;
	}


	public String getTipoPago() {
		return tipoPago;
	}


	public void setTipoPago(String tipoPago) {
		this.tipoPago = tipoPago;
	}
	
	public String getDetallesAdicionales() {
		return detallesAdicionales;
	}


	public void setDetallesAdicionales(String detallesAdicionales) {
		this.detallesAdicionales = detallesAdicionales;
	}


	@Override
	public String toString() {
		return super.toString()+"\n" +
		           "Tipo de Pago: " + tipoPago + "\n" +
		           "Detalles Adicionales: " + detallesAdicionales + "\n";
	}
	 

}
