package Classes;

public abstract class CalculadoraComum extends Calculadora {
	@Override
	public float soma(float x, float y) {
		return x + y;
	}
	@Override
	public float subtracao(float x, float y) {
		return x - y;
	}
	@Override
	public float multiplicacao(float x, float y) {
		return x * y;
	}
	@Override
	public float divisao(float x, float y) {
		try {
			
			return x / y;
		} catch (ArithmeticException e) {
			return 0;
		}
		
	}
}