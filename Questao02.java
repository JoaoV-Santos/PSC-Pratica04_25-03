/*Faça um programa que leia um número indeterminado de valores e mostre o valor lido, seu quadrado, seu cubo e sua raiz quadrada. Finalize a entrada com valor negativo ou zero.
 */

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (true){
            System.out.print("\nInforme um número: ");
            int x = in.nextInt();

            if (x != 0){
                System.out.println("Número informado: " + x);
                System.out.println("Quarado do número informado: " + Math.pow(x, 2));
                System.out.println("Cubo do número informado: " + Math.pow(x, 3));
                System.out.println("Raiz quadrada do número informado: " + Math.sqrt(x));
            }
            else {
                System.out.println("\nPrograma Encerrado!");
                break;
            }

        }


        in.close();
    }
}
