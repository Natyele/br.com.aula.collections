package br.com.aula.collections.mvc.model.hashmap;

import java.util.HashMap;

public class AulaHashMap {
	
	public static void main(String[] args) {
		//Criando um HashMap
		HashMap<String, String> estados = new HashMap<String, String>();
		
		// Adicionando dados em cada posição do HashMap
		estados.put("Santa Catarina","Florianópolis");
		estados.put("Paraná", "Curitiba");
		estados.put("Minas Gerais", "Belo Horizonte");
		estados.put("Pará", "Belo Belém");
		
		//Exibindo o valor do HashMap
		System.out.println(estados);
		
		System.out.println(estados.get("Santa Catarina"));

		// Removendo o elemento onde a chave seja Paraná
		estados.remove("Paraná");
		System.out.println(estados);
	}
}
