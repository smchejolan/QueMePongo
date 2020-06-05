package Mocks;

import java.util.*;

import Common.Atuendo;
import Common.Prenda;
import Interfaces.Guardarropas;

public class GuardarropasMock implements Guardarropas{
	List<Prenda> prendasDisponibles;
	
	public GuardarropasMock() {
		ListaDePrendas prendas = new ListaDePrendas();
		this.prendasDisponibles = prendas.getPrendas();
	}
	
	public List<Atuendo> getTodasLasCombinacionesposibles() {
		List<Atuendo> combinaciones = new ArrayList<Atuendo>();
		
		Atuendo atuendo1 = new Atuendo(prendasDisponibles.get(0),prendasDisponibles.get(6),prendasDisponibles.get(3),prendasDisponibles.get(7));
		combinaciones.add(atuendo1);
		Atuendo atuendo2 = new Atuendo(prendasDisponibles.get(1),prendasDisponibles.get(5),prendasDisponibles.get(3),prendasDisponibles.get(4));
		combinaciones.add(atuendo2);
		Atuendo atuendo3 = new Atuendo(prendasDisponibles.get(2),prendasDisponibles.get(6),prendasDisponibles.get(3),prendasDisponibles.get(7));
		combinaciones.add(atuendo3);		
		
		return combinaciones;
	}
}
