package adapter;

public class Celular extends IArtefactosE1 {

	
	
	public Celular(int precio, int tiempoDeVida) {
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
