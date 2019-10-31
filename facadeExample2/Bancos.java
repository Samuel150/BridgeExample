package facadeExample2;

public class Bancos {

	private double costo;
	
	public Bancos(double costo) {
		this.costo=costo;
	}
	
	public void solicitarBanco(){
		if(this.costo>500){
			System.out.println("Mercantil Santa Cruz");
		}else{
			System.out.println("Banco Sol");
		}
	}
}
