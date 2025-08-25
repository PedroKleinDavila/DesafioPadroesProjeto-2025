
public class App {

    public static void main(String[] args) {
        String aux = "Desafio Padrões de Projeto";

        Codificador cod = new Codificador(new CodificadorSimples());
        System.out.println(aux);

        aux = cod.codifica(aux);
        System.out.println(aux);

        aux = cod.deCodifica(aux);
        System.out.println(aux);

        cod = new Codificador(new CodificadorDesloca());
        aux = cod.codifica(aux);
        System.out.println(aux);

        aux = cod.deCodifica(aux);
        System.out.println(aux);
    }
}
