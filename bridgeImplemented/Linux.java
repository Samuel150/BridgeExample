package bridgeImplemented;

public class Linux implements ISistemaOperativo {

	private IArquitectura arquitectura;
	
	public Linux(IArquitectura arquitectura) {
		this.arquitectura=arquitectura;
	}
	
	@Override
	public void iniciarSistema() {
		System.out.println("iniciando Linux");
		this.arquitectura.configuracionArquitectura();

	}

}
