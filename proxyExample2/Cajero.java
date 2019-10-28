package proxyExample2;

import proxyExample2.Client.Monedas;

public class Cajero implements IBanco {

	private Moneda moneda;
	private Banco banco = null;
	
	public Cajero(Moneda moneda) {
		this.moneda=moneda;
	}
	
	
	@Override
	public void deposito() {
		if(banco == null){
			this.banco=new Banco(moneda);
		}
		if(this.moneda.getTipo().equals(Monedas.Bolivianos)){
			this.banco.deposito();
		}else{
			System.out.println("Solo se aceptan deposito en Bolivianos");
			cambio(this.moneda);
			
		}

	}

	@Override
	public void retiro() {
		if(banco == null){
			this.banco=new Banco(moneda);
		}
		if(this.moneda.getTipo().equals(Monedas.Bolivianos)){
			this.banco.retiro();
		}else{
			System.out.println("Solo se aceptan retiro en Bolivianos");
			cambio(this.moneda);
			
		}
		

	}
	
	public void cambio(Moneda moneda){
		if(moneda.getTipo().equals(Monedas.Dolares)){
			System.out.println("Tipo de cambio : 1 dolar = 6.91 dolares");
		}else if(moneda.getTipo().equals(Monedas.Euros)){
			System.out.println("Tipo de cambio : 1 euro = 7.67 dolares");
		}
	}

}
