package exercicio05;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.println("Digite o valor de A:");
	        double a = scanner.nextDouble();

	        if (a == 0) {
	            System.out.println("A equação não é do segundo grau, pois A não pode ser zero.");
	            return;
	        }

	        System.out.println("Digite o valor de B:");
	        double b = scanner.nextDouble();

	        System.out.println("Digite o valor de C:");
	        double c = scanner.nextDouble();

	        double delta = b * b - 4 * a * c;

	        if (delta < 0) {
	            System.out.println("A equação não possui raízes reais.");
	        } else if (delta == 0) {
	            double raiz = -b / (2 * a);
	            System.out.println("A equação possui apenas uma raiz real: " + raiz);
	        } else {
	            double raiz1 = (-b + Math.sqrt(delta)) / (2 * a);
	            double raiz2 = (-b - Math.sqrt(delta)) / (2 * a);
	            System.out.println("As raízes da equação são: " + raiz1 + " e " + raiz2);
	        }
	    }
	}
