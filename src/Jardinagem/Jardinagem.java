package Jardinagem;

public class Jardinagem {
    // Atributos da classe
    String nomeJardim; //Atributos
    double quantidadeMetros; //Atributos
    int quantidaddeDePlantas; //Atributos
    double quantidadeMetrosGrama; //Atributos
    double quilosAdubo; //Atributos
    double valorAdubo; //Atributos
    double valorMetroGrama; //Atributos
    double valorCorteGrama; //Atributos

    public Jardinagem() { //Construtor
        this.nomeJardim = nomeJardim;
        this.quantidadeMetros = 0;
        this.quantidaddeDePlantas = quantidaddeDePlantas;
        this.quantidadeMetrosGrama = 20.0;
        this.quilosAdubo = quilosAdubo;
        this.valorAdubo = 16.83;
        this.valorMetroGrama = 100;
        this.valorCorteGrama = valorCorteGrama;


    }

    public void usarAdubo() { //Método vazio
        for (int contador = 0; contador < quantidadeMetrosGrama; contador += 2) {
            quilosAdubo += 0.1;
        }


    }
    public double precoAdubo() { // Método com retorno
        return quilosAdubo * valorAdubo;

    }

    public double precoCorteGrama() { //Método com retorno

        return valorCorteGrama = quantidadeMetrosGrama * valorMetroGrama;
    }



}
