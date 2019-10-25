package bridgeImplemented;

public class Windows implements ISistemaOperativo {
	
	private IArquitectura arquitectura;
	
	public Windows(IArquitectura arquitectura) {
		this.arquitectura=arquitectura;
	}
	
	@Override
	public void iniciarSistema() {
		System.out.println("Iniciando Windows");
		this.arquitectura.configuracionArquitectura();

	}

}
