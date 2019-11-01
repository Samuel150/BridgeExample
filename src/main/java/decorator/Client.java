package decorator;

public class Client {

	public static void main(String[] args) {
		ICuentaBanco cuentaBanco = new CuentaBanco(7000,"Samuel");
		cuentaBanco = new BancaPorInternet(cuentaBanco);
		cuentaBanco = new SeguroDeCuenta(cuentaBanco);
		cuentaBanco = new Promocion(cuentaBanco);
		
		cuentaBanco.operation();

	}

}
