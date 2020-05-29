package Common;

import Interfaces.Fabrica;

public class Uniforme {
	public Prenda prendaSuperior;
	public Prenda prendaInferior;
	public Prenda calzado;

	public Uniforme(Fabrica fabrica) {		
		this.prendaSuperior = fabrica.fabricarParteSuperior();
		this.prendaInferior = fabrica.fabricarParteinferior();
		this.calzado = fabrica.fabricarCalzado(); 
	}
}
