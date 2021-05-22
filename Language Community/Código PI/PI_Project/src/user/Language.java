package user;

import chat.*;
import forum.*;

public class Language {
	
	public static void main(String[] args) {
		// Testes: User, Aluno e Professor
		Aluno student01 = new Aluno("Raphael", null, null, null, null, null, null, 0, null, null, (byte) 0, 0, null, null);
		student01.setNome("Raphael");
		student01.setAvaliarUsuario(1);
		student01.setAssinar(1);
		student01.setAvaliarUsuario(1);
		System.out.println(student01.getNome() + student01.getAssinar() + student01.getAvaliarUsuario());
		
		Professor teacher01 = new Professor("Professor Ruy", null, null, null, null, null, null, 0, null, null, (byte) 0, 0, 0, (byte) 0);
		teacher01.setNome("Senhor Ruy");
		System.out.println(teacher01.getNome());
		teacher01.setValGratificacao(3000.00);
		System.out.println("Ol� " + teacher01.getNome() + ", sua gratifica��o �: R$" + teacher01.getValGratificacao());
		
		// Testes: Conversa Individual e grupo
		ConversaIndividual A =  new ConversaIndividual(true, 1, "", null, null);
		A.setTexto("OI, tudo bem?");
		A.setQtdNotificacao(10);
		System.out.println(A.getTexto() + A.getQtdNotificacao());
		
		// Testes: F�rum e hist�rico f�rum
		Forum lolzinho = new Forum(true, "Yasuo foda", "Opa opa", null, null);
		lolzinho.setNomePostagem("Yasuo Helou");
		System.out.println(lolzinho.getNomePostagem());
	}
}