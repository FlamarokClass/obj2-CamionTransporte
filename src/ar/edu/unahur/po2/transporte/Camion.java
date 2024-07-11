package ar.edu.unahur.po2.transporte;

public class Camion extends TransporteMotorizado {
	private static final int VOLUMEN_MAXIMO_CM3 = 20000000;
	private static final double PESO_MAXIMO = 16_000.0;

	@Override
	public Boolean puedeIrA(String destino) {
		return true;
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
