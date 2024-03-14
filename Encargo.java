package restaurante;

import java.util.ArrayList;

public class Encargo {
	
	private int numeropedido;
	private Direccion direccion;
	private ArrayList<Producto> listaProductos = new ArrayList<>();
	private Cliente cliente;
	

	public Encargo(int numeropedido, Direccion direccion) {
		this.numeropedido = numeropedido;
		this.direccion = direccion;
	}


	public void nuevoProducto(Producto producto){
		listaProductos.add(producto);
		
	}


	public int getNumeropedido() {
		return numeropedido;
	}


	public void setNumeropedido(int numeropedido) {
		this.numeropedido = numeropedido;
	}


	public Direccion getDireccion() {
		return direccion;
	}


	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}


	public ArrayList<Producto> getListaProductos() {
		return listaProductos;
	}


	public void setListaProductos(ArrayList<Producto> listaProductos) {
		this.listaProductos = listaProductos;
	}
	
	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	

}
