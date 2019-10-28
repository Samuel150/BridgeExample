package proxyExample2;

import proxyExample2.Client.Monedas;

public class Moneda {
	private Monedas tipo;
	private int cantidad;
	
	public Moneda(Monedas tipo, int cantidad) {
		this.setTipo(tipo);
		this.setCantidad(cantidad);
	}

	public Monedas getTipo() {
		return tipo;
	}

	public void setTipo(Monedas tipo) {
		this.tipo = tipo;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
}
