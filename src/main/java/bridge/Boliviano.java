package bridge;

public class Boliviano implements IMoneda {

	@Override
	public void calularInteres(double monto, double interes) {
		System.out.println("Interes : "+ monto*interes+" Bs.");
	}

}
