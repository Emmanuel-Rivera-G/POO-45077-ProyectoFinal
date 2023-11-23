package clases;
import java.util.*;

public class Cliente extends Usuario {

    private double vecesConsumo;
    private ArrayList<Pedido> pedidos;
    private final Scanner SC = new Scanner(System.in);
    
    public Cliente() {
        
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion, String correo,String dni, double vecesConsumo) {
        super(nombre, apellido, telefono, direccion, correo, dni);
        this.vecesConsumo = vecesConsumo;
    }
    
    public Cliente(String nombre, String apellido, String dni, String usuario, String contrasena) {
    	super(nombre, apellido, dni, usuario, contrasena);
    }

    public double getVecesConsumo() {
        return vecesConsumo;
    }

    public void setVecesConsumo(double vecesConsumo) {
        this.vecesConsumo = vecesConsumo;
    }

    public ArrayList<Pedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(ArrayList<Pedido> pedidos) {
		this.pedidos = pedidos;
	}
	
	public void generarPedido() {
		System.out.println("Ingrese los productos comprados: ");
		Scanner sc = new Scanner(System.in);
		sc.next();
	}

	 public void regustraPedido() {
	  System.out.println("Ingresé el número de mesa");
	  Pedido pedido = new Pedido(001,Integer.valueOf(SC.next()));
	  ArrayList<Producto> productos = pedido.getProductos();
	}

	@Override
    public String toString() {
        return super.toString()+ "Cliente [dni=" + dni + ", vecesConsumo=" + vecesConsumo + "]";
    }        
}