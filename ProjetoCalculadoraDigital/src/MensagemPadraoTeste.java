import static org.junit.Assert.*;

import org.junit.Test;

public class MensagemPadraoTeste {

	@Test
	public void testeMensagemPadrao() {
		MensagemPadrao msg = new MensagemPadrao();
		String testeRetorno = "Bem vindos, todos vocês";
		assertEquals(testeRetorno, msg.geraMensagem());;
	}

}
