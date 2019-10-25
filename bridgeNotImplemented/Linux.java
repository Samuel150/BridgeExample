package bridgeNotImplemented;

public class Linux implements ISistemaOperativo {

	@Override
	public void iniciarSistema32Bits() {
		System.out.println("Linux 32 bits");

	}

	@Override
	public void iniciarSistema64Bits() {
		System.out.println("Linux 64 bits");

	}

}
