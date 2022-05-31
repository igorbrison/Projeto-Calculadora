package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraCientifica;

public class TesteSeno {

	@Test
	public void test() {
		CalculadoraCientifica calculadora = new CalculadoraCientifica();
		double num = calculadora.sin(30);
		assertEquals(0.5, num);
	}

}
