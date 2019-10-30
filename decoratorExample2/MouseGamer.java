package decoratorExample2;

public class MouseGamer extends Decorator {

	private int precio;
	
	public MouseGamer(IComputadora computadora,int precio) {
		super(computadora);
		this.precio=precio;
	}
	
	public void operation(){
		super.operation();
		System.out.println("Mouse Gamer con precio : "+this.precio+"Bs");
		System.out.println("Precio Total : "+(this.precio+super.getComputadora().getPrecio())+"Bs");
		sumarPrecio(super.getComputadora().getPrecio());
		
	}
	
	public void sumarPrecio(int precio){
		this.precio+=precio;
	}
	
	public int getPrecio(){
		return this.precio;
	}
}
