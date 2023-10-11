package primer_avance.usuario_paquete.empleado_paquete;

import java.util.ArrayList;

import primer_avance.cargo_paquete.Cargo;
import primer_avance.usuario_paquete.Usuario;

public class Empleado extends Usuario {
	protected double cod_empleado;
	protected String tipo;
	protected String turno;
	protected Cargo cargos[];
	
	public Empleado(String nombre, String apellido, String telefono, String direccion, String correo, double cod_empleado,
			String tipo, String turno) {
		super(nombre, apellido, telefono, direccion, correo);
		this.cod_empleado = cod_empleado;
		this.tipo = tipo;
		this.turno = turno;
	}


	public double getCod_empleado() {
		return cod_empleado;
	}


	public void setCod_empleado(double cod_empleado) {
		this.cod_empleado = cod_empleado;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	@Override
	public String toString() {
		return super.toString()+"Empleado [cod_empleado=" + cod_empleado + ", tipo=" + tipo + ", turno=" + turno + "]";
	}
	
	
}
