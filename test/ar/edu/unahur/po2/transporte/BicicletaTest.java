package ar.edu.unahur.po2.transporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BicicletaTest {

	@Test
	void puedeSerDefinidaSinUnDestino() {
		Bicicleta bici = new Bicicleta();
		assertEquals("", bici.getDestino());
	}

	@Test
	void alCrearseSePuedeDefinirUnDestino() {
		String destino = "Tesei";
		Bicicleta bici = new Bicicleta(destino);
		assertEquals(destino, bici.getDestino());
	}
	
	@Test
	void puedeIrADestinoDentroDeLaCiudad() {
		String destino = "Tesei";
		Bicicleta bici = new Bicicleta(destino);
		assertTrue(bici.puedeIrA(destino));
	}

	@Test
	void siNoSeDefinioDestino_AceptaCualquierDestino() {
		String destino = "Tesei";
		Bicicleta bici = new Bicicleta();
		assertTrue(bici.puedeIrA(destino));
	}
	
	
	@Test
	void noPuedeIrADestinoFueraDeLaCiudad() {
		String destino = "Tesei";
		String destinoViaje = "Hurlingham";
		Bicicleta bici = new Bicicleta(destino);
		assertFalse(bici.puedeIrA(destinoViaje));
	}
	
	@Test
	void puedeLlevarCargaDeMenosDe125cm3Y15Kg() {
		Integer alto = 3;
		Integer ancho = 5;
		Integer profundidad = 2;
		Double peso = 14.0;
		String destino = "Tesei";

		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		Bicicleta bici = new Bicicleta();
		assertTrue(bici.puedeCargarPaquete(paquete));
	}

	@Test
	void puedeLlevarCargaDeDe125cm3Y15Kg() {
		Integer alto = 5;
		Integer ancho = 5;
		Integer profundidad = 5;
		Double peso = 15.0;
		String destino = "Tesei";

		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		Bicicleta bici = new Bicicleta();
		assertTrue(bici.puedeCargarPaquete(paquete));
	}

	@Test
	void noPuedeLlevarCargaMayorA15Kg() {
		Integer alto = 5;
		Integer ancho = 5;
		Integer profundidad = 5;
		Double peso = 15.1;
		String destino = "Tesei";

		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		Bicicleta bici = new Bicicleta();
		assertFalse(bici.puedeCargarPaquete(paquete));
	}

	@Test
	void noPuedeLlevarCargaMayorA125cm3() {
		Integer alto = 5;
		Integer ancho = 6;
		Integer profundidad = 5;
		Double peso = 14.0;
		String destino = "Tesei";

		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		Bicicleta bici = new Bicicleta();
		assertFalse(bici.puedeCargarPaquete(paquete));
	}

	@Test
	void siNoTieneDestinoPuedeLlevarCargaACualquierDestino() {
		Integer alto = 5;
		Integer ancho = 5;
		Integer profundidad = 5;
		Double peso = 14.0;
		String destino = "Tesei";

		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		Bicicleta bici = new Bicicleta();
		assertTrue(bici.puedeLlevarPaquete(paquete));
	}

	@Test
	void siTieneDestinoPuedeLlevarCargaAMismoDestino() {
		Integer alto = 5;
		Integer ancho = 5;
		Integer profundidad = 5;
		Double peso = 14.0;
		String destino = "Tesei";

		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		Bicicleta bici = new Bicicleta(destino);
		assertTrue(bici.puedeLlevarPaquete(paquete));
	}

	@Test
	void noPuedeLlevarPaqueteAOtraCiudad() {
		Integer alto = 5;
		Integer ancho = 5;
		Integer profundidad = 5;
		Double peso = 14.0;
		String destino = "Tesei";

		Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);
		
		Bicicleta bici = new Bicicleta("Hurlingham");
		assertFalse(bici.puedeLlevarPaquete(paquete));
	}
	
	@Test
	void puedeLlevarDosPaquetes() {
		String destino = "Tesei";

		Paquete paquete1 = new Paquete(5, 5, 5, 15.0, destino);
		Paquete paquete2 = new Paquete(5, 5, 5, 15.0, destino);
		
		Bicicleta bici = new Bicicleta(destino);
		assertTrue(bici.puedeLlevarPaquete(paquete1));
		bici.CargarPaquete(paquete1);
		assertTrue(bici.puedeLlevarPaquete(paquete2));
	}

	@Test
	void noPuedeLlevarTresPaquetes() {
		String destino = "Tesei";

		Paquete paquete1 = new Paquete(5, 5, 5, 15.0, destino);
		Paquete paquete2 = new Paquete(5, 5, 5, 15.0, destino);
		Paquete paquete3 = new Paquete(5, 5, 5, 15.0, destino);
		
		Bicicleta bici = new Bicicleta(destino);
		assertTrue(bici.puedeLlevarPaquete(paquete1));
		bici.CargarPaquete(paquete1);
		assertTrue(bici.puedeLlevarPaquete(paquete2));
		bici.CargarPaquete(paquete1);
		assertFalse(bici.puedeLlevarPaquete(paquete3));
	}

}
