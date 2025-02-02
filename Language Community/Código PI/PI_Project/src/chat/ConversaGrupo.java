package chat;

import java.util.Date;

public class ConversaGrupo extends Conversas{
    protected String nomeGrupo;
    protected String descricaoGrupo;
    protected String idiomaGrupo;
    protected byte fotoGrupo;

    public ConversaGrupo(boolean notificacao, int qtdNotificacao, String texto, String nomeGrupo, String descricaoGrupo, String idiomaGrupo, byte fotoGrupo,
    		Date dataMensagem, Date horaMensagem) {
        
    	super(notificacao, qtdNotificacao, texto, dataMensagem, horaMensagem);
        
    	setDescricaoGrupo(descricaoGrupo);
        setIdiomaGrupo(idiomaGrupo);
        setNomeGrupo(nomeGrupo);
        setFotoGrupo(fotoGrupo);
    }

    public String getNomeGrupo() {
        return nomeGrupo;
    }

    public void setNomeGrupo(String nomeGrupo) {
        this.nomeGrupo = nomeGrupo;
    }

    public String getDescricaoGrupo() {
        return descricaoGrupo;
    }

    public void setDescricaoGrupo(String descricaoGrupo) {
        this.descricaoGrupo = descricaoGrupo;
    }

    public String getIdiomaGrupo() {
        return idiomaGrupo;
    }

    public void setIdiomaGrupo(String idiomaGrupo) {
        this.idiomaGrupo = idiomaGrupo;
    }

    public byte getFotoGrupo() {
        return fotoGrupo;
    }

    public void setFotoGrupo(byte fotoGrupo) {
        this.fotoGrupo = fotoGrupo;
    }

    public void criarGrupo() {

    }
}