package exercicio03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		   Scanner scanner = new Scanner(System.in);
	        
	        // Pedindo ao usuário para inserir as quatro notas
	        System.out.println("Digite as quatro notas do aluno:");
	        double nota1 = scanner.nextDouble();
	        double nota2 = scanner.nextDouble();
	        double nota3 = scanner.nextDouble();
	        double nota4 = scanner.nextDouble();
	        
	        // Calculando a média
	        double media = (nota1 + nota2 + nota3 + nota4) / 4;
	        
	        // Verificando se o aluno foi aprovado
	        if (media >= 5) {
	            System.out.println("O aluno foi aprovado com média: " + media);
	        } else {
	            System.out.println("O aluno não foi aprovado com média: " + media);
	        }
	        
	        scanner.close();
	    }
	}