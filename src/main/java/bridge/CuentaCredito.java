package bridge;

public class CuentaCredito implements ICuenta {
	
	private IMoneda moneda;
	private double monto;
	private double interes = 1.02;
	
	public CuentaCredito(IMoneda moneda, int monto) {
		this.moneda=moneda;
		this.monto = monto;
	}
	
	@Override
	public void mostrarCuenta() {
		System.out.println("Cuenta de Credito");
		this.moneda.calularInteres(monto,interes);

	}

}
