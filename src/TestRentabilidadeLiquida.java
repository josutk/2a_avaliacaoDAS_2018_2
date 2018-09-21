import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRentabilidadeLiquida {
		
	@Test
	public void testeImpostoDeRenda1() {
		Calculadora c = new Calculadora();
		double impostoDeRenda = c.calculaImposto(120,500, 8.0);
		assertEquals(impostoDeRenda,3.14,0.1);
	}
	@Test
	public void testeImpostoDeRenda2() {
		Calculadora c = new Calculadora();
		double impostoDeRenda = c.calculaImposto(240,3000, 9.0);
		assertEquals(impostoDeRenda,2.96,0.1);
	}
}
