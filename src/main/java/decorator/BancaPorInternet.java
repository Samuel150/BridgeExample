package decorator;

public class BancaPorInternet extends Decorator {

	private boolean enable;
	
	public BancaPorInternet(ICuentaBanco componente) {
		super(componente);
	}
	
	public void operation(){
		super.operation();
		System.out.println("Banca por Internet");
		this.enable	= true;
		System.out.println("Adding Banca por Internet "+this.enable);
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
