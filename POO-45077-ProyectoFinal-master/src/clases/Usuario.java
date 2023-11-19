package clases;
public class Usuario {
	//Atriburos
	protected String nombre;
	protected String apellido;
	protected String telefono;
	protected String correo;
	//Constructores
	public Usuario(String nombre, String apellido, String telefono, String correo) {
		super();
		this.nombre = null;
		this.apellido = null;
		this.telefono = null;
		this.correo = null;
	}
	public Usuario() {
		super();
	}
	//Metodos GET & SET
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	
}
