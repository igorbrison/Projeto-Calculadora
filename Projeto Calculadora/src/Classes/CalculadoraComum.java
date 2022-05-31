package Classes;

public class CalculadoraComum extends Calculadora {
	
	public CalculadoraComum() {
		super();
	}
	@Override
	public double soma(double x, double y) {
		// TODO Auto-generated method stub
		return x + y;
	}
	@Override
	public double subtracao(double x, double y) {
		// TODO Auto-generated method stub
		return x - y;
	}
	@Override
	public double multiplicacao(double x, double y) {
		// TODO Auto-generated method stub
		return x * y;
	}
	@Override
	public double divisao(double x, double y) {
		// TODO Auto-generated method stub
		try {
			
			return x / y;
		} catch (ArithmeticException e) {
			// TODO: handle exception
			return 0;
		}
		
	}
	@Override
	public boolean validaNumero(String n) {
		
		try {
			int i = Integer.parseInt(n);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		} 
	}
}
