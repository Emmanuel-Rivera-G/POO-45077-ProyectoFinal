package avance;

import java.util.ArrayList;

import avance.producto_paquete.Producto;

public class Mesa {
    
    private int numeroMesa;
    private int capasidad;
    private boolean estado;
    private Producto productos[];
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
 public Mesa(int numeroMesa) {
  
}

 public void regustraProductos() {
  int i = 0;
  String s = "";
  while(s != "Fin" || s != "fin") {
   System.out.println("Ingresé el producto N°" + ++i "\nIngrese Fin para a acabar");
   SC.next();
  }
}
	//TOSTRING
	@Override
	public String toString() {
		return "Mesa [numeroMesa=" + numeroMesa + ", capasidad=" + capasidad + ", estado=" + estado + "]";
	}
	
}