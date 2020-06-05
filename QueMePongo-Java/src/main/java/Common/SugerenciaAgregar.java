package Common;

import Interfaces.Sugerencia;

public class SugerenciaAgregar  implements Sugerencia{
	private Prenda prenda;
	
	public void Aceptar(GuardarropasCompartido guardarropas) {
		guardarropas.agregarPrenda(prenda);
	}
	public void Deshacer(GuardarropasCompartido guardarropas) {
		guardarropas.removerPrenda(prenda);
	}
}
