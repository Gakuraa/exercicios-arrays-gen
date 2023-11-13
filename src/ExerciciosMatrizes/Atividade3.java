package ExerciciosMatrizes;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int matriz[][] = new int[3][3];
		int somaDiagPrin = 0, somaDiagSec = 0;
		int i, y;

		for (i = 0; i < 3; i++) {
			for (y = 0; y < 3; y++) {
				System.out.println("\nDigite um número: ");
				matriz[i][y] = sc.nextInt();

				if (i == y) {
					somaDiagPrin += matriz[i][y];
				}
				if ((i + y) == 2) {
					somaDiagSec += matriz[i][y];
				}
			}
		}

		System.out.println(
				"\nElementos na diagonal principal: \n" + matriz[0][0] + ", " + matriz[1][1] + ", " + matriz[2][2]);
		System.out.println(
				"\nElementos na diagonal principal: \n" + matriz[0][2] + ", " + matriz[1][1] + ", " + matriz[2][0]);
		System.out.println("\nSoma dos elementos da diagonal principal: " + somaDiagPrin);
		System.out.println("\nSoma dos elementos da diagonal secundária: " + somaDiagSec);

	}
}
