package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraComum;

public class TesteMultiplicacao {

	@Test
	public void test() {
		CalculadoraComum calculadora = new CalculadoraComum();
		double num = calculadora.multiplicacao(4, 2);
		assertEquals(8, num);
	}

}
