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

        System.out.print("Digite o consumo de energia (kWh): ");
        double consumo = scanner.nextDouble();

        System.out.print("O modelo usa energia renovável? (true/false): ");
        boolean energiaRenovavel = scanner.nextBoolean();

        impactoIA = new ImpactoIA(nomeModelo, consumo, energiaRenovavel, aplicacao);

        menu();
    }

    private void menu() {
        int opcao;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Ver dados do impacto");
            System.out.println("2. Aplicar otimização");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine(); // limpar buffer

            switch (opcao) {
                case 1:
                    exibirImpacto();
                    break;
                case 2:
                    aplicarOtimizacao();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    private void exibirImpacto() {
        System.out.println("\n" + impactoIA.toString());
    }

    private void aplicarOtimizacao() {
        System.out.print("Digite o percentual de otimização (0 a 100): ");
        double percentual = scanner.nextDouble();
        impactoIA.aplicarOtimizacao(percentual);
        System.out.println("Otimização aplicada com sucesso!");
    }

    public static void main(String[] args) {
        ImpactoIAController controller = new ImpactoIAController();
        controller.iniciar();
    }
}
private void menu() {
        int opcao = 0;
        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Ver dados do impacto");
            System.out.println("2. Aplicar otimização");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = scanner.nextInt();
                scanner.nextLine(); // limpar buffer
            } catch (InputMismatchException e) {
                System.out.println("Opção inválida. Digite um número entre 1 e 3.");
                scanner.nextLine(); // limpar buffer
                continue;
            }

            switch (opcao) {
                case 1:
                    exibirImpacto();
                    break;
                case 2:
                    aplicarOtimizacao();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
    }

    private void exibirImpacto() {
        System.out.println("\n" + impactoIA.toString());
    }

    private void aplicarOtimizacao() {
        double percentual = 0;
        while (true) {
            try {
                System.out.print("Digite o percentual de otimização (0 a 100): ");
                percentual = scanner.nextDouble();
                scanner.nextLine(); // limpar buffer
                if (percentual < 0 || percentual > 100) {
                    System.out.println("Por favor, digite um valor entre 0 e 100.");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida. Digite um número válido.");
                scanner.nextLine(); // limpar buffer
            }
        }
        impactoIA.aplicarOtimizacao(percentual);
        System.out.println("Otimização aplicada com sucesso!");
    }

    public static void main(String[] args) {
        ImpactoIAController controller = new ImpactoIAController();
        controller.iniciar();
    }
}