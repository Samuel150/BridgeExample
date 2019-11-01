package visitor;

public class Caballo implements IAnimal {

private String enfermedad;
	
	
	public String getEnfermedad() {
		return enfermedad;
	}
	
	
	
	
	
	public void setEnfermedad(String enfermedad) {
		this.enfermedad = enfermedad;
	}



	@Override
	public String accept(IVisitor visitor) {
		return visitor.visit(this);
	}
}
