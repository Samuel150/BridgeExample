package compositeExample2;


public abstract class Component {
	private String name;
	
	public Component(String name) {
		this.name=name;
		System.out.println("Constructor "+this.name);
	}

	public abstract int calcEstimacion();
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void getChild(int position);



	public String getName() {
		return name;
	}

}
