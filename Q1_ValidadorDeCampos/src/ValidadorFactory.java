
public class ValidadorFactory {

    public static Validador criarValidador(TipoValidador tipo) {
        switch (tipo) {
            case TipoValidador.EMAIL:
                return new ValidadorEmail();
            case TipoValidador.INTEIRO:
                return new ValidadorInteiro();
            case TipoValidador.MATRICULA:
                return new ValidadorMatricula();
            default:
                throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }
}
