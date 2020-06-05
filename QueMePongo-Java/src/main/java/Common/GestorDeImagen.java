package Common;

import java.util.List;
import java.util.stream.Collectors;

import Interfaces.Guardarropas;
import Interfaces.WeatherService;

public class GestorDeImagen {
	public Atuendo getSugerencia(String ciudad, Guardarropas guardarropas){
		AccuWheatherService clima = new AccuWheatherService("Buenos Aires, Argentina",1);
		
		Double temperatura = clima.getTemperaturaCelcius();
		
		List<Atuendo> combinaciones = guardarropas.getTodasLasCombinacionesposibles();
				
		return 	combinaciones.stream().filter(p ->
				p.esValidoParaTemperatura(temperatura)).findFirst().get();
	}
}
