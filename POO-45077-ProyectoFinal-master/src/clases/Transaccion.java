package clases;
import java.util.Date;

public class Transaccion {
	 private int numeroTransaccion;
	    private Date fecha;
	    private String tipoTransaccion;
	    private double monto;
	    private String descripcion;
	    private int codigoProducto;
	    private String metodoPago;
	    private String estadoTransaccion;
	    private FacturaCompra informacionFactura;
	    
		public Transaccion(int numeroTransaccion, Date fecha, String tipoTransaccion, double monto, String descripcion,
				int codigoProducto, String metodoPago, String estadoTransaccion, FacturaCompra informacionFactura) {
			super();
			this.numeroTransaccion = numeroTransaccion;
			this.fecha = fecha;
			this.tipoTransaccion = tipoTransaccion;
			this.monto = monto;
			this.descripcion = descripcion;
			this.codigoProducto = codigoProducto;
			this.metodoPago = metodoPago;
			this.estadoTransaccion = estadoTransaccion;
			this.informacionFactura = informacionFactura;
		}

		public int getNumeroTransaccion() {
			return numeroTransaccion;
		}

		public void setNumeroTransaccion(int numeroTransaccion) {
			this.numeroTransaccion = numeroTransaccion;
		}

		public Date getFecha() {
			return fecha;
		}

		public void setFecha(Date fecha) {
			this.fecha = fecha;
		}

		public String getTipoTransaccion() {
			return tipoTransaccion;
		}

		public void setTipoTransaccion(String tipoTransaccion) {
			this.tipoTransaccion = tipoTransaccion;
		}

		public double getMonto() {
			return monto;
		}

		public void setMonto(double monto) {
			this.monto = monto;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public int getCodigoProducto() {
			return codigoProducto;
		}

		public void setCodigoProducto(int codigoProducto) {
			this.codigoProducto = codigoProducto;
		}

		public String getMetodoPago() {
			return metodoPago;
		}

		public void setMetodoPago(String metodoPago) {
			this.metodoPago = metodoPago;
		}

		public String getEstadoTransaccion() {
			return estadoTransaccion;
		}

		public void setEstadoTransaccion(String estadoTransaccion) {
			this.estadoTransaccion = estadoTransaccion;
		}

		public FacturaCompra getInformacionFactura() {
			return informacionFactura;
		}

		public void setInformacionFactura(FacturaCompra informacionFactura) {
			this.informacionFactura = informacionFactura;
		}

		
	    @Override
	    public String toString() {
	    	    return "-----------------------------------------------------------------------------------" +
	    	    		"|Detalles de Transaccion  "+ " |Número de Transacción: " + this.numeroTransaccion+"|"+ "|Fecha: " + this.fecha +"|" +
		    	       "------------------------------------------------------------------------------------"+
	    	           "Tipo de Transacción: " + this.tipoTransaccion + "\n" +
	    	           "Monto: " + this.monto + "\n" +
	    	           "Descripción: " + this.descripcion + "\n" +
	    	           "Código de Producto: " + this.codigoProducto + "\n" +
	    	           "Método de Pago: " + this.metodoPago + "\n" +
	    	           "Estado de Transacción: " + this.estadoTransaccion + "\n" +
	    	           "Información de Factura: " + this.informacionFactura + "\n" +
	    	           "--------------------------------------------------------------------------------------";
	    	
	    }
	    
}
