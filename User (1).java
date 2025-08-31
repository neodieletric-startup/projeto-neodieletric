package Model;

public class ImpactoIA {
    private String nomeModelo;        
    private double consumoEnergia;     
    private boolean usaEnergiaRenovavel; 
    private String aplicacao;         
    private double eficiencia;          

    // ---------- Construtor ----------
    public ImpactoIA(String nomeModelo, double consumoEnergia, boolean usaEnergiaRenovavel, String aplicacao) {
        this.nomeModelo = nomeModelo;
        this.consumoEnergia = consumoEnergia;
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
        this.aplicacao = aplicacao;
        this.eficiencia = 0; // valor inicial
    }

    // ---------- Getters e Setters ----------
    public String getNomeModelo() {
        return nomeModelo;
    }

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public double getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(double consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public boolean isUsaEnergiaRenovavel() {
        return usaEnergiaRenovavel;
    }

    public void setUsaEnergiaRenovavel(boolean usaEnergiaRenovavel) {
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
    }

    public String getAplicacao() {
        return aplicacao;
    }

    public void setAplicacao(String aplicacao) {
        this.aplicacao = aplicacao;
    }

    public double getEficiencia() {
        return eficiencia;
    }

    // ---------- Métodos principais ----------
    // Calcula emissão de CO2 sem otimização
    public double getEmissaoBase() {
        double fator = usaEnergiaRenovavel ? 0.05 : 0.233; 
        return consumoEnergia * fator;
    }

    // Calcula emissão de CO2 considerando otimização
    public double getEmissaoOtimizada() {
        return getEmissaoBase() * (1 - eficiencia / 100);
    }

    // Define percentual de eficiência (0 a 100)
    public void aplicarOtimizacao(double percentual) {
        if (percentual >= 0 && percentual <= 100) {
            this.eficiencia = percentual;
        }
    }

    // ---------- Representação em texto ----------
    @Override
    public String toString() {
        return String.format(
            "ImpactoIA {\n" +
            "  Modelo: %s\n" +
            "  Aplicação: %s\n" +
            "  Consumo de Energia: %.2f kWh\n" +
            "  Energia Renovável: %s\n" +
            "  Emissão de CO2 (base): %.2f kg\n" +
            "  Emissão de CO2 (otimizada): %.2f kg\n" +
            "  Eficiência: %.1f%%\n" +
            "}",
            nomeModelo, aplicacao, consumoEnergia,
            usaEnergiaRenovavel ? "Sim" : "Não",
            getEmissaoBase(), getEmissaoOtimizada(), eficiencia
        );
    }
}
