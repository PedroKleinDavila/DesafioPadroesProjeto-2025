
import java.util.List;

public class App {

    public static void main(String[] args) {
        VendasFachada proc = new VendasEmMemoria();
        List<IProduto> produtos = proc.buscarProdutos();
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, produtos.get(3).getId(), 2);
        System.out.println(proc.emitirComprovante(venda));
    }
}
