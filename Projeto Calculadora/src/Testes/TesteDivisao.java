package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraComum;

public class TesteDivisao {

	@Test
	public void test() {
		CalculadoraComum calculadora = new CalculadoraComum();
		double num = calculadora.divisao(4, 2);
		assertEquals(2, num);
	}

}
