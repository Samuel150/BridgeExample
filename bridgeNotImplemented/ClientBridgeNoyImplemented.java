package bridgeNotImplemented;

public class ClientBridgeNoyImplemented {
	public static void main(String[] args) {
		Windows windows = new Windows();
		windows.iniciarSistema32Bits();
		windows.iniciarSistema64Bits();
		Linux linux = new Linux();
		linux.iniciarSistema32Bits();
		linux.iniciarSistema64Bits();
		Mac mac = new Mac();
		mac.iniciarSistema32Bits();
		mac.iniciarSistema64Bits();
	}
}
