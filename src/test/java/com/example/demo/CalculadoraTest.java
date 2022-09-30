package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTest {

	@Test
	void testSuma() {
		Calculadora calculadora = new Calculadora();
		Integer resultado = calculadora.suma(2, 3);
		assertEquals(4, resultado);
	}

}
