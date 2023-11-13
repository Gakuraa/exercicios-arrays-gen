package ExerciciosVetores;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int vetor[] = new int[10];
		int i;
		int valorDesejado, posicao = -1;

		System.out.println("Digite o número desejado: ");
		valorDesejado = sc.nextInt();

		for (i = 0; i < vetor.length; i++) {
			System.out.println("Digite o número que quer adicionar no vetor: ");
			vetor[i] = sc.nextInt();
			if (valorDesejado == vetor[i]) {
				posicao = i;
			}
		}

		if (posicao != -1) {
			System.out.println("O número " + valorDesejado + " está na posição: " + (posicao + 1));
		} else {
			System.out.println("O número " + valorDesejado + " não foi encontrado!");
		}

	}

}
