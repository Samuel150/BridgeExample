package facadeExample2;

public class Cooperativas {
	
	private double costoDolares;
	
	public Cooperativas(double costoBolivianos) {
		this.costoDolares=costoBolivianos/7;
	}
	
	public void solicitarCooperativa(){
		if(this.costoDolares>500){
			System.out.println("Cooperativa 1");
		}else{
			System.out.println("Cooperativa 2");
		}
	}
}
