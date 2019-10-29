package compositeExample2;

public class Item extends Component {
	
	private int estimacion;

	public Item(String name, int estimacion) {
		super(name);
		this.estimacion=estimacion;
	}

	
	public int getEstimacion() {
		return estimacion;
	}

	
	@Override
	public int calcEstimacion() {
		System.out.println("\t Item : "+this.getEstimacion());
		return this.estimacion;

	}

	@Override
	public void add(Component component) {
		System.out.println("not applicable on Item");

	}

	@Override
	public void remove(Component component) {
		System.out.println("not applicable on Item");

	}

	@Override
	public void getChild(int position) {
		System.out.println("\t Item : "+this.getEstimacion());

	}



}
