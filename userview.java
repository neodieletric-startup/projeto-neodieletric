package View;

import java.util.Scanner;
import Model.ImpactoIA;

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
        return scanner.nextLine();
    }

    public String lerAplicacao() {
        System.out.print("Digite a aplicação do modelo: ");
        return scanner.nextLine();
    }

    public double lerConsumoEnergia() {
        System.out.print("Digite o consumo de energia (kWh): ");
        return scanner.nextDouble();
    }

    public boolean lerEnergiaRenovavel() {
        System.out.print("O modelo usa energia renovável? (true/false): ");
        return scanner.nextBoolean();
    }

    public int mostrarMenu() {
        System.out.println("\n=== Menu ===");
        System.out.println("1. Ver dados do impacto");
        System.out.println("2. Aplicar otimização");
        System.out.println("3. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); 
        return opcao;
    }

    public void mostrarImpacto(ImpactoIA impactoIA) {
        System.out.println("\n--- Dados do Impacto ---");
        System.out.println("Modelo: " + impactoIA.getNomeModelo());
        System.out.println("Aplicação: " + impactoIA.getAplicacao());
        System.out.println("Consumo de Energia: " + impactoIA.getConsumoEnergia() + " kWh");
        System.out.println("Usa energia renovável: " + (impactoIA.isUsaEnergiaRenovavel() ? "Sim" : "Não"));
        System.out.println("Emissão base: " + impactoIA.getEmissaoBase() + " tCO2");
        System.out.println("Eficiência aplicada: " + impactoIA.getEficiencia() + "%");
        System.out.println("Emissão otimizada: " + impactoIA.getEmissaoOtimizada() + " tCO2");
    }

    public double lerPercentualOtimizacao() {
        System.out.print("Digite o percentual de otimização (0 a 100): ");
        return scanner.nextDouble();
    }

    public void mostrarMensagem(String mensagem) {
        System.out.println(mensagem);
    }
}