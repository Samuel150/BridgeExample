package bridgeNotImplemented;

public class Windows implements ISistemaOperativo {

	@Override
	public void iniciarSistema32Bits() {
		System.out.println("Windows 32 bits");
		
	}

	@Override
	public void iniciarSistema64Bits() {
		System.out.println("Windows 64 bits");
		
	}



}
