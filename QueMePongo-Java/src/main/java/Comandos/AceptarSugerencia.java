package Comandos;

import Common.GuardarropasCompartido;
import Enums.EstadoSugerencia;
import Interfaces.Command;
import Interfaces.Sugerencia;

public class AceptarSugerencia implements Command{
	public EstadoSugerencia estado;
	public Sugerencia sugerencia;
	public GuardarropasCompartido guardarropas;
	
	public AceptarSugerencia(Sugerencia sugerencia,GuardarropasCompartido guardarropas) {
		this.sugerencia = sugerencia;
		this.guardarropas = guardarropas;
	}
	
	@Override
	public void execute() {
		if(estado == EstadoSugerencia.Pendiente) {
			guardarropas.aceptarSugerencia(sugerencia);
			estado = EstadoSugerencia.Aceptado;
		}
	}	
	public void undo() {
		if(estado == EstadoSugerencia.Aceptado) {
			guardarropas.deshacerSugerenciaAceptada(sugerencia);
			estado = EstadoSugerencia.Deshecho;
		}
	}
}
