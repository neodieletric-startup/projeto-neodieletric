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

   
