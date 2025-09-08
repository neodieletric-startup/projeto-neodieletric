package model;

public class ImpactoIA {
    private String nomeModelo;        
    private double consumoEnergia;     
    private boolean usaEnergiaRenovavel; 
    private String aplicacao;         
    private double eficiencia;         

    public ImpactoIA(String nomeModelo, double consumoEnergia, boolean usaEnergiaRenovavel, String aplicacao) {
        this.nomeModelo = nomeModelo;
        this.consumoEnergia = consumoEnergia;
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
        this.aplicacao = aplicacao;
        this.eficiencia = 0; 
    }

    public ImpactoIA(String nomeModelo, double consumoEnergia, boolean usaEnergiaRenovavel, String aplicacao, double eficiencia) {
        this.nomeModelo = nomeModelo;
        this.consumoEnergia = consumoEnergia;
        this.usaEnergiaRenovavel = usaEnergiaRenovavel;
        this.aplicacao = aplicacao;
        this.eficiencia = eficiencia; 
    }

 
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
  
