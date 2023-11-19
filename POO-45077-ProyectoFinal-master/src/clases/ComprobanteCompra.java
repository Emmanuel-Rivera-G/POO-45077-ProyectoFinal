package clases;
import java.util.List;

import interfaces.AccionesComprobante;

public abstract class ComprobanteCompra extends Comprobante implements AccionesComprobante{

	protected Proveedor proveedor;
	protected String nombreProducto;
	protected int cantidad;
	protected double precioUnitario;
	protected double descuentoProveedor;
	protected List<Transaccion> transaccionesRelacionadas;
	
	public ComprobanteCompra(int numeroComprobante, String fechaEmision, String detalles, double subTotal, double igv,
			boolean anulado, Proveedor proveedor, String nombreProducto, int cantidad, double precioUnitario,
			double descuentoProveedor, List<Transaccion> transaccionesRelacionadas) {
		super(numeroComprobante, fechaEmision, detalles, subTotal, igv, anulado);
		this.proveedor = proveedor;
		this.nombreProducto = nombreProducto;
		this.cantidad = cantidad;
		this.precioUnitario = precioUnitario;
		this.descuentoProveedor = descuentoProveedor;
		this.transaccionesRelacionadas = transaccionesRelacionadas;
	}


	public Proveedor getProveedor() {
		return proveedor;
	}


	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}


	public String getNombreProducto() {
		return nombreProducto;
	}


	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}


	public double getPrecioUnitario() {
		return precioUnitario;
	}


	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}


	public List<Transaccion> getTransaccionesRelacionadas() {
		return transaccionesRelacionadas;
	}


	public void setTransaccionesRelacionadas(List<Transaccion> transaccionesRelacionadas) {
		this.transaccionesRelacionadas = transaccionesRelacionadas;
	}

	public double getDescuentoProveedor() {
		return descuentoProveedor;
	}


	public void setDescuentoProveedor(double descuentoProveedor) {
		this.descuentoProveedor = descuentoProveedor;
	}


	@Override
	public double calcularDescuento() {
		this.subTotal = getPrecioUnitario() * getCantidad();
		descuentoProveedor= this.subTotal * getDescuentoProveedor() ;
		return descuentoProveedor;
	}

	@Override
	public double calcularTotal() {
		this.subTotal = getPrecioUnitario() * getCantidad();
		double montoTotal = (this.subTotal-calcularDescuento()) + this.igv;
		return montoTotal;
	}

	@Override
    public boolean anularComprobante() {
        if (!anulado) {
            // Verificar si hay transacciones relacionadas
            if (transaccionesRelacionadas.isEmpty()) {
                anulado = true;
                return true; // Éxito: el comprobante de compra se ha anulado con éxito.
            } else {
                return false; // Error: no se puede anular el comprobante de compra debido a transacciones relacionadas.
            }
        }
        return false; // Error: el comprobante de compra ya se anuló previamente.
    }
	

	@Override
	public String toString() {
		return super.toString()+
				"\nProveedor: " + this.proveedor + "\n" +
		           "Nombre del Producto: " + this.nombreProducto + "\n" +
		           "Cantidad: " + this.cantidad + "\n" +
		           "Precio Unitario: " + this.precioUnitario + "\n" +
		           "Descuento del Proveedor: " + this.descuentoProveedor + "\n" +
		           "Transacciones Relacionadas: " + this.transaccionesRelacionadas + "\n" ;
	}

}
