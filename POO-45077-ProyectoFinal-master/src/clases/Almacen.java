package clases;

public class Almacen {

    private int cantidad;
    private String fechaResepcion;
    private String fechaVencimiento;
    private Producto productos[];
    
	public Almacen(int cantidad, String fechaResepcio, String fechaVencimiento) {
		super();
		this.cantidad = cantidad;
		this.fechaResepcion = fechaResepcio;
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaResepcion() {
		return fechaResepcion;
	}

	public void setFechaResepcion(String fechaResepcio) {
		this.fechaResepcion = fechaResepcio;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
    
	public Producto[] getProductos() {
		return productos;
	}

	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}

	@Override
	public String toString() {
		return "";
	}
    

}