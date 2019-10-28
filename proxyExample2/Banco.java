package proxyExample2;

public class Banco implements IBanco {

	Moneda moneda;
	int cantidad;
	public Banco(Moneda moneda) {
		this.moneda=moneda;
	}
	@Override
	public void deposito() {
		System.out.println("Deposito --> Tipo : " +this.moneda.getTipo()+" Cantidad : "+this.moneda.getCantidad());
		
	}
	@Override
	public void retiro() {
		System.out.println("Retiro --> Tipo : " +this.moneda.getTipo()+" Cantidad : "+this.moneda.getCantidad());
		
	}
	


}
