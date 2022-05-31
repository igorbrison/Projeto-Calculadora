package Testes;

import static org.junit.Assert.*;

import org.junit.Test;

import Classes.CalculadoraCientifica;
import Classes.CalculadoraComum;

public class TesteExpoente {

	@Test
	public void test() {
		CalculadoraCientifica calculadora = new CalculadoraCientifica();
		double num = calculadora.expoente(4, 2);
		assertEquals(16, num);
	}

}