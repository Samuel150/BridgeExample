package proxy;

public class ServidorSecundario implements IServidor {

	Archivo file;
	
	public ServidorSecundario(Archivo file) {
		this.file=file;
	}
	@Override
	public void descarga() {
		System.out.println("Archivo : "+this.file.getFile()+" descargado del servidor secundario");
	}
	@Override
	public void carga() {
		System.out.println("Archivo : "+this.file.getFile()+" cargado al servidor secundario");
	}

}
