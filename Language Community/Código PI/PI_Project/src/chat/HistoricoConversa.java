package chat;
import java.util.Date;

public class HistoricoConversa {
    protected Date dataMensagem;
    protected Date horaMensagem;

    public HistoricoConversa(Date dataMensagem, Date horaMensagem) {
        setDataMensagem(dataMensagem);
        setHoraMensagem(horaMensagem);
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