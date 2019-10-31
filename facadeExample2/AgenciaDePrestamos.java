package facadeExample2;

public class AgenciaDePrestamos {
	Bancos banco;
	Cooperativas cooperativa;
	FondoFinanciero fondoFinanciero;
	Abogados abogado;
	Notarios notario;
	Arquitectos arquitecto;
	
	public AgenciaDePrestamos(double costo, String motivo) {
		banco = new Bancos(costo);
		cooperativa = new Cooperativas(costo);
		fondoFinanciero = new FondoFinanciero(costo);
		abogado = new Abogados(motivo);
		notario = new Notarios(motivo);
		arquitecto = new Arquitectos(motivo);
		
	}
	
	public void solicitarPrestamo(){
		banco.solicitarBanco();
		cooperativa.solicitarCooperativa();
		fondoFinanciero.solicitarFondo();
		abogado.solicitarAbogado();
		notario.solicitarNotario();
		arquitecto.solicitarArquitecto();
	}
}
