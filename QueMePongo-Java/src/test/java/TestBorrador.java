import org.junit.Test;

import static org.junit.Assert.*;

import Common.*;
import Enums.*;

public class TestBorrador {
		@Test
		public void testCreacionPasoPorPaso() {
			Color blanco = new Color("ffffff");
			Borrador borrador = new Borrador();
			
			borrador.seleccionarTipo(Tipo.Camisa);
			borrador.seleccionarMaterial(Material.Algodon);
			borrador.seleccionarColorPrimario(blanco);
			
			Prenda prenda = borrador.crearPrenda();
			
			assertEquals(blanco, prenda.colorPrimario);
			assertEquals(Trama.Lisa, prenda.trama);
	}

}
