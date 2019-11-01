package bridge;

public class CuentaPlazoFijo implements ICuenta {

	
	private IMoneda moneda;
	private double monto;
	private double interes = 1.05;
	
	public CuentaPlazoFijo(IMoneda moneda, int monto) {
		this.moneda=moneda;
		this.monto=monto;
	}
	
	@Override
	public void mostrarCuenta() {
		System.out.println("Cuenta a Plazo Fijo");
		this.moneda.calularInteres(monto,interes);
	}

}
