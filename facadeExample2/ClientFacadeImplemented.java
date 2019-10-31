package facadeExample2;


public class ClientFacadeImplemented {

	public static void main(String[] args) {
		AgenciaDePrestamos agenciaDePrestamos = new AgenciaDePrestamos(5000, "Negocio");
		agenciaDePrestamos.solicitarPrestamo();
	}

}
