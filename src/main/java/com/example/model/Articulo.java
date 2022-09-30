package com.example.model;

public class Articulo {

	private String nombre;
	
	private double precio;
	
	public Articulo(String nombre, double precio) {
		this.setNombre(nombre);
		this.setPrecio(precio);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
