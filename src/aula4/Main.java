package aula4;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Main {
	
	public static void main(String[] args) {
		
		//Predicate
		
		//Criando lista de palavras
		List<String> palavras = Arrays.asList("Manoel", "Java", "Kotlin");
		
		
		Predicate<String> maisDe4Palavras = palavra -> palavra.length() > 4;

		palavras.stream().filter(maisDe4Palavras).
	    forEach(teste -> System.out.println(teste));
		/////////////////////////////////////////////////////////////////////
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
		


		numeros.stream().filter(p -> p % 2 == 0).forEach(System.out::println);
		
		
		//Sem predicate e sem lambda
		if(!numeros.isEmpty()) {
 			for(Integer m : numeros) {
 				if(m % 2 == 0) {
 					System.out.println(m);
 				}
 			}
		}
	}

}