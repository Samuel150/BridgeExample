package decorator;

public abstract class Decorator implements ICuentaBanco {

	private ICuentaBanco componente;
	
	public Decorator(ICuentaBanco componente) {
		this.componente=componente;
	}
	
	@Override
	public void operation() {
		componente.operation();

	}
	
	public ICuentaBanco getCuentaBanco(){
		return this.componente;
	}
	
	
}
