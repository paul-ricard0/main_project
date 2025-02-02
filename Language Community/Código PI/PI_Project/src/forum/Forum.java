package forum;

import java.util.Date;

public class Forum {
	private boolean tipoPostagem;
	private String nomePostagem;
	private String descricaoPostagem;
	private Date dataPostagem;
	private Date horaPostagem;


		public Forum(boolean tipoPostagem, String nomePostagem, String descricaoPostagem, Date dataPostagem, Date horaPostagem) {
			setTipoPostagem(tipoPostagem);
			setNomePostagem(nomePostagem);
			setDescricaoPostagem(descricaoPostagem);
			setDataPostagem(dataPostagem);
			setHoraPostagem(horaPostagem);
		}

		//get e set
		
			public boolean getTipoPostagem() {
				return tipoPostagem;
			}
	
	
			public void setTipoPostagem(boolean tipoPostagem) {
				this.tipoPostagem = tipoPostagem;
			}
	
	
			public String getNomePostagem() {
				return nomePostagem;
			}
	
	
			public void setNomePostagem(String nomePostagem) {
				this.nomePostagem = nomePostagem;
			}
	
	
			public String getDescricaoPostagem() {
				return descricaoPostagem;
			}
	
	
			public void setDescricaoPostagem(String descricaoPostagem) {
				this.descricaoPostagem = descricaoPostagem;
			}
		
			// metodos
		
			public void curtir() {
					
			}
				
			public void comentar() {
					
			}
				
			public void compartilhar() {
					
			}

			public String procurarTopico() { 
				return nomePostagem;
			}
				
			public void procurarPorVoz() { //talvez n seja
			}
				
			public void visualizarTopico() {
					
			}
				
			public String criarTopico(String nomePostagem, String descricaoPostagem) { 
				// Provavelmente ir� retornar um vetor de objeto
				
				setNomePostagem(nomePostagem);
				setDescricaoPostagem(descricaoPostagem);
				return getNomePostagem();
			}
				
			public void reportar() {
					
			}
			
			public Date getDataPostagem() {
				return dataPostagem;
			}

			public void setDataPostagem(Date dataPostagem) {
				this.dataPostagem = dataPostagem;
			}

			public Date getHoraPostagem() {
				return horaPostagem;
			}

			public void setHoraPostagem(Date horaPostagem) {
				this.horaPostagem = horaPostagem;
			}
			
			public void salvarpostagem() {
				
			}	
}