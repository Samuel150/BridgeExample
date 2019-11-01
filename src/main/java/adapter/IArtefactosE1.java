package adapter;

public abstract class IArtefactosE1 {
	
	public int precio;
	public int tiempoDeVida;
	
	public IArtefactosE1(int precio, int tiempoDeVida) {
		this.precio=precio;
		this.tiempoDeVida=precio;
	}
	
	public abstract int getPrecio();
	public abstract int getTiempoDeVida();//dias
}
