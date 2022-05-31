package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraCientifica;

public class TesteCosseno {

	@Test
	public void test() {
		CalculadoraCientifica calculadora = new CalculadoraCientifica();
		double num = calculadora.cos(60);
		assertEquals(0.5, num);
	}

}
