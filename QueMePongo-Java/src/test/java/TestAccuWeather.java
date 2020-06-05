import org.junit.Test;

import static org.junit.Assert.*;

import Common.*;
import Interfaces.*;

public class TestAccuWeather {
	@Test
	public void testTemperatura() {
		AccuWheatherService clima = new AccuWheatherService("Buenos Aires, Argentina",1);
		
		assertEquals(13.89, clima.getTemperaturaCelcius(), 0.5);
	}
}
