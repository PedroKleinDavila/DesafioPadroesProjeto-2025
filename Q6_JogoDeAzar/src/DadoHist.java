
import java.util.ArrayList;
import java.util.List;

public class DadoHist extends DadoDecorator {

    private List<Integer> historico = new ArrayList<>();

    public DadoHist(IDado dado) {
        super(dado);
    }

    public void rolar() {
        super.rolar();
        historico.add(dado.getValor());
    }

    public List<Integer> getHistorico() {
        return historico;
    }
}
