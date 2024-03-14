package restaurante;

import java.io.ObjectInputStream.GetField;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
	
	static Restuarante r1 = new Restuarante("MULAN");
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		r1.agregarProductoCarta("Fideos Chinos", 4.5f, 5);
		r1.agregarProductoCarta("Arroz Tres Delicias", 9.5f, 20);
		r1.agregarProductoCarta("Pollo al limon", 10f, 30);
		r1.setNumeroclientes(0);
		
		
		introducirDatosCliente();
		
		

			addProducto();
			preguntarQuiereOtroPlato();
	
		
		

		
		
		
		
	}


	private static void addProducto() {
		System.out.print("\n SELECCIONE PLATOS\n\n");
		for (int i = 0; i < r1.getCarta().size(); i++) {
			System.out.println(" - " + r1.getCarta().get(i).getNombre() + " ["+i+"]");
		}
		System.out.print("\n > ");
		r1.getEncargos().get(0).nuevoProducto(r1.getCarta().get(sc.nextInt()));
	}
	
	private static void preguntarQuiereOtroPlato() {
		System.out.println("QUIERE OTRO PLATO (S/N)");
		if(sc.next().toUpperCase().equals("S")) {
			addProducto();
			preguntarQuiereOtroPlato();
		}
		
	}
	
	private static void introducirDatosCliente() {
		System.out.print("BIENVENIDO AL RESTAURANTE" + r1.getNombre()+"\n"+
			"INTRODUZCA SUS DATOS\n NOMBRE: ");
		r1.getEncargos().get(0).getCliente().setNombre(sc.next());
		System.out.print("DNI: ");
		r1.getEncargos().get(0).getCliente().setDni(sc.nextInt());
		System.out.print("TELEFONO: ");
		r1.getEncargos().get(0).getCliente().setNumerotelefono(sc.nextInt());
	}
	
	private static void nuevoEncargo() {
		r1.setNumeroclientes(r1.getNumeroclientes()+1);
		r1.agregarEncargo(new Encargo(r1.getNumeroclientes(), new Direccion()));
		System.out.println("LOCALIDAD: ");
		r1.getEncargos().get(r1.getEncargos().size()).getDireccion().setCalle(sc.next());	}
	
}
