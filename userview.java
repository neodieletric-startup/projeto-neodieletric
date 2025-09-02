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