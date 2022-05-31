package Classes;

public class CalculadoraCientifica extends CalculadoraComum {

	public CalculadoraCientifica() {
		super();
	}
	
	public double expoente(double x, double y) {
		return Math.pow(x, y);
	}

	public double raiz(double x) {
		if(x < 0) return 0;
		return Math.sqrt(x);
	}

	public double sin(double x) {
		return Math.sin(x);
	}

	public double cos(double x) {
		return Math.cos(x);
	}

	public double tan(double x) {
		return Math.tan(x);
	}

	public double log(double x) {
		if(x == 0) return 0;
		return Math.log(x);
	}
}
