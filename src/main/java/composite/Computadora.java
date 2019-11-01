package composite;


public class Computadora extends Component {
	
	private int precio;

	public Computadora(String name, int precio) {
		super(name);
		this.precio=precio;
	}

	
	public int getPrecio() {
		return precio;
	}

	
	@Override
	public int calcPrecio() {
		System.out.println("\t "+this.getName()+" : "+this.getPrecio()+"$");
		return this.precio;

	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Computadora");

	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Computadora");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t Item : "+this.getPrecio());

	}



}
