package clases;
public class Empleado extends Usuario{
	//Atributos
	private String cod_empleado;
	private Cargo cargo;
	private String turno;
	//Constuctores
	public Empleado(String nombre, String apellido, String telefono, String correo, String dni, String cod_empleado, Cargo cargo,
			String turno) {
		super(nombre, apellido, telefono, correo, dni);
		this.cod_empleado = cod_empleado;
		this.cargo = cargo;
		this.turno = turno;
	}
	public Empleado(String nombre, String apellido, String usuario, String contrasena, String dni) {
		super(nombre, apellido, usuario, contrasena, dni);
	}
	//Metodos GET & SET
	public String getCod_empleado() {
		return cod_empleado;
	}
	public void setCod_empleado(String cod_empleado) {
		this.cod_empleado = cod_empleado;
	}
	public Cargo getCargo() {
		return cargo;
	}
	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}
	public String getTurno() {
		return turno;
	}
	public void setTurno(String turno) {
		this.turno = turno;
	}
	
}
