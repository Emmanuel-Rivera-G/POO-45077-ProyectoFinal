package clases;

import java.util.Date;

public abstract class Cargo {
	//Atriburos
	protected String cod_cargo;
	protected String ambiente;
	protected Date fecha_inicio;
	protected double hr_trabajo;
	protected double sueldo_base;
	//Constructores
	public Cargo(String cod_cargo, String ambiente, Date fecha_inicio, double hr_trabajo, double sueldo_base) {
		super();
		this.cod_cargo = cod_cargo;
		this.ambiente = ambiente;
		this.fecha_inicio = fecha_inicio;
		this.hr_trabajo = hr_trabajo;
		this.sueldo_base = sueldo_base;
	}
	public Cargo() {
		super();
	}
	//Metodos GET & SET
	public String getCod_cargo() {
		return cod_cargo;
	}
	public void setCod_cargo(String cod_cargo) {
		this.cod_cargo = cod_cargo;
	}
	public String getAmbiente() {
		return ambiente;
	}
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public double getHr_trabajo() {
		return hr_trabajo;
	}
	public void setHr_trabajo(double hr_trabajo) {
		this.hr_trabajo = hr_trabajo;
	}
	public double getSueldo_base() {
		return sueldo_base;
	}
	public void setSueldo_base(double sueldo_base) {
		this.sueldo_base = sueldo_base;
	}
}
