package facadeExample2;

public class FondoFinanciero {

	private double costo;
	
	public FondoFinanciero(double costo) {
		this.costo=costo;
	}
	
	public void solicitarFondo(){
		if(costo>7000){
			System.out.println("Fondo Financiero 1");
		}else{
			System.out.println("Fondo Financiero 2");
		}
	}
}
