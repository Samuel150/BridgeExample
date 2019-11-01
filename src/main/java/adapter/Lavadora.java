package adapter;

public class Lavadora extends IArtefactosE2 {

	public Lavadora(int costo, int tiempoDeGarantia) {
		super(costo, tiempoDeGarantia);
	}

	@Override
	public int getCosto() {
		
		return this.costo;
	}

	@Override
	public int getTiempoDeGarantia() {
		
		return this.tiempoDeGarantia;
	}

}
