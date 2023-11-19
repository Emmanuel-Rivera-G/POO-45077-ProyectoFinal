package clases;

import java.util.*;

public class Bebida extends Producto {

	private String tipoBebida;
	private double tamano;

	public Bebida() {

	}
	
	public Bebida(String nombre) {
		this.nombre = nombre;
	}

	public Bebida(String nombre, double precio, String descripcion, String codigo, String ingredientes,
			String tipoBebida, double tamano) {
		super(nombre, precio, descripcion, codigo, ingredientes);
		this.tipoBebida = tipoBebida;
		this.tamano = tamano;
	}

	public String getTipoBebida() {
		return tipoBebida;
	}

	public void setTipoBebida(String tipoBebida) {
		this.tipoBebida = tipoBebida;
	}

	public double getTamano() {
		return tamano;
	}

	public void setTamano(double tamano) {
		this.tamano = tamano;
	}

	@Override
	public String toString() {
		return super.toString() + "Bebida [" + ", tipoBebida=" + tipoBebida + ", tamaño=" + tamano + "]";
	}
}