package Common;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Interfaces.ClienteClima;
import AccuWeather.AccuWeatherAPI;

public class ClimaDeBuenosAires implements ClienteClima{
	private static final ClimaDeBuenosAires INSTANCE = new ClimaDeBuenosAires();
	private  List<Map<String, Object>> climaActual;
	
	private ClimaDeBuenosAires() {
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		this.climaActual = apiClima.getWeather("Buenos Aires, Argentina");
	}
	
	public static ClimaDeBuenosAires intance() {
		return INSTANCE;
	}
	
	public double getTemperaturaCelcius() {
		HashMap<String, Object> temperatura = (HashMap<String, Object>) this.climaActual.get(0).get("Temperature");
		Integer valor = (Integer) temperatura.get("Value");
		
		return (valor.doubleValue() - 32) / 1.8;
	}
}
