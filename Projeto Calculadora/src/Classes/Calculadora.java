package Classes;

import java.util.ArrayList;

public abstract class Calculadora {
	public abstract double soma(double x, double y);
	public abstract double subtracao(double x, double y);
	public abstract double multiplicacao(double x, double y);
	public abstract double divisao(double x, double y);
	public abstract boolean validaNumero(String n);
}