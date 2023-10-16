package avance;

import java.util.ArrayList;

import avance.producto_paquete.Producto;

public class Mesa {
    
    private int numeroMesa;
    private int capasidad;
    private boolean estado;
    private Producto productos[];
    
    public Mesa() {
    }
    //METODOS GET & SET	
	public int getNumeroMesa() {
		return numeroMesa;
	}
	public void setNumeroMesa(int numeroMesa) {
		this.numeroMesa = numeroMesa;
	}
	public int getCapasidad() {
		return capasidad;
	}
	public void setCapasidad(int capasidad) {
		this.capasidad = capasidad;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
    public Producto[] getProductos() {
		return productos;
	}
	public void setProductos(Producto[] productos) {
		this.productos = productos;
	}
	//CONSTUCTOR
	public Mesa(int numeroMesa, int capasidad, boolean estado) {
		super();
		this.numeroMesa = numeroMesa;
		this.capasidad = capasidad;
		this.estado = estado;
	}
	//TOSTRING
	@Override
	public String toString() {
		return "Mesa [numeroMesa=" + numeroMesa + ", capasidad=" + capasidad + ", estado=" + estado + "]";
	}
	
}