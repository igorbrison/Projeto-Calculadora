package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraCientifica;

public class TesteRaiz {

	@Test
	public void test() {
		CalculadoraCientifica calculadora = new CalculadoraCientifica();
		double num = calculadora.raiz(4);
		assertEquals(2, num);
	}

}
