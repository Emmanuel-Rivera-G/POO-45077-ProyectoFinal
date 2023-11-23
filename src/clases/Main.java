package clases;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

import interfaces.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		/*Cliente cliente1 = new Cliente("Nombre","Apellido","987654321","direccion",
				"cliente1@ejemplo.com","123456789",2);
  
		Pedido pedido1 = new Pedido(001,"2023-09-12","15.00","En proceso",150.00);
  
		Bebida cafe = new Bebida("Cafï¿½", 15.00,"","00102","","Caliente",10.0);
  
		Comida croissant = new Comida("Croissant", 4.00,"","000101","","Pastel",5.0);
  
		BoletaVenta boleta1 = new BoletaVenta(10000,"2023-09-12","",001,19.00, false, pedido1, 0);
		
		System.out.println(cliente1.toString());
		System.out.println(pedido1.toString());
		System.out.println(cafe.toString());
		System.out.println(croissant.toString());
		System.out.println(boleta1.toString());*/
	
		AccionesComprobante comprobante = null;
		Pagos usuario3 = null;
		
		Empleado usuario1 = new Empleado("Ricardo", "Sanches","", "9988759", "Primero");
		usuario1.setCargo(new Mesero("M001", "Salon", null, 8, 1200));
		System.out.println("--Ingresar Pedido 1-- \nIngrese el nÃºmero de mesa: ");
		Pedido pedido1 = new Pedido(sc.nextInt());
		pedido1.registrarProductos();
		comprobante = new BoletaVenta(251, null, "Compras varias", 25, 0.18, false, pedido1, 001);
		comprobante.calcularTotal();
		System.out.println(usuario1 + "\n" + comprobante);
		
		Empleado usuario2 = new Empleado("Fancisco", "Perez","", "99587453", "segundo");
		usuario2.setCargo(new Cajero("C001", "Caja 1", null, 8, 1200));
		System.out.println("--Ingresar Pedido 2-- \nIngrese el nÃºmero de mesa: ");
		Pedido pedido2 = new Pedido(sc.nextInt());
		pedido2.registrarProductos();
		comprobante = new FacturaVenta(267, null, "Compras Varias", 75, 0.18, false, pedido2, 5, 157568);
		comprobante.calcularTotal();
		System.out.println(usuario2 + "\n" + comprobante);
		
		/*System.out.println("Ingresa la propina del mesero");
		usuario1.getCargo().setPropina(sc.next());*/
		
		Pagos cargo = new Gerente("A001", "Oficinas", null, 8, 1250, 0);
		cargo.CalcularPagos();
		System.out.println(cargo);
		cargo = new Mesero("C002", "Salon", null, 8, 500,50);
		cargo.CalcularPagos();
		System.out.println(cargo);
		
		
		
	}

}
