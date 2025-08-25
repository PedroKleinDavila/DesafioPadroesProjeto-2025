public class App {
    public static void main(String[] args) {
        Validador v1 = ValidadorFactory.criarValidador("email");
        System.out.println(v1.valida(Validador.Tipo.EMAIL, "teste@email.com")); 

        Validador v2 = ValidadorFactory.criarValidador("inteiro");
        System.out.println(v2.valida(Validador.Tipo.INTEIRO, "12345")); 

        Validador v3 = ValidadorFactory.criarValidador("matricula");
        System.out.println(v3.valida(Validador.Tipo.MATRICULA, "12346")); 
    }
}
