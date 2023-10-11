package primer_avance;

import primer_avance.comprobante_paquete.*;
import primer_avance.usuario_paquete.*;
import producto_paquete.*;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Nombre","Apellido","987654321","direccion",
				"cliente1@ejemplo.com","123456789",2);
  
		Pedido pedido1 = new Pedido(001,"2023-09-12","15.00","En proceso",150.00);
  
		Bebida cafe = new Bebida("Caf�", 15.00,"","00102","","Caliente",10.0);
  
		Comida croissant = new Comida("Croissant", 4.00,"","000101","","Pastel",5.0);
  
		BoletaVenta boleta1 = new BoletaVenta(10000,"2023-09-12","",001,19.00);
		
		System.out.println(cliente1.toString());
		System.out.println(pedido1.toString());
		System.out.println(cafe.toString());
		System.out.println(croissant.toString());
		System.out.println(boleta1.toString());
	}

}
