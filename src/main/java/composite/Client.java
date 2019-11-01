package composite;

public class Client {

	public static void main(String[] args) {
		Composite laboratorio = new Composite("laboratorio");
		laboratorio.add(new Computadora("computadora1", 100));
		laboratorio.add(new Computadora("computadora2", 100));
		laboratorio.add(new Computadora("computadora3", 100));
		
		Composite laboratorio2 = new Composite("laboratorio2");
		laboratorio2.add(new Computadora("computadora4", 100));
		laboratorio2.add(new Computadora("computadora5", 100));
		laboratorio2.add(new Computadora("computadora6", 100));
		
		Composite laboratorio3 = new Composite("laboratorio3");
		laboratorio3.add(new Computadora("computadora7", 100));
		laboratorio3.add(new Computadora("computadora8", 100));
		laboratorio3.add(new Computadora("computadora9", 100));
		
		Composite contenedor = new Composite("contenedor");
		contenedor.add(laboratorio);
		contenedor.add(laboratorio2);
		contenedor.add(laboratorio3);
	

		System.out.println("Precio Total Contenedor: "+contenedor.calcPrecio());
	}

}
