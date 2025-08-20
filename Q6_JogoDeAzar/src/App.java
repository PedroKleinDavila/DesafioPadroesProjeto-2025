
public class App {

    public static void main(String[] args) {
        Dado d6 = new Dado(6);
        Dado d20 = new Dado(20);
        DadoHist d6Histórico = new DadoHist(new Dado(6));
        d6.rolar();
        d20.rolar();
        d6Histórico.rolar();
        System.out.println("D6: " + d6.getValor());
        System.out.println("D20: " + d20.getValor());
        System.out.println("D6: " + d6Histórico.getValor());
        System.out.println("D6: " + d6Histórico.getHistorico());
    }
}
