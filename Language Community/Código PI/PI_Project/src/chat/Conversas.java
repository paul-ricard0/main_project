package chat;

import java.util.Date;

public class Conversas {
    protected boolean notificacao;
    protected int qtdNotificacao;
    protected String texto;
    protected Date dataMensagem;
    protected Date horaMensagem;
    
    public Conversas (boolean notificacao, int qtdNotificacao, String texto, Date dataMensagem, Date horaMensagem) {
        setNotificacao(notificacao);
        setQtdNotificacao(qtdNotificacao);
        setTexto(texto);
        setDataMensagem(dataMensagem);
        setHoraMensagem(horaMensagem);
    }

    public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public boolean getNotificacao() {
        return notificacao;
    }

    public void setNotificacao(boolean notificacao) {
        this.notificacao = notificacao;
    }

    public int getQtdNotificacao() {
        return qtdNotificacao;
    }

    public void setQtdNotificacao(int qtdNotificacao) {
        this.qtdNotificacao = qtdNotificacao;
    }


    public void enviarAudio(byte audio) {
    	
    }

    public void enviarFoto(byte foto) {

    }

    public void ligar() {
    	
    }

    public byte visualizarFoto() {
        return visualizarFoto();
    }

    public Date getDataMensagem() {
        return dataMensagem;
    }

    public void setDataMensagem(Date dataMensagem) {
        this.dataMensagem = dataMensagem;
    }

    public Date getHoraMensagem() {
        return horaMensagem;
    }

    public void setHoraMensagem(Date horaMensagem) {
        this.horaMensagem = horaMensagem;
    }

    public void salvarConversa() {

    }
}