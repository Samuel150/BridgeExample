package adapter;

public class AdapterTelevisor extends IArtefactosE1 {
	
	private Televisor televisor;
	
	public AdapterTelevisor(Televisor televisor) {
		super(televisor.costo, televisor.tiempoDeGarantia);
		this.televisor= televisor;
	}

	@Override
	public int getPrecio() {
		return this.televisor.getCosto();
	}

	@Override
	public int getTiempoDeVida() {
		return this.televisor.getTiempoDeGarantia();
	}
	
	
	
	
}
