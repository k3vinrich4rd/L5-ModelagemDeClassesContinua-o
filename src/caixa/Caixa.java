package caixa;

import java.util.Scanner;

public class Caixa { //Classe
    Scanner input = new Scanner(System.in);
    public double saldo; // Atributo
    public double credito; // Atributo
    public double debito; // Atributo

    public Caixa() { //Construtor
        this.saldo = 1000.00;
        this.credito = credito;
        this.debito = debito;
    }
    public double credito() { //Método
        return saldo += credito;

    }
    public double debito() { //Método
       return saldo -= debito;
    }
}
