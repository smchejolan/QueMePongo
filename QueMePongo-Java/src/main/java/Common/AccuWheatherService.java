package Common;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Interfaces.WeatherService;
import AccuWeather.AccuWeatherAPI;

public class AccuWheatherService implements WeatherService{
	private  Map<String, Object> climaActual;
	private String lugar;
	private LocalDateTime expiracion;
	
	public AccuWheatherService(String lugar,long horasExpiracion) {
		AccuWeatherAPI api = new AccuWeatherAPI();
		this.lugar = lugar;
		this.expiracion = proximaExpiracion(horasExpiracion);
		this.climaActual = api.getWeather(lugar).get(0);
	}

	private LocalDateTime proximaExpiracion(long horasExpiracion) {
	   return LocalDateTime.now().plusHours(horasExpiracion);
	}
	
	private void obtenerClimaActual() {
		if(LocalDateTime.now().isAfter(this.expiracion)) {
			AccuWeatherAPI api = new AccuWeatherAPI();
			this.climaActual = api.getWeather(this.lugar).get(0);
		}
	}
	
	public double getTemperaturaCelcius() {
		obtenerClimaActual();
		HashMap<String, Object> temperatura = (HashMap<String, Object>) climaActual.get("Temperature");
		Double valor =  (double) temperatura.get("Value");
		return (valor - 32)/1.8;
	}
}
