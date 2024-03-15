package restaurante;

public class Cliente {
	
	private String nombre;
	private int dni;
	private int numerotelefono;
	
	public Cliente(String nombre, int dni, int numerotelefono) {
		this.nombre = nombre;
		this.dni = dni;
		this.numerotelefono = numerotelefono;
	}

	public Cliente() {}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getNumerotelefono() {
		return numerotelefono;
	}

	public void setNumerotelefono(int numerotelefono) {
		this.numerotelefono = numerotelefono;
	}
	
	

}
