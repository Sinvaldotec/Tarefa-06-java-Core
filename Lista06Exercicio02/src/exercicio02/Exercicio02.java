package exercicio02;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();
        
        int numeroAbsoluto = Math.abs(numero); // Usando a função abs para obter o valor absoluto
        
        System.out.println("O valor absoluto do número digitado é: " + numeroAbsoluto);
        
        scanner.close();
    }
}