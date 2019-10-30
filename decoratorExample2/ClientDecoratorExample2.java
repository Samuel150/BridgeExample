package decoratorExample2;

public class ClientDecoratorExample2 {

	public static void main(String[] args) {
		IComputadora computadora = new Desktop(100);
		computadora = new TecladoGamer(computadora,10);
		computadora = new MouseGamer(computadora,15);
		computadora = new TarjetaVideoGamer(computadora,25);
		computadora = new MonitorSamsung(computadora,50);
		
		computadora.operation();
		
	}

}
