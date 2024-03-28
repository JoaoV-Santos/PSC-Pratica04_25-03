/*Em um campeonato de LOL, enquanto não há a tomada de território, o contador implementado deve contar (que é
contabilizado pelo jogo), o número de kills, deaths e assists. Se o número de kills for menor ou igual a 5, ele mostra a
mensagem “noob”, se chegar a 20 ou , é mostradmais “master”. Se o número de deaths chegar a 20 ou mais,  ele mostra a mensagem
“Houston, we have a problem”. Se o número de assists chegar a 20 ou maisa a mensagem: “team work”. Lembre-se, é uma rotina que continua
enquanto não houver um vencedor.
 */

import java.util.Scanner;

public class Questao04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int kills = 0, deaths = 0, assists = 0;
        char vencedor;

        do {
            System.out.print("\n\nInforme o número de kills: ");
            kills = in.nextInt();
            System.out.print("\nInforme o número de deaths: ");
            deaths = in.nextInt();
            System.out.print("\nInforme o número de assists: ");
            assists = in.nextInt();

            System.out.println();

            if (kills <= 5)
                System.out.println("Noob");
            else if (kills >= 20)
                System.out.println("Master!");

            if (deaths >= 20)
                System.out.println("Houston, we have a problem!");

            if (assists >= 20)
                System.out.println("Team Work!");

            System.out.println("\nHá um vencedor?");
            vencedor = in.next().charAt(0);

        } while (vencedor != 's');


        in.close();
    }
}
