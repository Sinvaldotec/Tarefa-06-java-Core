package exercicio06;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor de A:");
        int a = scanner.nextInt();
        System.out.println("Digite o valor de B:");
        int b = scanner.nextInt();
        System.out.println("Digite o valor de C:");
        int c = scanner.nextInt();

        // Ordenação dos valores
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (a > c) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b > c) {
            int temp = b;
            b = c;
            c = temp;
        }

        // Apresenta os valores em ordem crescente
        System.out.println("Os valores em ordem crescente são: " + a + ", " + b + ", " + c);

        scanner.close();
    }
}
