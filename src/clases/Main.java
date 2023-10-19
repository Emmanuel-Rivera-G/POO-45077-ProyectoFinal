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
  
		Bebida cafe = new Bebida("Caf�", 15.00,"","00102","","Caliente",10.0);
  
		Comida croissant = new Comida("Croissant", 4.00,"","000101","","Pastel",5.0);
  
		BoletaVenta boleta1 = new BoletaVenta(10000,"2023-09-12","",001,19.00, false, pedido1, 0);
		
		System.out.println(cliente1.toString());
		System.out.println(pedido1.toString());
		System.out.println(cafe.toString());
		System.out.println(croissant.toString());
		System.out.println(boleta1.toString());*/
		
		AccionesComprobante comprobante = null;
		Pagos usuario3 = null;
		
		Empleado usuario1 = new Empleado("Nom", "Apell", "999", "mañana");
		usuario1.setCargo(new Mesero("001", "Ambiente", null, 0, 0));
		System.out.println("--Ingresar Pedido 1-- \nIngrese el número de mesa: ");
		Pedido pedido1 = new Pedido(sc.nextInt());
		pedido1.registrarProductos();
		comprobante = new BoletaVenta(001, null, null, 0, 0, false, pedido1, 001);
		comprobante.calcularTotal();
		System.out.println(usuario1 + "\n" + comprobante);
		
		Empleado usuario2 = new Empleado("Nom", "Apell", "995", "noche");
		usuario2.setCargo(new Cajero("001", "Ambiente", null, 0, 0));
		System.out.println("--Ingresar Pedido 2-- \nIngrese el número de mesa: ");
		Pedido pedido2 = new Pedido(sc.nextInt());
		pedido2.registrarProductos();
		comprobante = new FacturaVenta(0, null, null, 0, 0, false, pedido2, 0, 0);
		comprobante.calcularTotal();
		System.out.println(usuario2 + "\n" + comprobante);
		
		/*System.out.println("Ingresa la propina del mesero");
		usuario1.getCargo().setPropina(sc.next());*/
		
		usuario3 = new Cajero(null, null, null, 0, 1000, 200);
		System.out.println("Sueldo Cajero: " + usuario3.CalcularPagos());
		
		usuario3 = new Mesero(null, null, null, 0, 1000, 150);
		System.out.println("Sueldo Mesero: " + usuario3.CalcularPagos());
	}

}
