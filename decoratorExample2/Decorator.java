package decoratorExample2;

public abstract class Decorator implements IComputadora {

	private int precio;
	
	private IComputadora computadora;
	
	public Decorator(IComputadora computadora) {
		this.computadora=computadora;
	}	

	
	@Override
	public void operation() {
		computadora.operation();
	}
	
	public int getPrecio(){
		return this.precio;
	}
	
	public IComputadora getComputadora(){
		return this.computadora;
	}
	
}
