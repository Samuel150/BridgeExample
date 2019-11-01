package proxy;

public class Proxy implements IServidor {

	private Archivo file;
	private Servidor servidor = null;
	private ServidorSecundario servidorSec = null;

	public Proxy(Archivo file) {
		this.file = file;
	}

	@Override
	public void descarga() {
		serverInstance();
		if (isValidFile(file)) {
			servidor.descarga();
			servidorSec.descarga();
		} else {
			System.out.println("No se puede descargar archivos de tipo "
					+ file.getFile().substring(file.getFile().lastIndexOf(".")));
		}

	}

	@Override
	public void carga() {
		serverInstance();
		if (isValidFile(file)) {
			servidor.carga();
			servidorSec.carga();
		} else {
			System.out.println("No se puede cargar archivos de tipo "
					+ file.getFile().substring(file.getFile().lastIndexOf(".")));
		}

	}

	public boolean isValidFile(Archivo file) {
		return file.getFile().endsWith(".zip") || file.getFile().endsWith(".rar");
	}

	public void serverInstance() {
		if (servidor == null) {
			this.servidor = new Servidor(this.file);
		}
		if (servidorSec == null) {
			this.servidorSec = new ServidorSecundario(this.file);
		}
	}

}
