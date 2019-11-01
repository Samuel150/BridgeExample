package adapter;

public class AdapterRefrigerador extends IArtefactosE1 {

	private Refrigerador refrigerador;
	
	public AdapterRefrigerador(Refrigerador refrigerador) {
		super(refrigerador.costo, refrigerador.tiempoDeGarantia);
		this.refrigerador= refrigerador;
	}

	@Override
	public int getPrecio() {
		return this.refrigerador.getCosto();
	}

	@Override
	public int getTiempoDeVida() {
		return this.refrigerador.getTiempoDeGarantia();
	}

}
