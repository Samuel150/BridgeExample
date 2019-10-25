package bridgeNotImplemented;

public class Mac implements ISistemaOperativo {

	@Override
	public void iniciarSistema32Bits() {
		System.out.println("Mac 32 bits");

	}

	@Override
	public void iniciarSistema64Bits() {
		System.out.println("Mac 64 bits");

	}

}
