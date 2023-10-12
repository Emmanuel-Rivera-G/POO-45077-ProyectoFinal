package avance.usuario_paquete;
import java.util.*;
public abstract class Usuario {
    public Usuario() {
    }
    protected String dni;
    protected String nombre;
    protected String apellidoMaterno;
    protected String apellidoPaterno;
    protected String telefono;
    protected String direccion;
    protected String correo;
	public Usuario(String nombre, String apellido, String telefono, String direccion, String correo) {
		super();
		this.nombre = nombre;
		this.apellidoMaterno = apellido;
		this.telefono = telefono;
		this.direccion = direccion;
		this.correo = correo;
	}
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
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}
	public void setApellidoMaterno(String apellido) {
		this.apellidoMaterno = apellido;
	}
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getCorreo() {
		return correo;
	}
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellidoMaterno + ", telefono=" + telefono + ", direccion="
				+ direccion + ", correo=" + correo + "]";
	}
    
}