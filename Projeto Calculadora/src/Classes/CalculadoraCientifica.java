package Classes;

public class CalculadoraCientifica extends CalculadoraComum {

	public double expoente(float x, float y) {
		return Math.pow(x, y);
	}

	public double raiz(float x) {
		return Math.sqrt(x);
	}

	public double sin(float x) {
		return Math.sin(x);
	}

	public double cos(float x) {
		return Math.cos(x);
	}

	public double tan(float x) {
		return Math.tan(x);
	}

	public double log(float x) {
		return Math.log(x);
	}
}
