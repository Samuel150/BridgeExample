package adapter;

public class AdapterLavadora extends IArtefactosE1 {

	private Lavadora lavadora;
	
	public AdapterLavadora(Lavadora lavadora) {
		super(lavadora.costo, lavadora.tiempoDeGarantia);
		this.lavadora= lavadora;
	}

	@Override
	public int getPrecio() {
		return this.lavadora.getCosto();
	}

	@Override
	public int getTiempoDeVida() {
		return this.lavadora.getTiempoDeGarantia();
	}

}
