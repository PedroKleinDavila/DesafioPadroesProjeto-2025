
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada {

    private final List<IProduto> produtos;

    public VendasEmMemoria() {
        this.produtos = new ArrayList<>();
        this.produtos.add(new Produto(1, "Caneta", 1.55));
        this.produtos.add(new Produto(2, "Borracha", 1.15));
        this.produtos.add(new Produto(3, "Caderno", 32.99));
        Kit kit = new Kit(123456, "meuKit", this.produtos);
        this.produtos.add(kit);
    }

    @Override
    public Venda iniciarVenda() {
        return new Venda(LocalDateTime.now());
    }

    @Override
    public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
        IProduto prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().get();
        umaVenda.registrarVenda(prod, quantidade);
    }

    @Override
    public String emitirComprovante(Venda umaVenda) {
        return umaVenda.emitirComprovante();
    }

    @Override
    public List<IProduto> buscarProdutos() {
        return Collections.unmodifiableList(produtos);
    }

}
