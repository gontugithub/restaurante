package ejercicio1_restaurante;

import java.util.ArrayList;

public class Restuarante {
	
	private String nombre;
	private ArrayList<Producto> carta = new ArrayList<>();
	private ArrayList<Encargo> encargos = new ArrayList<>();
	
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public ArrayList<Encargo> getEncargos() {
		return encargos;
	}


	public void setEncargos(ArrayList<Encargo> encargos) {
		this.encargos = encargos;
	}


	public Restuarante(String nombre) {
		this.nombre = nombre;
	}


	public void agregarProductoCarta(String nombre, float precio, int tiempopre) {
		carta.add(new Producto(nombre, precio, tiempopre));
	}
	
	public void agregarEncargo(Encargo encargo) {
		encargo.setNumeropedido(encargos.size());
		encargos.add(encargo);
	}


	public ArrayList<Producto> getCarta() {
		return carta;
	}


	public void setCarta(ArrayList<Producto> carta) {
		this.carta = carta;
	}
	
	

}
