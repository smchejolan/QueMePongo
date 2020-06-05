package Common;

import Interfaces.Sugerencia;

public class SugerenciaBorrar implements Sugerencia{
	private Prenda prenda;

	public void Aceptar(GuardarropasCompartido guardarropas) {
		guardarropas.removerPrenda(prenda);
	}
	public void Deshacer(GuardarropasCompartido guardarropas) {
		guardarropas.agregarPrenda(prenda);
	}
}
