package exercicio01;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro valor inteiro:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o segundo valor inteiro:");
        int valor2 = scanner.nextInt();

        int diferenca = calcularDiferenca(valor1, valor2);

        System.out.println("A diferença entre o maior e o menor valor é: " + diferenca);
    }

    public static int calcularDiferenca(int num1, int num2) {
        int maior = Math.max(num1, num2);
        int menor = Math.min(num1, num2);
        return maior - menor;
    }
}
