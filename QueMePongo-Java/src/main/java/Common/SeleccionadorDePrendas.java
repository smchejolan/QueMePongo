package Common;

import java.util.List;
import java.util.stream.Collectors;
import Interfaces.ClienteClima;

public class SeleccionadorDePrendas {
	public List<Prenda> seleccionarPrendasAptasSegunClima(List<Prenda> prendas){
		ClienteClima clima = ClimaDeBuenosAires.intance();
		return prendas.stream().filter(p ->
				p.tipoDePrenda.temperaturaCorrecta(clima.getTemperaturaCelcius())).
				collect(Collectors.toList());
	}
}
