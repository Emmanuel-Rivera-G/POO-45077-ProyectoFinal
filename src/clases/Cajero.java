package clases;

import java.util.Date;

import interfaces.Pagos;

public class Cajero extends Cargo implements Pagos{
	//Atributos
	private double comisiones;
	//Constructores
	public Cajero(String cod_cargo, String ambiente, Date fecha_inicio, double hr_trabajo, double sueldo_base, double comisiones) {
		super(cod_cargo, ambiente, fecha_inicio, hr_trabajo, sueldo_base);
		this.comisiones = comisiones;
	}
	public Cajero(String cod_cargo, String ambiente, Date fecha_inicio, double hr_trabajo, double sueldo_base) {
		super(cod_cargo, ambiente, fecha_inicio, hr_trabajo, sueldo_base);
	}
	//Metodos GET & SET
	public double getSueldo_base() {
		return sueldo_base;
	}
	public void setSueldo_base(double sueldo_base) {
		this.sueldo_base = sueldo_base;
	}
	public double getComisiones() {
		return comisiones;
	}
	public void setComisiones(double comisiones) {
		this.comisiones = comisiones;
	}
	@Override
	public double CalcularPagos() {
		double sueldoTotal = super.sueldo_base + this.comisiones;
		return sueldoTotal;
	}
}
