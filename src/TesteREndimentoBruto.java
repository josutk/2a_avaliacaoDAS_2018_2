
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteREndimentoBruto {

	@Test
	public void testeRendimentoBruto1() {
		Calculadora calc = new Calculadora();

		double result = calc.calculaRendimento(60,1000,8.5);
		assertEquals(result,13.97,0.01);
	}
	@Test
	public void testeRendimentoBruto2() {
		Calculadora calc = new Calculadora();
		
		double result = calc.calculaRendimento(120,500,8.0);
		assertEquals(result,13.15,0.01);
	}
	
}
