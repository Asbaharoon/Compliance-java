import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemPadraoTeste {

	@Test
	public void testeMensagemPadrao() {
		MensagemPadrao msg = new MensagemPadrao();
		String testeRetorno = "Bem vindos, todos voc�s";
		assertEquals(testeRetorno, msg.geraMensagem());;
	}

}
