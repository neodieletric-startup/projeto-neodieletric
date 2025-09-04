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
