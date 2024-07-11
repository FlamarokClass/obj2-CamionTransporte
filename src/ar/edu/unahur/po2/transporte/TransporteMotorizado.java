package ar.edu.unahur.po2.transporte;

public abstract class TransporteMotorizado extends Transporte {
	private Integer volumenTotal = 0;
	private Double pesoTotal = 0.0;

	public Integer getVolumenActual() {
		return this.volumenTotal;
	}
	
	public Double getPesoActual() {
		return this.pesoTotal;
	}

	@Override
	public void CargarPaquete(Paquete paquete) {
		this.volumenTotal += paquete.getVolumen();
		this.pesoTotal += paquete.getPeso();
	}

	@Override
	public Boolean puedeCargarPaquete(Paquete paquete) {
		return 	this.getVolumenActual() + paquete.getVolumen() <= this.getVolumenMaximo() 
			&& 	this.getPesoActual() + paquete.getPeso() <= this.getPesoMaximo();
	}
	
}
