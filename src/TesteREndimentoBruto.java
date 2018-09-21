
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TesteREndimentoBruto {

	private int dias;
	private int capital;
	private double taxa;
	private double result;
	public TesteREndimentoBruto(int dias, int capital, double taxa,double result) {
		super();
		this.dias = dias;
		this.capital = capital;
		this.taxa = taxa;
		this.result = result;
	}

	
	
	@Parameters
	public static Collection<Object[]> data(){
		return Arrays.asList(new Object [][] {
			{60,1000,8.5,13.97},
			{120,500,8.0,13.15},
			{270,2000,8.5,125.75}
		});
	}
	
	@Test
	public void testeRendimentoBruto3() {
		Calculadora calc = new Calculadora();
		double result = calc.calculaRendimento(this.dias, this.capital, this.taxa);
		assertEquals(this.result, result,0.01);
	
	}
}
