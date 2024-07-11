package ar.edu.unahur.po2.transporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PaqueteTest {

	@Test
	void siMide3x5x2_Ocupa30cm3() {
		Integer alto = 3;
		Integer ancho = 5;
		Integer profundidad = 2;
		Double peso = 15.0;
		String destino = "Tesei";
		
		Integer volumenEsperado = 30;
		
		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		assertEquals(volumenEsperado, paquete.getVolumen());
	}

	@Test
	void siMide5x5x5_Ocupa125cm3() {
		Integer alto = 5;
		Integer ancho = 5;
		Integer profundidad = 5;
		Double peso = 15.0;
		String destino = "Tesei";
		
		Integer volumenEsperado = 125;
		
		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		assertEquals(volumenEsperado, paquete.getVolumen());
	}

	@Test
	void tieneUnPeso() {
		Integer alto = 5;
		Integer ancho = 5;
		Integer profundidad = 5;
		Double peso = 15.0;
		String destino = "Tesei";
		
		
		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		assertEquals(peso, paquete.getPeso());
	}

	@Test
	void tieneUnDestino() {
		Integer alto = 5;
		Integer ancho = 5;
		Integer profundidad = 5;
		Double peso = 15.0;
		String destino = "Tesei";
		
		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		assertEquals(destino, paquete.getDestino());
	}
	
}
