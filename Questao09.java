/*Dados dois países, A com população igual a cinco milhões de pessoas, e taxa de natalidade de três por cento ao ano, e, B,
 * com população igual a sete milhões de pessoas e taxa de natalidade de dois por cento ao ano, escreva um programa em Java que
 * calcule iterativamente e exiba em quantos anos a população de A ultrapassará a população de B.*/

public class Questao09 {
    public static void main(String[] args) {

        double paisA = 5000000;
        double paisB = 7000000;
        int anos = 0;

        while (paisA < paisB) {
            paisA *= 1.03;
            paisB *= 1.02;
            anos++;
        }

        System.out.println("\nO país A levará " + anos + " anos para ultrapassar a população do país B.");
    }
}
