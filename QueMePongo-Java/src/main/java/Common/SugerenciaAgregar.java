package Common;

import Interfaces.Sugerencia;

public class SugerenciaAgregar  implements Sugerencia{
	private Prenda prenda;
	
	public SugerenciaAgregar(Prenda prenda) {
		this.prenda = prenda;
	}
	public void Aceptar(Guardarropas guardarropas) {
		guardarropas.agregarPrenda(prenda);
	}
	public void Deshacer(Guardarropas guardarropas) {
		guardarropas.removerPrenda(prenda);
	}
}
