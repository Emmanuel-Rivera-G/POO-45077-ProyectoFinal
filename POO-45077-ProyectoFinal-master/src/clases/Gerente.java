package clases;

import java.util.Date;

import interfaces.Pagos;

public class Gerente extends Cargo implements Pagos{
	//Atributos 
	private double sueldo_gerente;
	//Constuctores

	public Gerente(String cod_cargo, String ambiente, Date fecha_inicio, double hr_trabajo, double sueldo_base,
			double sueldo_gerente) {
		super(cod_cargo, ambiente, fecha_inicio, hr_trabajo, sueldo_base);
		this.sueldo_gerente = sueldo_gerente;
	}
	public Gerente() {
		super();
	}
	//Metodos GET & SET
	public double getSueldo_gerente() {
		return sueldo_gerente;
	}
	public void setSueldo_gerente(double sueldo_gerente) {
		this.sueldo_gerente = sueldo_gerente;
	}
	@Override
	public double CalcularPagos() {
		
		
		return 0;
	}
}
