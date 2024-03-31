package exercicio07;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        int[] numeros = new int[4];
        
        // Leitura dos números
        System.out.println("Digite quatro números inteiros:");
        for (int i = 0; i < 4; i++) {
            numeros[i] = scanner.nextInt();
        }
        
        System.out.println("Números divisíveis por 2 e 3:");
        for (int numero : numeros) {
            if (numero % 2 == 0 && numero % 3 == 0) {
                System.out.println(numero);
            }
        }
        
        scanner.close();
    }
}