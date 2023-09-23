package br.com.aula.collections.model.mvc.arraylist;

import java.util.ArrayList;
import java.util.List;
public class AulaArrayList {
	
	
	public static void main(String[] args) {
		//Criando um ArrayList de nomes
		List<String> nomes = new ArrayList<>();
		
		//Cadastrar nomes
		nomes.add("Alice");
		nomes.add("Bianca");
		nomes.add("Caio");
		nomes.add("Dênis");
		nomes.add("Ellen");
		
		//Exibir a quantidade de nomes cadastrado
		System.out.println(nomes.size());
		
		//Percorrendo o ArrayList
		//foreach
		for (String nome : nomes) {
			System.out.println(nome);
		}
		System.out.println();
		//Alterar o nome Alice para Lucas
		nomes.set(0, "Lucas");
		//Remover o quinto nome no ArrayList (Ellen)
		nomes.remove(4);
		//Excluir todos os dados do ArrayList
		nomes.clear();
		// for index
		for (int indice = 0; indice < nomes.size(); indice++) {
			System.out.println(nomes.get(indice));
		}
	}
}
		
		
	