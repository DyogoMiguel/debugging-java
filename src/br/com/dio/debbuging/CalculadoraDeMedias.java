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
        
        double soma;
        
            soma = 0;
            try {
            for(String aluno : alunos) {
                System.out.printf("Nota do aluno %s: ", aluno);
                double nota = scanner.nextDouble();
                soma += nota;

                
            }
        } catch (InputMismatchException e) {
            
            System.out.println("Apenas aceita valores numéricos");
        }
        return soma / alunos.length;
        
    }

}
