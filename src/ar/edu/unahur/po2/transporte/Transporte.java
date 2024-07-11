package ar.edu.unahur.po2.transporte;

public abstract class Transporte {

	public abstract Boolean puedeIrA(String destino);
	public abstract Double getPesoMaximo();
	public abstract Integer getVolumenMaximo();
	public abstract Boolean puedeCargarPaquete(Paquete paquete);
	public abstract void CargarPaquete(Paquete paquete);

	public Boolean puedeLlevarPaquete(Paquete paquete) {
		return this.puedeCargarPaquete(paquete) && this.puedeIrA(paquete.getDestino());
	}

}
