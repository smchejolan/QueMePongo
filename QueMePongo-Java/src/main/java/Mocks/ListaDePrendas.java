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
		borrador1.seleccionarTemperaturaMaxima(28.0);
		prendas.add(borrador1.crearPrenda());
		
		Borrador borrador2 = new Borrador();
		borrador2.seleccionarTipo(Tipo.Campera);
		borrador2.seleccionarMaterial(Material.Cuero);
		borrador2.seleccionarColorPrimario(blanco);		
		borrador2.seleccionarTemperaturaMaxima(15.0);
		prendas.add(borrador2.crearPrenda());
		
		Borrador borrador3 = new Borrador();
		borrador3.seleccionarTipo(Tipo.Remera);
		borrador3.seleccionarMaterial(Material.Algodon);
		borrador3.seleccionarColorPrimario(blanco);	
		borrador3.seleccionarTemperaturaMaxima(35.0);
		prendas.add(borrador3.crearPrenda());
		
		Borrador borrador4 = new Borrador();
		borrador4.seleccionarTipo(Tipo.Zapatillas);
		borrador4.seleccionarMaterial(Material.Cuero);
		borrador4.seleccionarColorPrimario(blanco);	
		borrador4.seleccionarTemperaturaMaxima(40.0);
		prendas.add(borrador4.crearPrenda());
		
		Borrador borrador5 = new Borrador();
		borrador5.seleccionarTipo(Tipo.Bufanda);
		borrador5.seleccionarMaterial(Material.Lana);
		borrador5.seleccionarColorPrimario(blanco);		
		borrador5.seleccionarTemperaturaMaxima(10.0);
		prendas.add(borrador5.crearPrenda());
		
		Borrador borrador6 = new Borrador();
		borrador6.seleccionarTipo(Tipo.Pantalon);
		borrador6.seleccionarMaterial(Material.Cuero);
		borrador6.seleccionarColorPrimario(blanco);		
		borrador6.seleccionarTemperaturaMaxima(20.0);
		prendas.add(borrador6.crearPrenda());
		
		Borrador borrador7 = new Borrador();
		borrador7.seleccionarTipo(Tipo.Pantalon);
		borrador7.seleccionarMaterial(Material.TelaDeJean);
		borrador7.seleccionarColorPrimario(blanco);		
		borrador7.seleccionarTemperaturaMaxima(30.0);
		prendas.add(borrador7.crearPrenda());
		
		Borrador borrador8 = new Borrador();
		borrador8.seleccionarTipo(Tipo.Anteojos);
		borrador8.seleccionarMaterial(Material.VidrioSinteticoOscuro);
		borrador8.seleccionarColorPrimario(blanco);		
		borrador8.seleccionarTemperaturaMaxima(40.0);
		prendas.add(borrador8.crearPrenda());
		
		return prendas;
	}
	
}
