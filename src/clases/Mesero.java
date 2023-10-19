package clases;

import java.util.Date;

public class Mesero extends Cargo{
	//Atributos
	private double Propina;
	//Constructor
	public Mesero(String cod_cargo, String ambiente, Date fecha_inicio, double hr_trabajo, double sueldo_base,
			double propina) {
		super(cod_cargo, ambiente, fecha_inicio, hr_trabajo, sueldo_base);
		Propina = propina;
	}
	public Mesero(String cod_cargo, String ambiente, Date fecha_inicio, double hr_trabajo, double sueldo_base) {
		super(cod_cargo, ambiente, fecha_inicio, hr_trabajo, sueldo_base);
	}
	//Metodos GET & SET
	public double getPropina() {
		return Propina;
	}
	public void setPropina(double propina) {
		Propina = propina;
	}
	
}
