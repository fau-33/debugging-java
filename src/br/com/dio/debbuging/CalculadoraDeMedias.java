package br.com.dio.debbuging;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = {"Camila", "Lucas", "Bruna", "Pedro"};

        double media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %.1f", media);
    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);

            try {
                double nota = scanner.nextDouble();
                soma += nota;
            } catch (InputMismatchException e) {
                System.err.println("Entrada inválida. Digite um número decimal válido para a nota.");
                scanner.nextLine(); // Clear the scanner buffer to avoid infinite loop
            }
        }

        return soma / alunos.length;
    }
}
