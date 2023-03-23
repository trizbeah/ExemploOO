package br.edu.ifba.colecao;

import br.edu.ifba.basicas.Aluno;

public class ColecaoAluno {
	
	private Aluno [] a = new Aluno [2];
	
	public void cadastrarAluno (Aluno a) {
		
		for (int i = 0; i < this.a.length; i++) {
			if (this.a [i] == null) {
				this.a[i] = a;
				break;
			}
		
		
	}

}
	public Aluno [] retornoAluno() {
		return this.a;
	}
}
