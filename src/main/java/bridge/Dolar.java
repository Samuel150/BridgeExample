package bridge;

public class Dolar implements IMoneda {

	@Override
	public void calularInteres(double monto, double interes) {
		System.out.println("Interes : "+ (monto*7)*interes+" Bs.");

	}

}
