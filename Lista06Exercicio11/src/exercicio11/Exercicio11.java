package exercicio11;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um valor inteiro: ");
        int valor = scanner.nextInt();

        if (valor <= 3) {
            System.out.println("O valor digitado é: " + valor);
        } else {
            System.out.println("O valor digitado não é menor ou igual a três.");
        }

        scanner.close();
    }
}