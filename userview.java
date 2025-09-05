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

    public void mostrarImpacto(ImpactoIA impactoIA) {
        try {
            System.out.println("\n--- Dados do Impacto ---");
            System.out.println("Modelo: " + impactoIA.getNomeModelo());
            System.out.println("Aplicação: " + impactoIA.getAplicacao());
            System.out.println("Consumo de Energia: " + impactoIA.getConsumoEnergia() + " kWh");
            System.out.println("Usa energia renovável: " + (impactoIA.isUsaEnergiaRenovavel() ? "Sim" : "Não"));
            System.out.println("Emissão base: " + impactoIA.getEmissaoBase() + " tCO2");
            System.out.println("Eficiência aplicada: " + impactoIA.getEficiencia() + "%");
            System.out.println("Emissão otimizada: " + impactoIA.getEmissaoOtimizada() + " tCO2");
        } catch (Exception e) {
            System.out.println("Erro ao mostrar os dados do impacto.");
        }
    }

    public double lerPercentualOtimizacao() {
        System.out.print("Digite o percentual de otimização (0 a 100): ");
        try {
            return scanner.nextDouble();
        } catch (InputMismatchException e) {
            System.out.println("Valor inválido! Digite um número entre 0 e 100.");
            scanner.nextLine(); // limpar buffer
            return 0;
        }
    }

    public void mostrarMensagem(String mensagem) {
        try {
            System.out.println(mensagem);
        } catch (Exception e) {
            System.out.println("Erro ao exibir a mensagem.");
        }
    }
}
