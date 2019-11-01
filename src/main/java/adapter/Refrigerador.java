package adapter;

public class Refrigerador extends IArtefactosE2 {

	public Refrigerador(int costo, int tiempoDeGarantia) {
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
