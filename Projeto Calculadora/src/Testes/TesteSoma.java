package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraComum;

public class TesteSoma {

	@Test
	public void test() {
		CalculadoraComum calculadora = new CalculadoraComum();
		double num = calculadora.soma(4, 2);
		assertEquals(6, num);
	}

}
