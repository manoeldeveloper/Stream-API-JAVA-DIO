package aula3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class Main {
	
	public static void main(String[] args) {
		
		//Function
		
		//Criando lista de números inteiros
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
		
		//Usar Function com lambda para dobrar todos os números
		//       Entrada - Saida
		Function<Integer, Integer> dobrar = numero -> numero * 2;
		
		//Usar a função para dobrar todos os números e deixar em outra lista
		List<Integer> numerosDobrados = numeros.stream().map(dobrar).toList();
		
		//Imprimir números dobrados
		numerosDobrados.forEach(System.out::println);
		
	}

}
