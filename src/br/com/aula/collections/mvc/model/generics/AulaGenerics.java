package br.com.aula.collections.mvc.model.generics;

public class AulaGenerics {
	
	public static void main(String[] args) {
		Integer[] idades = {18, 22, 31, 17};
		Double[] alturas = {1.50, 1.77, 1.64, 1.80};
		String[] nomes = {"Vanessa", "Rubens", "Larissa", "Gabriel", "Paloma"};
		
		exibir(idades);
		exibir(alturas);
		exibir(nomes);
	}
	
	//Método para listar os dados dos Arrays
	public static <E> void exibir(E[] vetores) {
		for (E elemento : vetores) {
			System.out.println(elemento);
		}
	}

}
