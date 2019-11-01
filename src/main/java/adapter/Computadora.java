package adapter;

public class Computadora extends IArtefactosE1 {

	
	public Computadora(int precio, int tiempoDeVida) {
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
