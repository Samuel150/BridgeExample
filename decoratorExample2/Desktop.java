package decoratorExample2;

public class Desktop implements IComputadora {

	private int precio;
	
	public Desktop(int precio) {
		this.precio = precio;
	}

	@Override
	public void operation() {
		System.out.println("Precio : " + this.precio+ "Bs.");	
	}

	@Override
	public int getPrecio() {
		return this.precio;
	}
	

	

}
