package adapter;

public class Televisor extends IArtefactosE2 {

	public Televisor(int costo, int tiempoDeGarantia) {
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
