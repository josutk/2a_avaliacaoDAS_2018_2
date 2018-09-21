import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TestRentabilidadeLiquida {
		
	@Test
	public void testeRendimentoLiquido() {
		Calculadora c = new Calculadora();
		double impostoDeRenda = c.calculaImposto(120,500, 22.5);
		assertEquals(impostoDeRenda,3.14,0.001);
	}
}
