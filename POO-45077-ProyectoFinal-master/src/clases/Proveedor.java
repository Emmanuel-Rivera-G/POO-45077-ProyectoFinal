package clases;

public class Proveedor {
	private int codProveedor;
	private String nombreEmpresa;
	private String contacto;
	private String direccion;

	public Proveedor(int codProveedor, String nombreEmpresa, String contacto, String direccion) {
		super();
		this.codProveedor = codProveedor;
		this.nombreEmpresa = nombreEmpresa;
		this.contacto = contacto;
		this.direccion = direccion;
	}

	public int getCodProveedor() {
		return codProveedor;
	}

	public void setCodProveedor(int codProveedor) {
		this.codProveedor = codProveedor;
	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getContacto() {
		return contacto;
	}

	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}
