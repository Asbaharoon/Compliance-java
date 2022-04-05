import static org.junit.Assert.*;

import org.junit.Test;

public class ValidaCpfTeste {
	@Test
	public void removeCaracteres11144477700() {
		String cpf = "111.444.777-00";
		String resultadoEsperado = "11144477700";
		CodigoPessoaFisica cod = new CodigoPessoaFisica();
		String resultadoReal = cod.removeCaracteresEspeciais(cpf);
		assertEquals(resultadoEsperado, resultadoReal);
	}
	
	@Test
	public void validaCpf11144477700() {
		String cpf = "111.444.777-00";
		Boolean resultadoEsperado = false;
		CodigoPessoaFisica cod = new CodigoPessoaFisica();
		Boolean resultadoReal = cod.validaCPF(cpf);
		assertEquals(resultadoEsperado, resultadoReal);
		
	}
}
