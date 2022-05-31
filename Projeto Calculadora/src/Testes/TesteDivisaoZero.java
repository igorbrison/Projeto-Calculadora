package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraComum;

public class TesteDivisaoZero {

	@Test
	public void test() {
		CalculadoraComum calculadora = new CalculadoraComum();
		double num = calculadora.divisao(4, 0);
		assertEquals(0, num);
	}

}
