package aula1;

import java.util.Arrays;
import java.util.List;

public class Main {
	
	//Consumer T

	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);
	
	numeros.stream().forEach(n -> {
		if(n % 2 == 0) {
			System.out.println(n);
		}
	});

	}
}
