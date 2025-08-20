
import java.util.ArrayList;
import java.util.List;

public class Kit implements IProduto {

    private int id;
    private String nome;
    private List<Produto> _produtos = new ArrayList<>();

    public Kit(int id, String nome, List<Produto> produtos) {
        this.id = id;
        this.nome = nome;
        _produtos = produtos;
    }

    public void addProduto(Produto produto) {
        _produtos.add(produto);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        double total = 0;
        for (IProduto p : _produtos) {
            total += p.getPreco();
        }
        return total;
    }
}
