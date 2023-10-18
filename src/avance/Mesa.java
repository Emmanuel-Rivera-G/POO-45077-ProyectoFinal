package avance;

import java.util.*;

import avance.producto_paquete.Producto;

public class Mesa {
    
    private int numeroMesa;
    private int capasidad;
    private boolean estado;
    private ArrayList<Producto> productos;
    private final Scanner SC = new Scanner(System.in);
    
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
    public ArrayList<Producto> getProductos() {
		return productos;
	}
	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}
	//CONSTUCTOR
	public Mesa(int numeroMesa, int capasidad, boolean estado) {
		super();
		this.numeroMesa = numeroMesa;
		this.capasidad = capasidad;
		this.estado = estado;
	}
	public Mesa(int numeroMesa) {
	  this.numeroMesa = numeroMesa;
	}

	public void registrarProductos() {
		int i = 0;
		String nomPro = "";
		
		
		do {
			if (i == 0) {System.out.println("Registro de productos: ");}
			
			System.out.println("Ingrese el producto número " + ++i + " : ");
			nomPro = SC.next();
			
		} while(i < 5);
	}
	//TOSTRING
	@Override
	public String toString() {
		return "Mesa [numeroMesa=" + numeroMesa + ", capasidad=" + capasidad + ", estado=" + estado + "]";
	}
	
}