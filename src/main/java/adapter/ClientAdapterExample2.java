package adapter;

import java.util.ArrayList;

public class ClientAdapterExample2 {
	public static void main(String[] args) {
		
		Televisor televisor = new Televisor(100,300);
		AdapterTelevisor adapterTelevisor = new AdapterTelevisor(televisor);
		Lavadora lavadora = new Lavadora(200, 600);
		AdapterLavadora adapterLavadora = new AdapterLavadora(lavadora);
		Refrigerador refrigerador = new Refrigerador(900, 900);
		AdapterRefrigerador adapterRefrigerador = new AdapterRefrigerador(refrigerador);
		
		
		Computadora computadora = new Computadora(150,650);
		Tablet tablet = new Tablet(350,900);
		Celular celular = new Celular(650,100);
		
		ArrayList<IArtefactosE1> list = new ArrayList<>();
		list.add(adapterTelevisor);
		list.add(adapterLavadora);
		list.add(adapterRefrigerador);
		list.add(computadora);
		list.add(tablet);
		list.add(celular);
		
		for(IArtefactosE1 artefacto:list){
			System.out.println("Precio : "+artefacto.getPrecio()+" Tiempo de Vida : "+artefacto.getTiempoDeVida() + " dias");
		}
		
	}
}
