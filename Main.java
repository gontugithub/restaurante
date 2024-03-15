package restaurante;



import java.util.Scanner;

public class Main {
	
	static Restuarante r1 = new Restuarante("MULAN");
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		r1.agregarProductoCarta("Fideos Chinos", 4.5f, 5);
		r1.agregarProductoCarta("Arroz Tres Delicias", 9.5f, 20);
		r1.agregarProductoCarta("Pollo al limon", 10f, 30);
		r1.setNumeroclientes(0);

		introducirDatosCliente(nuevoEncargo());
		
	
		
		

		
		
		
		
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
	
	private static void introducirDatosCliente(Encargo encargo) {
		Cliente clienteNuevo = new Cliente();
		
		System.out.print("BIENVENIDO AL RESTAURANTE" + r1.getNombre()+"\n"+
			"INTRODUZCA SUS DATOS\n NOMBRE: ");
		clienteNuevo.setNombre(sc.next());
		System.out.print("DNI: ");
		clienteNuevo.setDni(sc.nextInt());
		System.out.print("TELEFONO: ");
		clienteNuevo.setNumerotelefono(sc.nextInt());
		
		encargo.setCliente(clienteNuevo);
	}
	
	private static Encargo nuevoEncargo() {
		Direccion direccion = new Direccion();
		Encargo nuevoEncargo = new Encargo(r1.getNumeroclientes(), direccion);
		
		r1.setNumeroclientes(r1.getNumeroclientes()+1);
		r1.agregarEncargo(nuevoEncargo);

		System.out.print("LOCALIDAD: ");
		direccion.setLocalidad(sc.nextLine());	
		System.out.print("CALLE: ");
		direccion.setCalle(sc.nextLine());
		System.out.print("NUMERO DE CALLE: ");
		direccion.setNumero(sc.nextInt());
		System.out.print("PISO (SI NO TIENES PONER 0): ");
		direccion.setPiso(sc.nextInt());
		System.out.print("LETRA (SI NO TIENES PONER 0): ");
		direccion.setLetra(sc.next().charAt(0));
		
		return nuevoEncargo;
		
	}
	
}
