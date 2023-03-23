package br.edu.ifba.principal;

import java.util.Arrays;
import java.util.Scanner;

import br.edu.ifba.basicas.Aluno;
import br.edu.ifba.colecao.ColecaoAluno;

public class Principal {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		ColecaoAluno ca = new ColecaoAluno();

		for (int i = 0; i <2; i++) {
			
			Aluno a = new Aluno();
			System.out.println("Digite o nome: ");
			a.setNome(scan.nextLine());
			System.out.println("Digite o cpf: ");
			a.setCpf(scan.nextLine());
			System.out.println("Digite a matricula: ");
			a.setMatricula(scan.nextLine());

			ca.cadastrarAluno(a);
		}

		System.out.println(Arrays.toString(ca.retornoAluno()));

	}

}
