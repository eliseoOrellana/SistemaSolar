package cl.infoclub.sistemasolar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;

public class SistemaSolarTest {

	SistemaSolar sistemasolar;

	Planeta jupiter;
	Luna lunaJupiter1;
	Luna lunaJupiter2;

	@Before
	public void init() {

		jupiter = new Planeta("jupiter", 142984, 778330000);
		lunaJupiter1 = new Luna("Adrastea", 416, 298);
		lunaJupiter2 = new Luna("Aitne", 3, 736);
		jupiter.setLunas(lunaJupiter1);
		jupiter.setLunas(lunaJupiter2);
	}


	@Test
	public void CantidadLunasplaneta() {
		
		assertEquals(2, jupiter.getLunas().size());
		
	}

	@Test
	public void MostrarPlanetasTest() {

		assertTrue(lunaJupiter1.getNombre() == "Adrastea");

	}

	@Test
	public void CantidadDeLunas() {

		
		assertTrue(jupiter.getLunas().size() == 2);
	}

	@Test
	public void NombrePlaneta() {

		assertEquals("jupiter", jupiter.getNombre());

	}
}


