/*Escreva um programa em Java que calcule o produto de A (número real) por B (número inteiro), ou seja, A*B, por intermédio de adições sucessivas. Tanto A quanto B devem ser fornecidos pela pessoa utilizadora do programa.
 */

import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double a = 0;
        int b = 0;
        double produto = 0;

        System.out.print("\nInforme um número real: ");
        a = in.nextDouble();
        System.out.print("\nInforme um número inteiro: ");
        b = in.nextInt();

        for (int i = 0; i < b; i++) {
            produto += a;
        }

        System.out.println("\n" + a + " * " + b + " = " + produto);

        in.close();
    }
}
