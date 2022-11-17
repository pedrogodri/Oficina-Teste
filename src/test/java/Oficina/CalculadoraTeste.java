package Oficina;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Before;
import org.junit.Test;

public class CalculadoraTeste {

	private Calculadora calculadora;

	@Before
	public void setup() {
		this.calculadora = new Calculadora();
	}

	@Test
	public void somarDoisNumeros() {
		int resultado = calculadora.somar(2, 4);

		assertEquals(6, resultado);
	}

	@Test
	public void multiplicarDoisNumeros() {

		int resultado = calculadora.multiplicar(2, 4);

		assertEquals(8, resultado);
	}

	@Test
	public void dividirDoisNumeros() {

		int resultado = calculadora.dividir(4, 2);

		assertEquals(2, resultado);
	}

	@Test
	public void lancarExcecaoQuandoDividiPorZero() {
		assertThrows(ArithmeticException.class, () -> 
			calculadora.dividir(6, 0)
		);
	}

}
