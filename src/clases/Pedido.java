package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Pedido {
    public Pedido() {
    }
    private int numeroPedido;
    private String fecha;
    private String hora;
    private String estadoPedido;
    private double total;
    private Usuario cliente;
    private Usuario cajero;
    private Mesa mesa;
    private ComprobanteVenta comprobante;
    private ArrayList<Producto> productos;
    private final Scanner SC = new Scanner(System.in);
    
	
	public Pedido(int numeroPedido, int numMesa) {
		LocalDateTime ahora = LocalDateTime.now();
		this.numeroPedido = numeroPedido;
		this.fecha = String.valueOf(ahora.getDayOfMonth()) + "-" + String.valueOf(ahora.getMonthValue()) + "-" + String.valueOf(ahora.getYear());
		this.hora = String.valueOf(ahora.getHour()) + ":" + String.valueOf(ahora.getMinute()) + ":" + String.valueOf(ahora.getSecond());
		this.estadoPedido = "En proceso";
		this.total = 0;
		this.cajero = null;
		this.cliente = new Cliente();
		this.mesa = new Mesa(numMesa);
		
	}
	
	public void registrarProductos() {
		int i = 0;
		String nomPro = "", tipo = "";
		Producto p = null;
		
		do {
			if (i == 0) {System.out.println("Registro de productos: ");}
			
			System.out.println("Ingrese el producto número " + ++i + " : ");
			nomPro = SC.next();
			System.out.println("Ingrese si es bebida o comida: ");
			tipo = SC.next();
			try {
				switch (tipo) {
				case "Bebida" : {
					p = new Bebida(nomPro);
				}
				case "Comida" : {
					p = new Comida(nomPro);
				}
				default:
					throw new IllegalArgumentException("Valor no permitido: " + tipo);
				}
			} catch (Exception e) {
				
			} finally {
				productos.add(p);
			}
		} while(i < 5);
	}
    
    //METODOS GET & SET
	public int getNumeroPedido() {
		return numeroPedido;
	}
	public ArrayList<Producto> getProductos() {
		return productos;
	}

	public void setProductos(ArrayList<Producto> productos) {
		this.productos = productos;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getEstadoPedido() {
		return estadoPedido;
	}
	public void setEstadoPedido(String estadoPedido) {
		this.estadoPedido = estadoPedido;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
    public Usuario getCliente() {
		return cliente;
	} 
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Usuario getCajero() {
		return cajero;
	}
	public void setCajero(Usuario cajero) {
		this.cajero = cajero;
	}
	public Mesa getMesa() {
		return mesa;
	}
	public void setMesa(Mesa mesa) {
		this.mesa = mesa;
	}
	public ComprobanteVenta getComprobante() {
		return comprobante;
	}
	public void setComprobante(ComprobanteVenta comprobante) {
		this.comprobante = comprobante;
	}
	//CONSTRUCOR

	
	public Pedido(int numeroPedido, String fecha, String hora, String estadoPedido, double total) {
		super();
		this.numeroPedido = numeroPedido;
		this.fecha = fecha;
		this.hora = hora;
		this.estadoPedido = estadoPedido;
		this.total = total;
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", fecha=" + fecha + ", hora=" + hora + ", estadoPedido="
				+ estadoPedido + ", total=" + total + "]";
	}
	
}