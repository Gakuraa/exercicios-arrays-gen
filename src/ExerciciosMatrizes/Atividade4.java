package ExerciciosMatrizes;

import java.util.Arrays;
import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float classe[][] = new float[10][4];
		float medias[] = new float[10];
		int bimestre, aluno;

		for (aluno = 0; aluno < 10; aluno++) {
			float soma = 0;
			for (bimestre = 0; bimestre < 4; bimestre++) {
				System.out.println(
						"\nDigite a nota do " + (bimestre + 1) + "° bimestre do " + (aluno + 1) + "° aluno: \n");
				classe[aluno][bimestre] = sc.nextFloat();
				soma += classe[aluno][bimestre];
			}
			medias[aluno] = soma/4;
		}

		System.out.println("Vetor das médias: " + Arrays.toString(medias));
	}
}
