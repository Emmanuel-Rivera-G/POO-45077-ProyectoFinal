package clases;

public abstract class Producto {
	public Producto() {
	}

	protected String nombre;
	protected double precio;
	protected String descripcion;
	protected String codigo;
	protected String ingredientes;
	
	// METODOS GET & SET
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	// CONSTRUCTOR
	public Producto(String nombre, double precio, String descripcion, String codigo, String ingredientes) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.descripcion = descripcion;
		this.codigo = "P_" + ((int)(Math.random()*100));
		this.ingredientes = ingredientes;
	}

	// TOSTRINS
	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", descripcion=" + descripcion + ", codigo="
				+ codigo + ", ingredientes=" + ingredientes + "]";
	}
}