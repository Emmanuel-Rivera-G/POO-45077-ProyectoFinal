package clases;
public class Usuario {
	//Atriburos
	protected String nombre;
	protected String apellido;
	protected String telefono;
	protected String correo;
	protected String direccion;
	protected String usuario;
    protected String contrasena;
    protected String dni;
	
	//Constructores
	public Usuario(String nombre, String apellido, String telefono, String direccion, String correo, String dni) {
		super();
		this.nombre = null;
		this.apellido = null;
		this.telefono = null;
		this.correo = null;
		this.direccion = null;
		this.dni = null;
	}
	public Usuario(String nombre, String apellido, String dni, String usuario, String contrasena) {
		super();
		this.nombre = null;
		this.apellido = null;
		this.dni = dni;
		this.usuario = usuario;
		this.contrasena = contrasena;
	}
	
	public Usuario(String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
	}
	public Usuario() {
		super();
	}
	//Metodos GET & SET
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
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
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	@Override
	public int hashCode() {
		return Integer.valueOf(dni);
	}
}
