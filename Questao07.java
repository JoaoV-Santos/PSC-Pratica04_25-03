/*Crie um programa em Java que exiba formas geométricas na tela. Um menu deve ser exibido com as seguintes opções: retângulo,
diagonal superior esquerda, diagonal superior direita, diagonal inferior esquerda, diagonal inferior direita. As imagens devem ser formadas por
 asteriscos (*) e, a pessoa utilizadora deve informar a quantidade de colunas. Abaixo estão alguns exemplos das formas:*/

import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("\nEscolha uma das formas geométricas abaixo.\n\nRetangulo\nDiagonal Superior Esquerda\nDiagonal Superior Direita\nDiagonal Inferior Esquerda\nDiagonal Inferior Direita");
        String forma = in.nextLine();
        System.out.print("\nEscolha a quantidade de colunas: ");
        int colunas = in.nextInt();
        System.out.println();

        int linhas = colunas;

        if (forma.equalsIgnoreCase("retangulo")) {

            for (int l = 0; l < colunas; l++) {
                for (int c = 0; c < colunas; c++)
                    System.out.print("* ");

                System.out.print("\n");
            }
        }

        else if (forma.equalsIgnoreCase("diagonal superior esquerda")) {

            for (int l = 0; l < colunas; l++) {

                for (int c = 0; c < linhas; c++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
                linhas--;
            }
        }

        else if (forma.equalsIgnoreCase("diagonal superior direita")) {
            String espaco = "";

            for (int l = 0; l < colunas; l++) {

                for (int c = 0; c < linhas; c++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
                linhas--;
                espaco = espaco + "  ";
                System.out.print(espaco);
            }
        }

        else if (forma.equalsIgnoreCase("diagonal inferior esquerda")) {
            String espaco = "";

            for (int e = 0; e < colunas; e++)
                espaco = espaco + "  ";

            linhas = 0;

            for (int l = 0; l < colunas; l++) {
                System.out.print("* ");

                for (int c = 0; c < linhas; c++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
                linhas++;
            }
        }

        else if (forma.equalsIgnoreCase("diagonal inferior direita")) {
            String espaco = "";

            for (int e = 0; e < colunas; e++)
                espaco = espaco + "  ";

            linhas = 0;


            for (int l = 0; l < colunas; l++) {
                System.out.print(espaco);
                System.out.print("* ");

                for (int c = 0; c < linhas; c++) {
                    System.out.print("* ");
                }
                System.out.print("\n");
                linhas++;
                espaco = espaco.substring(0, espaco.length()-2);
            }
        }


        in.close();
    }
}
