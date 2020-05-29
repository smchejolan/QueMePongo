import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

import Common.*;
import Mocks.*;

public class TestValidacionDePrendas {
	@Test
	public void testSobreListaDePrueba() {
		ListaDePrendas listaDePrendas = new ListaDePrendas();
		SeleccionadorDePrendas seleccionador = new SeleccionadorDePrendas();
		
		assertEquals(5,listaDePrendas.getPrendas().size());
		
		assertEquals(4, seleccionador.seleccionarPrendasAptasSegunClima(listaDePrendas.getPrendas()).size());	
	}
}
