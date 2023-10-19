package clases;

import java.util.Date;

public class Cajero extends Cargo{
	//Atributos
	private double sueldo_base;
	private double comisiones;
	//Constructores
	public Cajero(String cod_cargo, String ambiente, Date fecha_inicio, double hr_trabajo, double sueldo_base,
			double sueldo_base2, double comisiones) {
		super(cod_cargo, ambiente, fecha_inicio, hr_trabajo, sueldo_base);
		sueldo_base = sueldo_base2;
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
}
