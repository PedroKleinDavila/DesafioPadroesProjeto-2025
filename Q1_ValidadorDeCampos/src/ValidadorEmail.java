public class ValidadorEmail implements Validador {
    public boolean valida(Tipo tipo, String valor) {
        if (tipo != Tipo.EMAIL) return false;
        int posA = valor.indexOf('@');
        int posPt = valor.indexOf('.');
        if (posA <= 0 || posPt <= 0) return false;
        return true;
    }
}
