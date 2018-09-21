import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteREndimentoBruto {

	@Test
	public void testeRendimentoBruto() {
		Calculadora calc = new Calculadora();
		double result = calc.calculaRendimento(1000,60,8.5);
		assertEquals(result,13.97);
	}
}
