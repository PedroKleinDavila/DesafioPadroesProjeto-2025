
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
        var dados = new FonteDeDados();

        var vm = new VisualizadorDeMedia(dados.getValores());
        var vs = new VisualizadorDeSomatorio(dados.getValores());

        Scanner s = new Scanner(System.in);
        int valor;
        while (true) {
            System.out.println("\nEntre um valor positivo maior que zero (0=fim):");
            System.out.println(" -1 = ligar visualizador de somatório");
            System.out.println(" -2 = ligar visualizador de média");
            System.out.println(" -3 = remover visualizador de somatório");
            System.out.println(" -4 = remover visualizador de média");

            valor = Integer.parseInt(s.nextLine());

            if (valor == 0) {
                break;
            } else if (valor == -1) {
                dados.addObserver(vs);
                System.out.println("Visualizador de Somatório ligado!");
            } else if (valor == -2) {
                dados.addObserver(vm);
                System.out.println("Visualizador de Média ligado!");
            } else if (valor == -3) {
                dados.removeObserver(vs);
                System.out.println("Visualizador de Somatório removido!");
            } else if (valor == -4) {
                dados.removeObserver(vm);
                System.out.println("Visualizador de Média removido!");
            } else if (valor > 0) {
                dados.add(valor);
            } else {
                System.out.println("Comando inválido.");
            }
        }
        System.out.println("Fim");
        s.close();
    }
}
