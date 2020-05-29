import org.junit.Test;

import static org.junit.Assert.*;

import Common.*;
import Interfaces.*;

public class TestAccuWeather {
	@Test
	public void testTemperatura() {
		ClienteClima clima = ClimaDeBuenosAires.intance();
		
		assertEquals(13.89, clima.getTemperaturaCelcius(), 0.5);
	}
}
