package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraCientifica;

public class TesteLogaritmoZero {

	@Test
	public void test() {
		CalculadoraCientifica calculadora = new CalculadoraCientifica();
		double num = calculadora.log(0);
		assertEquals(0, num);
	}

}
