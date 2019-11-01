package proxy;


public class Client {

	public static void main(String[] args) {
		IServidor proxy = new Proxy(new Archivo("hola.zip"));
		proxy.descarga();
		proxy.carga();
		proxy = new Proxy(new Archivo("chau.rar"));
		proxy.descarga();
		proxy.carga();
		
		proxy = new Proxy(new Archivo("chau.doc"));
		proxy.descarga();
		proxy.carga();
		
		proxy = new Proxy(new Archivo("chau.txt"));
		proxy.descarga();
		proxy.carga();
	}
	

}
