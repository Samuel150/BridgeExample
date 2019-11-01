package composite;

import java.util.ArrayList;


public class Composite extends Component {

	private ArrayList<Component> list = new ArrayList<>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public int calcPrecio() {
		int ans = 0;
		for(Component comp : list){
			ans+=comp.calcPrecio();
		}
		return ans;

	}

	@Override
	public void add(Component component) {
		list.add(component);

	}

	@Override
	public void remove(Component component) {
		list.remove(component);

	}

	@Override
	public void getChild(int position) {
		if(list.get(position) instanceof Computadora){
			System.out.println(((Computadora) list.get(position)).getPrecio());			
		}else{
			System.out.println(list.get(position));
		}

	}

}
