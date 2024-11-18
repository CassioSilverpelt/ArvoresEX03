package view;

import br.edu.fateczl.arvore.caractere.ArvoreChar;

public class ArvoreEx03PrincipalChar {

	public static void main (String[] args) {
		
		String[] vetor = {"M", "F", "S", "D", "J", "P", "U", "A", "E", "H", "Q", "T", "W", "K"};
		int tamanho = vetor.length;
		
		ArvoreChar arvorechar = new ArvoreChar();
		
		for (int i = 0; i < tamanho; i++ ) {
			arvorechar.insert(vetor[i].charAt(0));
		}
		
		arvorechar.remove("F".charAt(0));
		arvorechar.remove("U".charAt(0));
		
		try {
			arvorechar.prefixSearch();
			System.out.println();
			arvorechar.infixSearch();
			System.out.println();
			arvorechar.postfixSearch();
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
	
}
