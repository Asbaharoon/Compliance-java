import static org.junit.Assert.*;

import org.junit.Test;

public class CalculadoraTeste {

	//TESTES DE SOMA
	@Test
	public void testeSomar3com8() {
		int variavel1 = 3;
		int variavel2 = 8;
		int resultadoEsperado = 11;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	@Test
	public void testeSomar5com5() {
		int variavel1 = 5;
		int variavel2 = 5;
		int resultadoEsperado = 10;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.somar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}

	//TESTES DE MULTIPLICAÇÃO
	@Test
	public void testeMultiplicar2com5() {
		int variavel1 = 2;
		int variavel2 = 5;
		int resultadoEsperado = 10;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.multiplicar(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	//TESTES DE SUBTRAÇÃO
	@Test
	public void testeSubtrair2de5() {
		int variavel1 = 5;
		int variavel2 = 2;
		int resultadoEsperado = 3;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.subtrair(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
	
	//TESTES DE DIVISÃO
	@Test
	public void testeDividir6de2() {
		int variavel1 = 6;
		int variavel2 = 2;
		int resultadoEsperado = 3;
		Calculadora calc = new Calculadora();
		int resultadoReal = calc.dividir(variavel1, variavel2);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
}
