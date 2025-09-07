 package controller;

import model.ImpactoIA;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Controller {
    private ImpactoIA impactoIA;
    private Scanner scanner;

    public Controller() {
        scanner = new Scanner(System.in);
    }

    public void cadastrarImpacto() {
        try {
            System.out.print("Digite o nome do modelo: ");
            String nomeModelo = scanner.nextLine();

            System.out.print("Digite o consumo de energia (kWh): ");
            double consumoEnergia = scanner.nextDouble();

            System.out.print("Usa energia renovável? (true/false): ");
            boolean usaEnergiaRenovavel = scanner.nextBoolean();

            scanner.nextLine(); // limpar buffer
            System.out.print("Digite a aplicação: ");
            String aplicacao = scanner.nextLine();

            System.out.print("Digite a eficiência (%): ");
            double eficiencia = scanner.nextDouble();
