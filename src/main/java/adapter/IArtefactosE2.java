package adapter;

public abstract class IArtefactosE2 {
	
	public int costo;
	public int tiempoDeGarantia;
	
	public IArtefactosE2(int costo, int tiempoDeGarantia) {
		this.costo=costo;
		this.tiempoDeGarantia=tiempoDeGarantia;
	}
	
	public abstract int getCosto();
	public abstract int getTiempoDeGarantia();
}
