package caixa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) { // (comunicação com o usuário)
        Scanner input = new Scanner(System.in);
        Caixa caixa = new Caixa(); // Objeto
        caixa.saldo = 1000.00; // Argumento

        double valorRecebido; // Variável
        double soma = 0; // Variável
        List<Double> credito = new ArrayList<>(); // ArrayList
        String respostas = "";   // Variável

        // Estrutura de repetição:
        do {

            System.out.print("Digite o números de lançamentos que você deseja fazer: "); // Texto interativo
            int lancamentos = input.nextInt();

            System.out.print("Você quer fazer no crédito ou no débito?:  ");// Texto interativo
            respostas = input.next();
            if (respostas.equalsIgnoreCase("credito")) {
                for (double contador = 0; contador < lancamentos; contador++) {
                    System.out.print("Digite o " + (contador + 1) + "º valor: "); // Texto interativo
                    credito.add(input.nextDouble());
                    soma += (double) credito.get((int) contador);
                    caixa.credito = soma;
                }
                System.out.println(caixa.credito());

            }
            if (respostas.equalsIgnoreCase("debito")) {
                for (double contador = 0; contador < lancamentos; contador++) {
                    System.out.print("Digite o " + (contador + 1) + "º valor: "); // Texto interativo
                    credito.add(input.nextDouble());
                    soma += (double) credito.get((int) contador);
                    caixa.debito = soma;
                }
                System.out.println(caixa.debito()); // Impressão do método



            }
            System.out.println("Você deseja fazer mais alguma movimentação? [S/N]: "); // Texto interativo
            respostas = input.next(); // tipo da resposta (string)
        //enquanto a resposta do usuario for "s", repostas é igual a "s" (ignore caso a resposta for s minúsculo)
        }while (respostas.equalsIgnoreCase("s")); // while (enquanto)
        System.out.println("Agradecemos pele preferência, até a próxima.");// Texto interativo


    }
}
