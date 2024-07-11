package ar.edu.unahur.po2.transporte;

public class Automovil extends TransporteMotorizado{
	private static final int VOLUMEN_MAXIMO_CM3 = 2000000;
	private static final double PESO_MAXIMO = 500.0;
	
	private String destino1;
	private String destino2;
	private String destino3;

	public Automovil(String ciudad) {
		super();
		this.destino1 = ciudad;
	}

	public Automovil(String ciudad1, String ciudad2) {
		super();
		this.destino1 = ciudad1;
		this.destino2 = ciudad2;
	}

	public Automovil(String ciudad1, String ciudad2, String ciudad3) {
		super();
		this.destino1 = ciudad1;
		this.destino2 = ciudad2;
		this.destino3 = ciudad3;
	}

	@Override
	public Boolean puedeIrA(String destino) {
		return 	destino == this.destino1 ||
				destino == this.destino2 ||
				destino == this.destino3;
	}

	@Override
	public Integer getVolumenMaximo() {
		return VOLUMEN_MAXIMO_CM3;
	}

	@Override
	public Double getPesoMaximo() {
		return PESO_MAXIMO;
	}

}
