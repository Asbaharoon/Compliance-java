import java.util.InputMismatchException; 

public class CodigoPessoaFisica {

	
	public String removeCaracteresEspeciais(String doc) {
		  if (doc.contains(".")) { 
			  doc = doc.replace(".", ""); 
		  } 
		  if (doc.contains("-")) { 
			  doc = doc.replace("-", ""); 
		  } 
		  if (doc.contains("/")) { 
			  doc = doc.replace("/", ""); 
		  } 
		  return doc; 
		  } 
	
	public boolean validaCPF(String CPF) { 
		 
		 CPF = removeCaracteresEspeciais(CPF); 
		  	
		 // considera erro CPF formado por uma sequ�ncia de nros iguais
		 if (CPF.equals("00000000000") || CPF.equals("11111111111") || 
			CPF.equals("22222222222") || CPF.equals("33333333333") || 
			CPF.equals("44444444444") || CPF.equals("55555555555") || 
			CPF.equals("66666666666") || CPF.equals("77777777777") || 
			CPF.equals("88888888888") || CPF.equals("99999999999") || (CPF.length() != 11)) 
			return (false); 
		 
		 //Variaveis
		 //sm - variavel soma (todos)
		 //i - indices do cpf
		 //num - numero do cpf
		 //peso - numeros que vao conferir o digito controlador
		 
		 char dig10, dig11; 
		 int sm, i, r, num, peso; 
		 // "try" - protege contra erros de conversao de tipo (int)
		 
		 try { 
			 // C�lculo do 1o. Digito Verificador
			 sm = 0; 
			 peso = 10; 
		 for (i = 0; i < 9; i++) { 
			 // converte o i-esimo caractere do CPF em n�mero:
			 // por exemplo, transforma o caractere '1' no nro 1 
			 // (48 eh a posicao de '0' na tabela ASCII) 
			 num = (int) (CPF.charAt(i) - 48); 
			 sm = sm + (num * peso); 
			 peso = peso - 1; 
		 } 
		 	r = 11 - (sm % 11); 
		 if ((r == 10) || (r == 11)) 
			 dig10 = '0'; 
		 else
			 dig10 = (char) (r + 48); // converte no respectivo caractere num�rico
		 
		 // C�lculo do 2o. Digito Verificador
		 sm = 0; 
		 peso = 11; 
		 for (i = 0; i < 10; i++) { 
			 num = (int) (CPF.charAt(i) - 48); 
			 sm = sm + (num * peso); 
			 peso = peso - 1; 
		 } 
		 r = 11 - (sm % 11); 
		 if ((r == 10) || (r == 11)) 
			 dig11 = '0'; 
		 else
			 dig11 = (char) (r + 48);
		 
		// Verifica se os d�gitos calculados conferem com os d�gitos informados.
		  if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) 
		  return (true); 
		  else
		  return (false); 
		  } catch (InputMismatchException erro) { 
		  return (false); 
		  } 
		  } 
		  
	 
		 
		 }


