package exercicio04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		  Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite as quatro notas do aluno:");
	        double nota1 = scanner.nextDouble();
	        double nota2 = scanner.nextDouble();
	        double nota3 = scanner.nextDouble();
	        double nota4 = scanner.nextDouble();

	        double media = (nota1 + nota2 + nota3 + nota4) / 4;

	        if (media >= 7) {
	            System.out.println("Aluno aprovado! Média: " + media);
	        } else {
	            System.out.println("Digite a nota do exame:");
	            double notaExame = scanner.nextDouble();
	            double novaMedia = (media + notaExame) / 2;

	            if (novaMedia >= 5) {
	                System.out.println("Aluno aprovado em exame! Nova média: " + novaMedia);
	            } else {
	                System.out.println("Aluno reprovado. Nova média: " + novaMedia);
	            }
	        }

	        scanner.close();
	    }
	}
