/*Escreva um programa que:
leia 100 fichas, onde cada ficha contém o número de matrícula e a nota de cada aluno;
de um determinado curso;
determine e imprima as duas maiores notas, juntamente com o número de matrícula do aluno que obteve cada uma delas;
assuma que não exista dois ou mais alunos com a mesma nota;
*/
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double nota, notaMaior1 = 0, notaMaior2 = 0, matricula = 0, matriculaMaior1 = 0, matriculaMaior2 = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o número da matrícula do aluno: ");
            matricula = in.nextDouble();
            matriculaMaior1 = 0;
            matriculaMaior2 = 0;

            System.out.print("Informe a nota do aluno: ");
            nota = in.nextDouble();
            /*notaMaior1 = 0;
            notaMaior2 = 0;*/

            if (nota > notaMaior1) {
                notaMaior2 = notaMaior1;
                notaMaior1 = nota;
                matriculaMaior2 = matriculaMaior1;
                matriculaMaior1 = matricula;

            }

            if (nota < notaMaior1 && nota > notaMaior2) {
                notaMaior2 = nota;
                matriculaMaior2 = matricula;
            }



        }

        System.out.println(matriculaMaior1 + " - " + notaMaior1);
        System.out.println(matriculaMaior2 + " - " + notaMaior2);



        in.close();
    }
}
