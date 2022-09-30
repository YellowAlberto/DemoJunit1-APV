package com.example.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.baseDatos.baseDatosI;
import com.example.model.Articulo;

@Service
public class CarritoCompraServiceImpl implements CarritoCompraServiceI{

	private List<Articulo> cesta = new ArrayList<Articulo>();
	
	
	@Autowired
	private baseDatosI baseDatos;
	
	
	@Override
	public void limpiarCesta() {
		cesta.clear();	
	}
	@Override
	public void addArticulo(Articulo articulo) {
		cesta.add(articulo);
	}
	@Override
	public int getNumArticulo() {
		return cesta.size();
	}
	@Override
	public List<Articulo> getArticulos() {
		return cesta;
	}
	@Override
	public double totalPrice() {
		double total = 0;
		for (Articulo articulo : cesta) {
			total = total + articulo.getPrecio();
		}
		return total;
	}
	@Override
	public double calculadorDescuento(double precio, double porcentajeDescuento) {
		return precio - (precio * (porcentajeDescuento/100)) ;
	}
	@Override
	public List<Articulo> getArticulosBBDD() {
		baseDatos.iniciarBBDD();
		return baseDatos.getArticulos();
	}
	@Override
	public Double aplicarDescuento(int id) {
		Articulo articulo = baseDatos.getArticuloById(id);
		if(articulo != null) {
			Double total = calculadorDescuento(articulo.getPrecio(), 10);
			return total;
		}else {
			System.out.println("No hay articulo con ese id");
		}
		return null;
	}
	@Override
	public Integer insertar(Articulo articulo) {
		Integer id = baseDatos.insertarArticulo(articulo);
		addArticulo(articulo);
		return id;
	}
	

}
