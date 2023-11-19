package clases;

import java.util.List;

public class FacturaCompra  extends ComprobanteCompra {
	
	private String numeroRUCProveedor;
	private String fechaVencimiento;
	
	public FacturaCompra(int numeroComprobante, String fechaEmision, String detalles, double subTotal, double igv,
			boolean anulado, Proveedor proveedor, String nombreProducto, int cantidad, double precioUnitario,
			double descuentoProveedor, List<Transaccion> transaccionesRelacionadas, String numeroRUCProveedor,
			String fechaVencimiento) {
		super(numeroComprobante, fechaEmision, detalles, subTotal, igv, anulado, proveedor, nombreProducto, cantidad,
				precioUnitario, descuentoProveedor, transaccionesRelacionadas);
		this.numeroRUCProveedor = numeroRUCProveedor;
		this.fechaVencimiento = fechaVencimiento;
	}

	public String getNumeroRUCProveedor() {
		return numeroRUCProveedor;
	}

	public void setNumeroRUCProveedor(String numeroRUCProveedor) {
		this.numeroRUCProveedor = numeroRUCProveedor;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	@Override
	public String toString() {
		return super.toString() + "\n" +
		           "Número de RUC del Proveedor: " + this.numeroRUCProveedor + "\n" +
		           "Fecha de Vencimiento: " + this.fechaVencimiento + "\n";
	}
}
