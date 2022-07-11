package caixa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) { // (comunica��o com o usu�rio)
        Scanner input = new Scanner(System.in);
        Caixa caixa = new Caixa(); // Objeto
        caixa.saldo = 1000.00; // Argumento

        double valorRecebido; // Vari�vel
        double soma = 0; // Vari�vel
        List<Double> credito = new ArrayList<>(); // ArrayList
        String respostas = "";   // Vari�vel

        // Estrutura de repeti��o:
        do {

            System.out.print("Digite o n�meros de lan�amentos que voc� deseja fazer: "); // Texto interativo
            int lancamentos = input.nextInt();

            System.out.print("Voc� quer fazer no cr�dito ou no d�bito?:  ");// Texto interativo
            respostas = input.next();
            if (respostas.equalsIgnoreCase("credito")) {
                for (double contador = 0; contador < lancamentos; contador++) {
                    System.out.print("Digite o " + (contador + 1) + "� valor: "); // Texto interativo
                    credito.add(input.nextDouble());
                    soma += (double) credito.get((int) contador);
                    caixa.credito = soma;
                }
                System.out.println(caixa.credito());

            }
            if (respostas.equalsIgnoreCase("debito")) {
                for (double contador = 0; contador < lancamentos; contador++) {
                    System.out.print("Digite o " + (contador + 1) + "� valor: "); // Texto interativo
                    credito.add(input.nextDouble());
                    soma += (double) credito.get((int) contador);
                    caixa.debito = soma;
                }
                System.out.println(caixa.debito()); // Impress�o do m�todo



            }
            System.out.println("Voc� deseja fazer mais alguma movimenta��o? [S/N]: "); // Texto interativo
            respostas = input.next(); // tipo da resposta (string)
        //enquanto a resposta do usuario for "s", repostas � igual a "s" (ignore caso a resposta for s min�sculo)
        }while (respostas.equalsIgnoreCase("s")); // while (enquanto)
        System.out.println("Agradecemos pele prefer�ncia, at� a pr�xima.");// Texto interativo


    }
}
