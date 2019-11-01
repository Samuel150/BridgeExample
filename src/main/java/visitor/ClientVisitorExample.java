package visitor;

public class ClientVisitorExample {
	public static void main(String[] args) {
		Gato gato = new Gato();
		gato.setEnfermedad("enfermedad1");
		Perro perro = new Perro();
		perro.setEnfermedad("enfermedad2");
		Caballo caballo = new Caballo();
		caballo.setEnfermedad("enfermedad3");
		
		Veterinario visitor = new Veterinario();
		
		System.out.println("Gato : "+gato.accept(visitor) );
		System.out.println("Perro : "+perro.accept(visitor) );
		System.out.println("Caballo : "+caballo.accept(visitor));	
		
	}
	
	
}
