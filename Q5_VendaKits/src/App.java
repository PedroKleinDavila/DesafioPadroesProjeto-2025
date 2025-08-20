
import java.util.List;

public class App {

    public static void main(String[] args) {
        VendasFachada proc = new VendasEmMemoria();
        List<Produto> produtos = proc.buscarProdutos();
        Kit kit = new Kit(123456, "meuKit", produtos);
        Venda venda = proc.iniciarVenda();
        proc.registrarVenda(venda, kit.getId(), 1);
        System.out.println(proc.emitirComprovante(venda));
    }
}
