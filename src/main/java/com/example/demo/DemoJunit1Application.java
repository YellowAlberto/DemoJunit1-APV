package com.example.demo;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.model.Articulo;
import com.example.service.CarritoCompraServiceI;
import com.example.service.CarritoCompraServiceImpl;

@SpringBootApplication
public class DemoJunit1Application implements CommandLineRunner{
	
	private CarritoCompraServiceI carrito = new CarritoCompraServiceImpl();

	public static void main(String[] args) {
		SpringApplication.run(DemoJunit1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Articulo> lista = carrito.getArticulosBBDD();
		for(Articulo articulo: lista) {
			System.out.println(articulo.getNombre());
		}
		
	}

}
