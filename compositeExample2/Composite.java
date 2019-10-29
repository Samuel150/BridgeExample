package compositeExample2;

import java.util.ArrayList;

public class Composite extends Component {

	private ArrayList<Component> list = new ArrayList<>();
	
	public Composite(String name) {
		super(name);
	}

	@Override
	public int calcEstimacion() {
		int ans = 0;
		for(Component comp : list){
			ans+=comp.calcEstimacion();
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
		if(list.get(position) instanceof Item){
			System.out.println(((Item) list.get(position)).getEstimacion());			
		}else{
			System.out.println(list.get(position));
		}

	}

}
