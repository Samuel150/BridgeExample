package facadeExample2;

public class Arquitectos {
	private String motivo;
	
	public Arquitectos(String motivo) {
		this.motivo=motivo;
	}
	
	public void solicitarArquitecto(){
		if(this.motivo.equals("Casa")){
			System.out.println("Arquitecto 1");
		}else if(this.motivo.equals("Negocio")){
			System.out.println("Arquitecto 2");
		}else{
			System.out.println("Arquitecto Experto");
		}
	}
}
