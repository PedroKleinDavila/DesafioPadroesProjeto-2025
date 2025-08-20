
public class Codificador {

    public enum Tipo {
        SIMPLES, DESLOCA
    };
    public ICodificadorStrategy _codificador;

    public Codificador(ICodificadorStrategy codificador) {
        _codificador = codificador;
    }

    public String codifica(String str) {
        return _codificador.codifica(str);
    }

    public String deCodifica(String str) {
        return _codificador.deCodifica(str);
    }
}
