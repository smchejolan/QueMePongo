package Common;

import java.util.List;

import Interfaces.Sugerencia;

public class Guardarropas{
	private List<Prenda> prendas;
	public List<Sugerencia> sugerenciasPendientes;
	public List<Sugerencia> sugerenciasAceptadas;
	
	public List<Atuendo> getTodasLasCombinacionesposibles(){
		return null;
	}
	public List<Sugerencia> getSugerenciasPendientes(){
		return this.sugerenciasPendientes;
	}
	public List<Sugerencia> getSugerenciasAceptadas(){
		return this.sugerenciasAceptadas;
	}
	public void aceptarSugerencia(Sugerencia sugerencia) {
		sugerencia.Aceptar(this);
		sugerenciasPendientes.remove(sugerencia);
		sugerenciasAceptadas.add(sugerencia);
	}
	public void rechazarSugerencia(Sugerencia sugerencia) {
		sugerenciasPendientes.remove(sugerencia);
	}
	public void deshacerSugerenciaAceptada(Sugerencia sugerencia) {
		sugerencia.Deshacer(this);	
		sugerenciasAceptadas.remove(sugerencia);
	}
	public void agregarPrenda(Prenda prenda) {
		this.prendas.add(prenda);
	}
	public void removerPrenda(Prenda prenda) {
		if(this.prendas.contains(prenda))
			this.prendas.remove(prenda);
	}
	public void agregarSugerencia(Sugerencia sugerencia) {
		this.sugerenciasPendientes.add(sugerencia);
	}
	public List<Prenda> getPrendas() {
		return prendas;
	}
}
