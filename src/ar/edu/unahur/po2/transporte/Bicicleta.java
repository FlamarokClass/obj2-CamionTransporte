package ar.edu.unahur.po2.transporte;

public class Bicicleta extends Transporte {
	private static final int VOLUMEN_MAXIMO_CM3 = 125;
	private static final double PESO_MAXIMO = 15.0;
	private String destino = "";
	private Integer cantPaquetes = 0;
	
	public Bicicleta() {
		super();
	}

	public Bicicleta(String destino) {
		super();
		this.destino = destino;
	}

	public String getDestino() {
		return this.destino;
	}

	@Override
	public Boolean puedeIrA(String destino) {
		return destino == this.destino || this.destino == "";
	}
	
	@Override
	public Integer getVolumenMaximo() {
		return VOLUMEN_MAXIMO_CM3;
	}

	@Override
	public Double getPesoMaximo() {
		return PESO_MAXIMO;
	}
	
	@Override
	public void CargarPaquete(Paquete paquete) {
		cantPaquetes += 1;
	}
	
	
	@Override
	public Boolean puedeCargarPaquete(Paquete paquete) {
		return 	paquete.getVolumen() <= this.getVolumenMaximo() 
				&& 	paquete.getPeso() <= this.getPesoMaximo()
				&& this.cantPaquetes < 2;
	}
}
