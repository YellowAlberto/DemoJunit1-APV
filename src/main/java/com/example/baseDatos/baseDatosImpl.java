package com.example.baseDatos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.model.Articulo;

@Service
public class baseDatosImpl implements baseDatosI{

	private Map<Integer,Articulo> baseDatos = new HashMap<>();
	@Override
	public void iniciarBBDD() {
		baseDatos.put(1,  new Articulo ("pantalon", 30));
		baseDatos.put(2,  new Articulo ("camisa", 20));
		baseDatos.put(3,  new Articulo ("zapatos", 70));
		baseDatos.put(4,  new Articulo ("jersey", 35));
		
	}
	@Override
	public List<Articulo> getArticulos() {
		List<Articulo> listaArticulos = new ArrayList<>();
		for(Map.Entry<Integer, Articulo> entry: baseDatos.entrySet()) {
			listaArticulos.add(entry.getValue());
		}
		return listaArticulos;
	}
	
	@Override
	public Articulo getArticuloById(Integer id) {
		return baseDatos.get(id);
	}
	@Override
	public Integer insertarArticulo(Articulo articulo) {
		baseDatos.put(5, articulo);
		Integer id = 0;
		for(Map.Entry<Integer, Articulo> entry: baseDatos.entrySet()){
			id = entry.getKey();
			}		
		return id;
		
	}
	


}
