
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
		double result = calculaRendimento(i, j, d);
		double a  = result*alicota(i);
		System.out.println(a);
		return a/100;
	}
	
	private  double alicota(int d) {
		if (d <=180 ) {
 			return 0.225;
 		}else if(d <= 360) {
 			return 0.2;
 		}else if(d <= 720) {
 			return 0.175;
 		}else {
 			return 0.15;
 		}
	}
}
