package ar.edu.unahur.po2.transporte;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class AutomovilTest {

	@Test
	void permiteDefinirUnaCiudad() {
		new Automovil("Tesei");
	}

	@Test
	void permiteDefinirDosCiudades() {
		new Automovil("Tesei", "Hurlingham");
	}

	@Test
	void permiteDefinirTresCiudades() {
		new Automovil("Tesei", "Hurlingham", "Morón");
	}

	@Test
	void puedeViajarSoloALasCiudadesEstablecidas() {
		Automovil auto = new Automovil("Tesei", "Hurlingham", "Morón");
		assertTrue(auto.puedeIrA("Tesei"));
		assertTrue(auto.puedeIrA("Hurlingham"));
		assertTrue(auto.puedeIrA("Morón"));
		assertFalse(auto.puedeIrA("Caseros"));
	}
	
	@Test
	void puedeLlevarHasta2m3() {
		Automovil auto = new Automovil("Tesei", "Hurlingham", "Morón");
		
		Paquete paquete1 = new Paquete(100, 100, 100, 15.0, "Tesei");
		Paquete paquete2 = new Paquete(100, 100, 100, 15.0, "Hurlingham");
		Paquete paquete3 = new Paquete(100, 100, 100, 15.0, "Morón");
		
		assertTrue(auto.puedeCargarPaquete(paquete1));
		auto.CargarPaquete(paquete1);
		assertTrue(auto.puedeCargarPaquete(paquete2));
		auto.CargarPaquete(paquete2);
		assertFalse(auto.puedeCargarPaquete(paquete3));		
	}
	
	@Test
	void puedeLlevarHasta500Kg() {
		Automovil auto = new Automovil("Tesei", "Hurlingham", "Morón");
		
		Paquete paquete1 = new Paquete(10, 100, 100, 200.0, "Tesei");
		Paquete paquete2 = new Paquete(10, 100, 100, 300.0, "Hurlingham");
		Paquete paquete3 = new Paquete(10, 100, 100, 15.0, "Morón");
		
		assertTrue(auto.puedeCargarPaquete(paquete1));
		auto.CargarPaquete(paquete1);
		assertTrue(auto.puedeCargarPaquete(paquete2));
		auto.CargarPaquete(paquete2);
		assertFalse(auto.puedeCargarPaquete(paquete3));		
	}	
	
}
