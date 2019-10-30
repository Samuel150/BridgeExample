package decoratorExample2;

public class TarjetaVideoGamer extends Decorator {
	
	private int precio;
	
	public TarjetaVideoGamer(IComputadora computadora,int precio) {
		super(computadora);
		this.precio=precio;
	}
	
	public void operation(){
		super.operation();
		System.out.println("Tarjeta Video Gamer con precio : "+this.precio+"Bs");
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
