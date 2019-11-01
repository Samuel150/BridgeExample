package proxy;

public class Servidor implements IServidor {

	Archivo file;
	
	public Servidor(Archivo file) {
		this.file=file;
	}
	@Override
	public void descarga() {
		System.out.println("Archivo : "+this.file.getFile()+" descargado del servidor principal");
	}
	@Override
	public void carga() {
		System.out.println("Archivo : "+this.file.getFile()+" cargado al servidor principal");
	}
	


}
