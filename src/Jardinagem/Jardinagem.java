package Jardinagem;

public class Jardinagem {
    // Atributos da classe
    String nomeJardim;
    double quantidadeMetros;
    int quantidaddeDePlantas;
    double quantidadeMetrosGrama;
    double quilosAdubo;
    double valorAdubo;
    double valorMetroGrama;
    double valorCorteGrama;

    public Jardinagem() {
        this.nomeJardim = nomeJardim;
        this.quantidadeMetros = 0;
        this.quantidaddeDePlantas = quantidaddeDePlantas;
        this.quantidadeMetrosGrama = 20.0;
        this.quilosAdubo = quilosAdubo;
        this.valorAdubo = 16.83;
        this.valorMetroGrama = 100;
        this.valorCorteGrama = valorCorteGrama;


    }

    public void usarAdubo() {
        for (int contador = 0; contador < quantidadeMetrosGrama; contador += 2) {
            quilosAdubo += 0.1;
        }


    }
    public double precoAdubo() {
        return quilosAdubo * valorAdubo;

    }

    public double precoCorteGrama() {
        return valorCorteGrama = quantidadeMetrosGrama * valorMetroGrama;
    }



}
