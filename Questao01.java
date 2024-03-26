/*Crie um programa que lê vários números inteiros e positivos e imprima o produto dos números ímpares e a soma dos números pares.
 */

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b = 0, c = 1;


        while (true) {
            System.out.print("Informe um número. Digite '0' para interromper o programa: ");
            a = in.nextInt();
            System.out.println();
            if (a == 0) {
                break;
            }
            else if (a % 2 == 0) {
                b += a;

            }
            else if (a % 2 != 0) {
                c *= a;
            }

        }


        System.out.println("Soma dos números pares: " + b);
        System.out.println("Produto dos números ímpares: " + c);




        in.close();
    }
}
