package ar.edu.unahur.po2.transporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CamionTest {

	@Test
	void puedeViajarACualquierDestino() {
		Camion camion = new Camion();
		assertTrue(camion.puedeIrA("Tesei"));
		assertTrue(camion.puedeIrA("Hurlingham"));
		assertTrue(camion.puedeIrA("Morón"));
	}
	
	@Test
	void puedeLlevarHasta20m3() {
		Camion camion = new Camion();
		
		Paquete paquete1 = new Paquete(1000, 100, 100, 15.0, "Tesei");
		Paquete paquete2 = new Paquete(1000, 100, 100, 15.0, "Hurlingham");
		Paquete paquete3 = new Paquete(100, 100, 100, 15.0, "Morón");
		
		assertTrue(camion.puedeCargarPaquete(paquete1));
		camion.CargarPaquete(paquete1);
		assertTrue(camion.puedeCargarPaquete(paquete2));
		camion.CargarPaquete(paquete2);
		assertFalse(camion.puedeCargarPaquete(paquete3));		
	}
	
	@Test
	void puedeLlevarHasta16Tons() {
		Camion camion = new Camion();
		
		Paquete paquete1 = new Paquete(10, 100, 100, 10_000.0, "Tesei");
		Paquete paquete2 = new Paquete(10, 100, 100, 6_000.0, "Hurlingham");
		Paquete paquete3 = new Paquete(10, 100, 100, 15.0, "Morón");
		
		assertTrue(camion.puedeCargarPaquete(paquete1));
		camion.CargarPaquete(paquete1);
		assertTrue(camion.puedeCargarPaquete(paquete2));
		camion.CargarPaquete(paquete2);
		assertFalse(camion.puedeCargarPaquete(paquete3));		
	}	
}
