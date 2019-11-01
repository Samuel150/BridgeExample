package bridge;

public class CuentaAhorro implements ICuenta {

	private IMoneda moneda;
	private double monto;
	private double interes = 1.0;
	
	public CuentaAhorro(IMoneda moneda, int monto) {
		this.moneda=moneda;
		this.monto=monto;
	}
	
	@Override
	public void mostrarCuenta() {
		System.out.println("Cuenta de Ahorro");
		this.moneda.calularInteres(monto, interes);

	}

}
