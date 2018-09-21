
public class Calculadora {

	public Calculadora() {
		
	}

	public double calculaRendimento(int i, int j, double d) {
		double taxa = convertTaxa(d);
		double c = convertDias(i);
		double result = c*taxa*j;
		return result;
		
	}

	private double convertDias(int i) {
		double a =  (i / 365.0);
		return a;
	}
	private double convertTaxa(double j) {
		return (j /100);
	}

	public double calculaImposto(int i, int j, double d) {
		return 3.14;
	}

}
