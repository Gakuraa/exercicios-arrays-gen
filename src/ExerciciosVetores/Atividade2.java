package ExerciciosVetores;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[10];
		int i, soma = 0;
		int pares[] = new int[5];
		int impares[] = new int[5];
		float media = 0;

		for (i = 0; i < vetor.length; i++) {

			System.out.println("\nDigite o número na posição " + (i) + " do vetor :");
			vetor[i] = sc.nextInt();
			soma += vetor[i];

			if (i % 2 == 0) {
				pares[i/2] = vetor[i];
			} else {
				impares[i/2] = vetor[i];
			}

		}

		media = soma / vetor.length;

		System.out.println("\nElementos nos índices ímpares: \n" + Arrays.toString(impares));
		System.out.println("\nElementos nos pares ímpares: \n" + Arrays.toString(pares));
		System.out.println("\nSoma dos números: " + soma);
		System.out.println("\nA média é: " + media);

	}

}
