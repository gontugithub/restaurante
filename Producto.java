package ejercicio1_restaurante;

public class Producto {
	
	private String nombre;
	private float precio;
	private int tiempoPreparacion;
	
	
	public Producto(String nombre, float precio, int tiempoPreparacion) {
		this.nombre = nombre;
		this.precio = precio;
		this.tiempoPreparacion = tiempoPreparacion;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public float getPrecio() {
		return precio;
	}


	public void setPrecio(float precio) {
		this.precio = precio;
	}


	public int getTiempoPreparacion() {
		return tiempoPreparacion;
	}


	public void setTiempoPreparacion(int tiempoPreparacion) {
		this.tiempoPreparacion = tiempoPreparacion;
	}
	
	
	
	
	
	
	

}
