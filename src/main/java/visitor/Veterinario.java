package visitor;

public class Veterinario implements IVisitor {

	@Override
	public String visit(Gato gato) {
		return curar(gato.getEnfermedad());
	}

	@Override
	public String visit(Perro perro) {
		return curar(perro.getEnfermedad());
	}

	@Override
	public String visit(Caballo caballo) {
		return curar(caballo.getEnfermedad());
	}
	
	public String curar(String enfermedad){
		if(enfermedad.equals("enfermedad1")){
			return "Enfermedad "+enfermedad+" curada con inyecciones";
		}else if(enfermedad.equals("enfermedad2")){
			return "Enfermedad "+enfermedad+" curada con pastillas";
		}
		return "Enfermedad "+enfermedad+" no curada";
	}

}
