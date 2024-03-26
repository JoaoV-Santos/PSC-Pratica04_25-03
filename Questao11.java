/*Na usina de Angra dos Reis, os técnicos analisam a perda de massa de um material radioativo. Sabendo-se que este perde 25% de
 sua massa a cada 30 segundos. Criar um programa que calcule iterativamente e imprima o tempo necessário para que a massa deste material se
 torne menor que 0,10 grama. O programa pode calcular o tempo para várias massas.
 */

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double massa, massaReduzida;
        double tempoSeg = 0;
        double taxaDecaimento = 1.0 - ((double) 25 / (30 * 100));

        while (true) {
            System.out.print("\nInforme a massa do material radioativo em gramas ou digite '0' para sair do programa: ");
            massa = in.nextDouble();
            massaReduzida = massa;

            if (massaReduzida == 0) {
                System.out.println("\n\nPrograma Encerrado!");
                break;
            }
            else {
                while (massaReduzida >= 0.10) {
                    //massaReduzida = massa;
                    massaReduzida *= taxaDecaimento;
                    tempoSeg++;
                }

                System.out.println("\nUm material com massa de " + massa + " gramas levará " + tempoSeg + " segundos para se tornar menor que 0,10 grama, com " + massaReduzida + " grama");
                tempoSeg = 0;
            }
        }

        in.close();
    }
}
