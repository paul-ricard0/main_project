package user;

public class Language {
	
	public static void main(String[] args) {
		Aluno student01 = new Aluno("Raphael", null, null, null, null, null, null, 0, null, null, (byte) 0, 0, false, null, null);
		student01.setNome("Raphael");
		System.out.println(student01.getNome());
		Professor teacher01 = new Professor("Professor Ruy", null, null, null, null, null, null, 0, null, null, (byte) 0, 0, false, 0, (byte) 0);
		teacher01.setNome("Senhor Ruy");
		System.out.println(teacher01.getNome());
	}
}