import java.util.InputMismatchException;
import java.util.Scanner;

public class ImpactoIAView {
    private Scanner scanner;

    public ImpactoIAView() {
        scanner = new Scanner(System.in);
    }

    public void mostrarInicio() {
        System.out.println("=== Sistema de Cálculo de Impacto de IA ===");
    }

    public String lerNomeModelo() {
        System.out.print("Digite o nome do modelo: ");
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Erro ao ler o nome do modelo.");
            return "";
        }
    }

    public String lerAplicacao() {
        System.out.print("Digite a aplicação do modelo: ");
        try {
            return scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Erro ao ler a aplicação.");
            return "";
        }
    }

    public double lerConsumoEnergia() {
        System.out.print("Digite o consumo de energia (kWh): ");
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido! Digite um número.");
            scanner.nextLine(); 
            return 0;
        }
    }

    public boolean lerEnergiaRenovavel() {
        System.out.print("O modelo usa energia renovável? (true/false): ");
        try {
            return scanner.nextBoolean();
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! Digite true ou false.");
            scanner.nextLine(); 
            return false;
        }
    }

    public int mostrarMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Ver dados do impacto");
        System.out.println("2. Aplicar otimização");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        try {
            int opcao = scanner.nextInt();
            scanner.nextLine(); 
            return opcao;
        } catch (InputMismatchException e) {
            System.out.println("Opção inválida! Digite um número inteiro.");
            scanner.nextLine();
            return -1;
        }
    }
