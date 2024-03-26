/*Faça um algoritmo que receba a idade, altura e peso de 10 pessoas. Calcule e mostre:
a) a quantidade de pessoas com idade superior a 50 anos;
b) a média das alturas das pessoas com idade entre 10 e 20 anos;
c) a porcentagem de pessoas com peso inferior a 40 quilos entre todas as pessoas.
*/

import java.util.Scanner;

public class Questao03 {
    public static void main(String[] args) {

        int idade = 0;
        double altura = 0;
        double peso = 0;
        int idadeRange = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print("Informe sua idade: ");
            int a = in.nextInt();
            System.out.print("Informe sua altura: ");
            int b = in.nextInt();
            System.out.print("Informe seu peso: ");
            int c = in.nextInt();

            if (a > 50) {
                idade++;
            }
            else if (a >= 10 && a <= 20) {
                altura += b;
                idadeRange++;
            }

            if (c < 40) {
                peso++;
            }

        }

        System.out.println("Quantidade de pessoas com idade superior a 50 anos: " + idade);
        System.out.println("Média da altura das pessoas com idade entre 10 e 20 anos: " + (altura / idadeRange));
        System.out.println("Porcentagem de pessoas com o peso inferior a 40 quilos entre todas as pessoas: " + peso * 10);


        in.close();
    }
}
