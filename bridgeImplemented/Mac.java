package bridgeImplemented;

public class Mac implements ISistemaOperativo {

	
	private IArquitectura arquitectura;
	
	public Mac(IArquitectura arquitectura) {
		this.arquitectura=arquitectura;
	}
	
	@Override
	public void iniciarSistema() {
		System.out.println("Iniciando Mac");
		this.arquitectura.configuracionArquitectura();
	}

}
