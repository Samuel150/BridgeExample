package decorator;

public class CuentaBanco implements ICuentaBanco {

	private double monto;
	private String nombrePropietario;
	
	public CuentaBanco(double monto, String nombrePropietario) {
		this.setMonto(monto);
		this.setNombre(nombrePropietario);
	}
	
	@Override
	public void operation() {
		System.out.println("Cuenta Bancaria con Monto : "+this.monto+" Propietario : "+this.nombrePropietario);
	}

	
	@Override
	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}
	@Override
	public String getNombre() {
		return nombrePropietario;
	}

	public void setNombre(String nombrePropietario) {
		this.nombrePropietario = nombrePropietario;
	}

	@Override
	public void reduceMonto(double monto) {
		this.monto-=monto;
		
	}

	@Override
	public void duplicateMonto() {
		this.monto*=2;
		
	}


}
