package ejemplopipeline;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DiezxcientoTest {
	int ahorro = 230000000;
	int sueldo = 2800000;
	Diezxciento diezxciento = new Diezxciento(ahorro, sueldo);

	@Test
	public void testDiezxciento() throws Exception {
		assertEquals(23000000, diezxciento.diezxciento());
	}

	@Test
	public void testImpuesto() throws Exception {
		assertEquals(0.135f, diezxciento.impuesto(diezxciento.sueldo), 0.001);
	}

	@Test
	public void testSaldoAhorro() throws Exception {
		assertEquals((int) (ahorro - (ahorro * 0.1)), diezxciento.saldoAhorro());
	}
}
