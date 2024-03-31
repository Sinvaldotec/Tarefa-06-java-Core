package exercicio12;

import java.util.Scanner;

public class Exercicio12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Solicitar o nome da pessoa
        System.out.println("Digite o nome da pessoa:");
        String nome = scanner.nextLine();

        // Solicitar o sexo da pessoa
        System.out.println("Digite o sexo da pessoa (M para masculino, F para feminino):");
        char sexo = scanner.next().charAt(0);

        // Verificar o sexo e exibir a saudação apropriada
        if (sexo == 'M' || sexo == 'm') {
            System.out.println("Ilmo Sr. " + nome);
        } else if (sexo == 'F' || sexo == 'f') {
            System.out.println("Ilma Sra. " + nome);
        } else {
            System.out.println("Sexo inválido. Por favor, digite M para masculino ou F para feminino.");
        }

        scanner.close();
    }
}