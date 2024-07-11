package ar.edu.unahur.po2.transporte;

public class Paquete {

	private Integer alto;
	private Integer profundidad;
	private Integer ancho;
	private Double peso;
	private String ciudad;

	public Paquete(Integer alto, Integer ancho, Integer profundidad, Double peso, String ciudad) {
		this.alto = alto;
		this.ancho = ancho;
		this.profundidad = profundidad;
		this.peso = peso;
		this.ciudad = ciudad;
	}

	public Integer getVolumen() {
		return this.alto * this.ancho * this.profundidad;
	}

	public Double getPeso() {
		return this.peso;
	}

	public String getDestino() {
		return this.ciudad;
	}

}
