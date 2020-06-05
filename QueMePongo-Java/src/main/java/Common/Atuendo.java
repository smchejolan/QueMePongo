package Common;

import Enums.Categoria;
import Exceptions.ExcepcionCreacionDeAtuendo;

public class Atuendo {
	public Prenda partesSuperior;
	public Prenda parteInferior;
	public Prenda calzado;
	public Prenda accesorio;
	
	public Atuendo(Prenda partesSuperior, Prenda parteInferior, Prenda calzado, Prenda accesorio) {
		if(partesSuperior == null)
			throw new ExcepcionCreacionDeAtuendo("Falta parte superior");
		if(parteInferior == null)
			throw new ExcepcionCreacionDeAtuendo("Falta parte inferior");		
		if(calzado == null)
			throw new ExcepcionCreacionDeAtuendo("Falta calzado");	
		if(accesorio == null)
			throw new ExcepcionCreacionDeAtuendo("Falta accesorio");
		if(partesSuperior.categoria() != Categoria.ParteSuperior)
			throw new ExcepcionCreacionDeAtuendo("No corresponde la categoria");
		if(parteInferior.categoria() != Categoria.ParteInferior)
			throw new ExcepcionCreacionDeAtuendo("No corresponde la categoria");
		if(calzado.categoria() != Categoria.Calzado)
			throw new ExcepcionCreacionDeAtuendo("No corresponde la categoria");
		if(accesorio.categoria() != Categoria.Accesorios)
			throw new ExcepcionCreacionDeAtuendo("No corresponde la categoria");
		
		this.partesSuperior=partesSuperior;
		this.parteInferior=parteInferior;
		this.calzado=calzado;
		this.accesorio=accesorio;
	}
	
	public boolean esValidoParaTemperatura(Double temperatura) {
		return 	this.partesSuperior.temperaturaCorrecta(temperatura) &&
				this.parteInferior.temperaturaCorrecta(temperatura) &&
				this.calzado.temperaturaCorrecta(temperatura) &&
				this.accesorio.temperaturaCorrecta(temperatura);
		}
}
