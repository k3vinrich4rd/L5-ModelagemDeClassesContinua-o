package Jardinagem;

import java.util.Scanner;

public class MainJardinagem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Jardinagem jardinagem = new Jardinagem();
        jardinagem.nomeJardim = "Fazendinha";
        jardinagem.quantidadeMetros = 30;
        jardinagem.quantidaddeDePlantas = 10;
        jardinagem.quantidadeMetrosGrama = 25;
        jardinagem.valorAdubo = 16.83;
        jardinagem.valorMetroGrama = 20;
        jardinagem.valorCorteGrama = 50;


        jardinagem.precoCorteGrama();

        System.out.println("Nome do jardim: " + jardinagem.nomeJardim + "\nQuantidade de metros: " + jardinagem.quantidadeMetros +
                "\nQuantidades de plantas no terreno: " + jardinagem.quantidaddeDePlantas + "\nQuantidade de metros de grama no terreno: " +
                jardinagem.quantidadeMetrosGrama
                + "\nValor que será vendido o meu adubo: " +
                jardinagem.valorAdubo + "\nValor do metro por grama: " +
                jardinagem.quantidadeMetrosGrama + "\nValor corte grama: " + jardinagem.valorCorteGrama);


    }

}

