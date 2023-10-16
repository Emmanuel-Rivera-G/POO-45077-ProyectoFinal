package avance;

public class Almacen {

    private int cantidad;
    private String fechaResepcio;
    private String fechaVencimiento;
    
	public Almacen(int cantidad, String fechaResepcio, String fechaVencimiento) {
		super();
		this.cantidad = cantidad;
		this.fechaResepcio = fechaResepcio;
		this.fechaVencimiento = fechaVencimiento;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getFechaResepcio() {
		return fechaResepcio;
	}

	public void setFechaResepcio(String fechaResepcio) {
		this.fechaResepcio = fechaResepcio;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
    
	@Override
	public String toString() {
		return "";
	}
    

}