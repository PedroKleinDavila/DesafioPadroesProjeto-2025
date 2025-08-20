public class ValidadorFactory {
    public static Validador criarValidador(String tipo){
        switch (tipo) {
            case "email": return new ValidadorEmail();
            case "inteiro": return new ValidadorInteiro();
            case "matricula": return new ValidadorMatricula();
            default: throw new IllegalArgumentException("Tipo desconhecido: " + tipo);
        }
    }
}
