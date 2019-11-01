package adapter;

public class Tablet extends IArtefactosE1 {

	public Tablet(int precio, int tiempoDeVida) {
		super(precio, tiempoDeVida);
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}

	@Override
	public int getTiempoDeVida() {
		return this.tiempoDeVida;
	}


	

}
