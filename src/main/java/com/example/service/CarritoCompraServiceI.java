package com.example.service;

import java.util.List;

import com.example.model.Articulo;

public interface CarritoCompraServiceI {

	public void limpiarCesta();
	
	public void addArticulo(Articulo a);
	
	public int getNumArticulo();
	
	public List<Articulo> getArticulos();
	
	public double totalPrice();
	
	public double calculadorDescuento(double precio, double porcentajeDescuento);
	
	public List<Articulo> getArticulosBBDD();
	
	public Double aplicarDescuento(int id);
	
	public Integer insertar(Articulo articulo);
}
