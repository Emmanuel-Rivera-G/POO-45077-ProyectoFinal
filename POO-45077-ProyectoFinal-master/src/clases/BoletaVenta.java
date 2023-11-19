package clases;

import clases.Pedido;
import clases.Cliente;

public class BoletaVenta extends ComprobanteVenta {

	private int numeroBoleta;
	
	public BoletaVenta(int numeroComprobante, String fechaEmision, String detalles, double subTotal, double igv,
			boolean anulado, Pedido pedido, int numeroBoleta) {
		super(numeroComprobante, fechaEmision, detalles, subTotal, igv, anulado, pedido);
		this.numeroBoleta = numeroBoleta;
	}

	public double getNumeroBoleta() {
		return numeroBoleta;
	}

	public double getSubTotal() {
		return subTotal;
	}

	public void setNumeroBoleta(int numeroBoleta) {
		this.numeroBoleta = numeroBoleta;
	}

	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}

	@Override
	public String toString() {
		return "\n"+super.toString()+
				"\nTipo Comprobante : Boleta"+ 
				"\nNumero Boleta : "+ this.numeroBoleta + 
				"\nSub Total : " + this.subTotal+
				"\n|FINALIZADO| "+
				"\n------------------------------------"+
				"\n------------------------------------";



	}
}
