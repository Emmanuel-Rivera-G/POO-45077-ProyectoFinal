package avance.usuario_paquete;
import java.util.*;

import avance.Pedido;

public class Cliente extends Usuario {

    private String dni;
    private double vecesConsumo;
    private ArrayList<Pedido> pedidos;
    private final Scanner SC = new Scanner(Sustem.in);
    
    public Cliente() {
        
    }

    public Cliente(String nombre, String apellido, String telefono, String direccion, String correo,String dni, double vecesConsumo) {
        super(nombre, apellido, telefono, direccion, correo);
        this.dni = dni;
        this.vecesConsumo = vecesConsumo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

 public void regustraPedido() {
  System.out.println("Ingresé el número de mesa");
  Pedido pedido = new Pedido(SC.next());
  ArrayList<Producto> productos = pedido.getMesa().gerProductos();
}

	@Override
    public String toString() {
        return super.toString()+ "Cliente [dni=" + dni + ", vecesConsumo=" + vecesConsumo + "]";
    }        
}