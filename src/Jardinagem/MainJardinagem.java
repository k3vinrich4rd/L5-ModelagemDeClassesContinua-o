package Jardinagem;

import java.util.Scanner;

public class MainJardinagem {
    public static void main(String[] args) { // (comunica��o com o usu�rio)
        Scanner input = new Scanner(System.in);
        Jardinagem jardinagem = new Jardinagem(); // Objeto
        jardinagem.nomeJardim = "Fazendinha"; // Argumento
        jardinagem.quantidadeMetros = 30; // Argumento
        jardinagem.quantidaddeDePlantas = 10; // Argumento
        jardinagem.quantidadeMetrosGrama = 25; // Argumento
        jardinagem.valorAdubo = 16.83; // Argumento
        jardinagem.valorMetroGrama = 20; // Argumento
        jardinagem.valorCorteGrama = 50; // Argumento


        jardinagem.precoCorteGrama(); // M�todo

        //Console de intera��o
        System.out.println("Nome do jardim: " + jardinagem.nomeJardim + "\nQuantidade de metros: " + jardinagem.quantidadeMetros +
                "\nQuantidades de plantas no terreno: " + jardinagem.quantidaddeDePlantas + "\nQuantidade de metros de grama no terreno: " +
                jardinagem.quantidadeMetrosGrama
                + "\nValor que ser� vendido o meu adubo: " +
                jardinagem.valorAdubo + "\nValor do metro por grama: " +
                jardinagem.quantidadeMetrosGrama + "\nValor corte grama: " + jardinagem.valorCorteGrama);


    }

}

