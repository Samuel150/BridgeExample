package facadeExample2;

public class ClientFacadeNotImplemented {

	public static void main(String[] args) {
		Bancos bancos = new Bancos(5000);
		Cooperativas cooperativas = new Cooperativas(5000);
		FondoFinanciero fondoFinanciero = new FondoFinanciero(5000);
		Abogados abogados = new Abogados("Negocio");
		Notarios notarios = new Notarios("Negocio");
		Arquitectos arquitectos = new Arquitectos("Negocio");
		
		bancos.solicitarBanco();
		cooperativas.solicitarCooperativa();
		fondoFinanciero.solicitarFondo();
		abogados.solicitarAbogado();
		notarios.solicitarNotario();
		arquitectos.solicitarArquitecto();

	}

}
