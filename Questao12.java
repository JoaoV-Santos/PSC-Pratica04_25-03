/*Seja a seguinte série:
1, 4, 4, 2, 5, 5, 3, 6, 6, 4, 7, 7, …
Escreva um programa que seja capaz de gerar os N termos dessa série.
Esse número N deve ser lido do teclado.
*/

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Informe o número de termos: ");
        int n = in.nextInt();
        int x = 1;
        System.out.print(x + ",");

        for (int i = 0; i < n; i++) {

            x += 3;
            System.out.print(x + ", " + x + ", ");
            x = x - 2;
            System.out.print(x + ", ");
        }


        in.close();
    }
}
