package caixa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainCaixa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Caixa caixa = new Caixa();
        caixa.saldo = 1000.00;

        double valorRecebido;
        double soma = 0;

        List<Integer> credito = new ArrayList<>();

        String respostas = "";
        System.out.print("Digite o n�meros de lan�amentos que voc� deseja fazer: ");
        int lancamentos = input.nextInt();

        System.out.print("Voc� quer fazer no cr�dito ou no d�bito?:  ");
        respostas = input.next();
        if (respostas.equalsIgnoreCase("credito")) {
            for (double contador = 0; contador < lancamentos; contador++) {
                System.out.print("Digite o " + (contador + 1) + "� valor: ");
                caixa.credito = input.nextDouble();

            }

        }


    }
}
