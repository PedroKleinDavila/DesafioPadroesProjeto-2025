
import java.util.ArrayList;
import java.util.List;

public class Kit implements IProduto {

    private int id;
    private String nome;
    private List<IProduto> _produtos = new ArrayList<>();

    public Kit(int id, String nome, List<IProduto> produtos) {
        this.id = id;
        this.nome = nome;
        this._produtos = new ArrayList<>(produtos);
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
        for (IProduto p : this._produtos) {
            total += p.getPreco();
        }
        return total;
    }
}
