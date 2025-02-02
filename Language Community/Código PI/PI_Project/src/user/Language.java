package user;

import chat.*;
import forum.*;

public class Language {
	
	public static void main(String[] args) {
		// Testes: User, Aluno e Professor
		System.out.println("Testes Usu�rio, Aluno e Professor");
		Aluno student01 = new Aluno("Raphael", null, null, null, null, null, null, 0, null, null, (byte) 0, 0, null, null);
		student01.setNome("Raphael");
		student01.setIdiomaInteresse("Ingl�s");
		student01.setNivelIdioma("B�sico");
		
		// Tentando avaliar o usu�rio sem ainda ser Premium
		student01.setAvaliarUsuario(1); // ir� retornar que ele n�o � premium
		
		// Assinar plano Premium e tentar novamente avaliar, vai retornar no final certo.
		student01.setAssinar(1);
		student01.setAvaliarUsuario(5);
		System.out.print("Ol� " + student01.getNome() + " seu idioma de interesse � " + student01.getIdiomaInteresse());
		System.out.println(" e seu n�vel atual � " + student01.getNivelIdioma() + ".");
		System.out.println("Seu plano atual �: " + student01.getAssinar() + ". Retorno de avaliar usu�rio: " + student01.getAvaliarUsuario() + ".");
		System.out.println("");
	
		Professor teacher01 = new Professor("Professor Ruy", null, null, null, null, null, null, 0, null, null, (byte) 0, 0, 0, (byte) 0);
		teacher01.setNome("Senhor Ruy");
		System.out.println(teacher01.getNome());
		teacher01.setValGratificacao(17000.00);
		System.out.println("Ol� " + teacher01.getNome() + ", sua gratifica��o �: R$" + teacher01.getValGratificacao());
		System.out.println("");
		
		// Testes: Conversa Individual e grupo
		ConversaIndividual A =  new ConversaIndividual(true, 1, "", null, null);
		A.setTexto("OI, tudo bem?");
		A.setQtdNotificacao(10);
		System.out.println("Mensagem: " + A.getTexto() + ". Quantidade de notifica��es: " + A.getQtdNotificacao());
		
		ConversaGrupo B = new ConversaGrupo(true, 1, "", "LOL", "Falar sobre lolzinho", "Portugu�s", (byte) 0, null, null);
		B.setTexto("Ol� grupo, bora jogar hoje?");
		System.out.println("Tem notifica��es? " + B.getNotificacao() + ", quantidade: " + B.getQtdNotificacao());
		System.out.println("Nome do grupo: " + B.getNomeGrupo() + ", descri��o: " + B.getDescricaoGrupo() + " e idioma do grupo: " + B.getIdiomaGrupo());
		System.out.println("");
		
		// Testes: F�rum
		Forum lolzinho = new Forum(true, "Yasuo foda", "Yasuo seria uma lenda milenar?", null, null);
		lolzinho.setNomePostagem("Yasuo Helou");
		System.out.println("T�tulo postagem " + lolzinho.getNomePostagem() + ". Descri��o: " + lolzinho.getDescricaoPostagem());
		
		
		// Os m�todos da classe Discover funcionam somente com interface.
	}
}