package Common;

import Interfaces.Sugerencia;

public class SugerenciaBorrar implements Sugerencia{
	private Prenda prenda;

	public SugerenciaBorrar(Prenda prenda) {
		this.prenda = prenda;
	}	
	public void Aceptar(Guardarropas guardarropas) {
		guardarropas.removerPrenda(prenda);
	}
	public void Deshacer(Guardarropas guardarropas) {
		guardarropas.agregarPrenda(prenda);
	}
}
