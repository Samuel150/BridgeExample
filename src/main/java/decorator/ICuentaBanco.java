package decorator;

public interface ICuentaBanco {
	public void operation();
	
	public double getMonto();
	public String getNombre();
	public void reduceMonto(double monto);
	public void duplicateMonto();
}
