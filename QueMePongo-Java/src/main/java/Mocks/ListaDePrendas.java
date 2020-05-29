package Mocks;

import java.util.ArrayList;
import java.util.List;
import Common.*;
import Enums.Material;
import Enums.Tipo;

public class ListaDePrendas {
	public List<Prenda> getPrendas(){
		Color blanco =new Color("ffffff");
		
		List<Prenda> prendas = new ArrayList<Prenda>();
		Borrador borrador1 = new Borrador();
		borrador1.seleccionarTipo(Tipo.Camisa);
		borrador1.seleccionarMaterial(Material.Algodon);
		borrador1.seleccionarColorPrimario(blanco);		
		prendas.add(borrador1.crearPrenda());
		
		Borrador borrador2 = new Borrador();
		borrador2.seleccionarTipo(Tipo.Campera);
		borrador2.seleccionarMaterial(Material.Cuero);
		borrador2.seleccionarColorPrimario(blanco);		
		prendas.add(borrador2.crearPrenda());
		
		Borrador borrador3 = new Borrador();
		borrador3.seleccionarTipo(Tipo.Remera);
		borrador3.seleccionarMaterial(Material.Algodon);
		borrador3.seleccionarColorPrimario(blanco);		
		prendas.add(borrador3.crearPrenda());
		
		Borrador borrador4 = new Borrador();
		borrador4.seleccionarTipo(Tipo.Zapatillas);
		borrador4.seleccionarMaterial(Material.Cuero);
		borrador4.seleccionarColorPrimario(blanco);		
		prendas.add(borrador4.crearPrenda());
		
		Borrador borrador5 = new Borrador();
		borrador5.seleccionarTipo(Tipo.Bufanda);
		borrador5.seleccionarMaterial(Material.Lana);
		borrador5.seleccionarColorPrimario(blanco);		
		prendas.add(borrador5.crearPrenda());
		
		return prendas;
	}
	
}
