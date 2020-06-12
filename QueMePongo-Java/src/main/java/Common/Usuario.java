package Common;

import java.util.*;

import Interfaces.Sugerencia;

public class Usuario {
	public List<Guardarropas> guardarropas;
	
	public Usuario() {
		guardarropas = new ArrayList<Guardarropas>();
	}
	public List<Prenda> getPrendasDe(Guardarropas guardarropas) {
		return guardarropas.getPrendas();
	}
	public List<Guardarropas> getTodosLosGuardarropas(){
		return this.guardarropas;
	}
	public void agregarPrendaAlGuadarropas(Prenda prenda,Guardarropas guardarropas) {
		guardarropas.agregarPrenda(prenda);
	}
	public void	agregarSugerrenciaDeAgregarPrendaA(Guardarropas guardarropas, Prenda prenda) {
		Sugerencia sugerencia = new SugerenciaAgregar(prenda);
		guardarropas.agregarSugerencia(sugerencia);
	}
	//REVISAR SI CORRESPONDE AL ALCANZE DEL USUARIO
	public void AceptarSugerenciaEn(Guardarropas guardarropas, Sugerencia sugerencia) {
		guardarropas.aceptarSugerencia(sugerencia);
	}
	public void RechazarSugerenciaEn(Guardarropas guardarropas,Sugerencia sugerencia) {
		guardarropas.rechazarSugerencia(sugerencia);
	}
	public void DeshacerSugerencia(Guardarropas guardarropas, Sugerencia sugerencia) {
		guardarropas.deshacerSugerenciaAceptada(sugerencia);
	}
}
