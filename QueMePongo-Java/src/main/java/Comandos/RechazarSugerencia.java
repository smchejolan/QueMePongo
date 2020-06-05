package Comandos;

import Common.GuardarropasCompartido;
import Interfaces.Command;
import Interfaces.Sugerencia;

public class RechazarSugerencia implements Command{
	public Sugerencia sugerencia;
	public GuardarropasCompartido guardarropas;
	
	public RechazarSugerencia(Sugerencia sugerencia,GuardarropasCompartido guardarropas) {
		this.sugerencia = sugerencia;
		this.guardarropas = guardarropas;
	}

	@Override
	public void execute() {
		guardarropas.rechazarSugerencia(sugerencia);
	}	
	
}
