public class ValidadorInteiro implements Validador {
    public boolean valida(Tipo tipo, String valor) {
        if (tipo != Tipo.INTEIRO) return false;
        for (int i = 0; i < valor.length(); i++) {
            if (!Character.isDigit(valor.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
