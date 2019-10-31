package facadeExample2;

public class Abogados {
	private String motivo;
	
	public Abogados(String motivo) {
		this.motivo=motivo;
	}
	
	public void solicitarAbogado(){
		if(this.motivo.equals("Casa")){
			System.out.println("Abogado 1");
		}else if(this.motivo.equals("Negocio")){
			System.out.println("Abogado 2");
		}else{
			System.out.println("Abogado Experto");
		}
	}
}
