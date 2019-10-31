package facadeExample2;

public class Notarios {

	private String motivo;
	
	public Notarios(String motivo) {
		this.motivo=motivo;
	}
	
	public void solicitarNotario(){
		if(this.motivo.equals("Casa")){
			System.out.println("Notario 1");
		}else if(this.motivo.equals("Negocio")){
			System.out.println("Notario 2");
		}else{
			System.out.println("Notario Experto");
		}
	}
}
