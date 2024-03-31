package exercicio08;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[5];
        
        // Lendo os números
        System.out.println("Digite cinco números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i+1) + ": ");
            numeros[i] = scanner.nextInt();
        }
        
        // Encontrando o maior e o menor valor
        int maior = numeros[0];
        int menor = numeros[0];
        for (int i = 1; i < 5; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }
        
        // Exibindo o resultado
        System.out.println("O maior número é: " + maior);
        System.out.println("O menor número é: " + menor);
        
        scanner.close();
    }
}