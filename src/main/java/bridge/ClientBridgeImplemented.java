package bridge;

public class ClientBridgeImplemented {

	public static void main(String[] args) {
		Boliviano boliviano = new Boliviano();
		Dolar dolar = new Dolar();
		Euro euro = new Euro();
		CuentaCredito cuentaCredito = new CuentaCredito(dolar,150);
		CuentaAhorro cuentaAhorro = new CuentaAhorro(boliviano,700);
		CuentaPlazoFijo cuentaPlazoFijo = new CuentaPlazoFijo(euro,200);
		
		cuentaCredito.mostrarCuenta();
		cuentaAhorro.mostrarCuenta();
		cuentaPlazoFijo.mostrarCuenta();
		
	}

}
