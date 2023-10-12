package avance;

import java.util.Date;

public class Pedido {
    public Pedido() {
    }
    private int numeroPedido;
    private String fecha;
    private String hora;
    private String estadoPedido;
    private double total;
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