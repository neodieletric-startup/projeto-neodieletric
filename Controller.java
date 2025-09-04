import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpactoIAController {

    private ImpactoIA impactoIA;
    private Scanner scanner;

    public ImpactoIAController() {
        scanner = new Scanner(System.in);
    }

    public void iniciar() {
        System.out.println("=== Sistema de Cálculo de Impacto de IA ===");

        System.out.print("Digite o nome do modelo: ");
        String nomeModelo = scanner.nextLine();

        System.out.print("Digite a aplicação do modelo: ");
        String aplicacao = scanner.nextLine();

        double consumo = 0;
        while (true) {
            try {
                System.out.print("Digite o consumo de energia (kWh): ");
                consumo = scanner.nextDouble();
                scanner.nextLine(); // limpar buffer
                break; // entrada válida, sair do loop
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite um número válido.");
                scanner.nextLine(); // limpar buffer
            }
        }

        boolean energiaRenovavel = false;
        while (true) {
            try {
                System.out.print("O modelo usa energia renovável? (true/false): ");
                energiaRenovavel = scanner.nextBoolean();
                scanner.nextLine(); // limpar buffer
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Por favor, digite true ou false.");
                scanner.nextLine(); // limpar buffer
            }
        }

        impactoIA = new ImpactoIA(nomeModelo, consumo, energiaRenovavel, aplicacao);

        menu();
    }
