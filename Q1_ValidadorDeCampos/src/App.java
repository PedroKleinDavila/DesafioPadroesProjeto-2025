
public class App {

    public static void main(String[] args) {
        Validador v1 = ValidadorFactory.criarValidador(TipoValidador.EMAIL);
        System.out.println(v1.valida("teste@email.com"));

        Validador v2 = ValidadorFactory.criarValidador(TipoValidador.INTEIRO);
        System.out.println(v2.valida("12345"));

        Validador v3 = ValidadorFactory.criarValidador(TipoValidador.MATRICULA);
        System.out.println(v3.valida("12346"));
    }
}
