package bridge;

public class Euro implements IMoneda {

	@Override
	public void calularInteres(double monto, double interes) {
		System.out.println("Interes : "+ (monto*9)*interes+" Bs.");

	}

}
