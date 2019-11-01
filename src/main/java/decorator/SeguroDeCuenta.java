package decorator;

public class SeguroDeCuenta extends Decorator {

	public SeguroDeCuenta(ICuentaBanco componente) {
		super(componente);
	}
	
	public void operation(){
		super.operation();
		System.out.println("Seguro de Cuenta");
		descontarParaSeguro();
		System.out.println("Cuenta Bancaria con Monto : "+super.getCuentaBanco().getMonto()+" Propietario : "+super.getCuentaBanco().getNombre());
;
	}

	public void descontarParaSeguro(){
		reduceMonto(10);
	}

	@Override
	public double getMonto() {
		return super.getCuentaBanco().getMonto();
	}
	
	@Override
	public void reduceMonto(double monto) {
		super.getCuentaBanco().reduceMonto(monto);
		
	}

	@Override
	public void duplicateMonto() {
		super.getCuentaBanco().duplicateMonto();
	}

	@Override
	public String getNombre() {
		return super.getCuentaBanco().getNombre();

	}
}
