package bridgeImplemented;

public class ClientBridgeImplemented {

	public static void main(String[] args) {
		Arquitectura32Bits arquitectura32Bits = new Arquitectura32Bits();
		Arquitectura64Bits arquitectura64Bits = new Arquitectura64Bits();
		Windows windows = new Windows(arquitectura64Bits);
		Linux linux = new Linux(arquitectura64Bits);
		Mac mac = new Mac(arquitectura32Bits);
		
		windows.iniciarSistema();
		linux.iniciarSistema();
		mac.iniciarSistema();

	}

}
