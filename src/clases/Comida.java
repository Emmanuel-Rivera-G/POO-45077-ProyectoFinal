package clases;

import java.util.*;

public class Comida extends Producto {

	public String ingredientes;
	private String tipoComida;
	private double tiempoPreparacion;

	public Comida() {

	}
	
	public Comida(String nombre) {
		this.nombre = nombre;
	}
	
	public Comida(String codigo, String nombre, String imagen, double precio) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.imagen = imagen;
		this.precio = precio;
	}

	public Comida(String nombre, double precio, String descripcion, String codigo, String ingredientes,
			String tipoComida, double tiempoPreparacion) {
		super(nombre, precio, descripcion, codigo, ingredientes);
		this.tipoComida = tipoComida;
		this.tiempoPreparacion = tiempoPreparacion;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getTipoComida() {
		return tipoComida;
	}

	public void setTipoComida(String tipoComida) {
		this.tipoComida = tipoComida;
	}

	public double getTiempoPreparacion() {
		return tiempoPreparacion;
	}

	public void setTiempoPreparacion(double tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}

	@Override
	public String toString() {
		return super.toString() + "Comida [" + ", tipoComida=" + tipoComida + ", tiempoPreparacion=" + tiempoPreparacion
				+ "]";
	}
}