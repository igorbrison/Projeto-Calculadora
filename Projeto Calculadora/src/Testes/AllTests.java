package Testes;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ TesteCosseno.class, TesteDivisao.class, TesteDivisaoZero.class, TesteExpoente.class,
		TesteLogaritmo.class, TesteLogaritmoZero.class, TesteMultiplicacao.class, TesteRaiz.class, TesteRaizZero.class,
		TesteSeno.class, TesteSoma.class, TesteTangente.class, TestSubtracao.class })
public class AllTests {

}
