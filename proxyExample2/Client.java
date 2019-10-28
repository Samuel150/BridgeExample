package proxyExample2;

public class Client {

	public static void main(String[] args) {
		IBanco cajero = new Cajero(new Moneda(Monedas.Bolivianos,15));
		cajero.deposito();
		cajero.retiro();
		cajero = new Cajero(new Moneda(Monedas.Dolares,20));
		cajero.deposito();
		cajero.retiro();
		cajero = new Cajero(new Moneda(Monedas.Euros,30));
		cajero.deposito();
		cajero.retiro();
		
	}
	
	enum Monedas {
		Bolivianos,Dolares,Euros
	}

}
