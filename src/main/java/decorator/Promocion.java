package decorator;

public class Promocion extends Decorator {

	public Promocion(ICuentaBanco componente) {
		super(componente);
	}

	public void operation(){
		super.operation();
		System.out.println("Promocion");
		promocionLuck();
	}

	public void promocionLuck(){
		int suerte = (int)(Math.random()*2+1);
		if(suerte%2==0){
			duplicateMonto();
			System.out.println("Cuenta Bancaria con Monto : "+super.getCuentaBanco().getMonto()+" Propietario : "+super.getCuentaBanco().getNombre());
		}else{
			System.out.println("Mejor suerte a la siguiente");
		}
	}

	@Override
	public double getMonto() {
		return super.getCuentaBanco().getMonto();
	}

	@Override
	public void reduceMonto(double monto) {
		super.getCuentaBanco().reduceMonto(0);
		
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
