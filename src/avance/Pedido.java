package avance;

import java.time.LocalDateTime;
import java.util.Date;
import avance.cargo_paquete.Cajero;
import avance.comprobante_paquete.ComprobanteVenta;
import avance.usuario_paquete.Cliente;
import avance.usuario_paquete.Usuario;

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
    //METODOS GET & SET
	public int getNumeroPedido() {
		return numeroPedido;
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
	
	public Pedido(int numeroPedido, String fecha, String hora, String estadoPedido, double total) {
		super();
		this.numeroPedido = numeroPedido;
		this.fecha = fecha;
		this.hora = hora;
		this.estadoPedido = estadoPedido;
		this.total = total;
	}

	public Pedido(int n) {
	  this.mesa = new Mesa(n);
	}

	//TOSTRING
	@Override
	public String toString() {
		return "Pedido [numeroPedido=" + numeroPedido + ", fecha=" + fecha + ", hora=" + hora + ", estadoPedido="
				+ estadoPedido + ", total=" + total + "]";
	}
	
}