package Fabricas;

import Common.*;
import Enums.*;
import Interfaces.Fabrica;

public class FabricaSanJuan implements Fabrica{

	@Override
	public Prenda fabricarParteSuperior() {
		Borrador borrador = new Borrador();
		borrador.seleccionarTipo(Tipo.Chomba);
		borrador.seleccionarMaterial(Material.Pique);
		borrador.seleccionarColorPrimario(new Color("00ff00"));	
		borrador.seleccionarTemperaturaMaxima(35.0);
		return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarParteinferior() {
		Borrador borrador = new Borrador();
		borrador.seleccionarTipo(Tipo.Pantalon);
		borrador.seleccionarMaterial(Material.Acetato);
		borrador.seleccionarColorPrimario(new Color("9b9b9b"));
		borrador.seleccionarTemperaturaMaxima(35.0);
		return borrador.crearPrenda();
	}

	@Override
	public Prenda fabricarCalzado() {
		Borrador borrador = new Borrador();
		borrador.seleccionarTipo(Tipo.Zapatillas);
		borrador.seleccionarMaterial(Material.Cuero);
		borrador.seleccionarColorPrimario(new Color("ffffff"));
		borrador.seleccionarTemperaturaMaxima(35.0);
		return borrador.crearPrenda();
	}
}
