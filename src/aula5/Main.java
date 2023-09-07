package aula5;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
public class Main {
	
	public static void main(String[] args) {
		
		List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8);
		
		BinaryOperator<Integer> somar = (num1,num2) -> num1 + num2;
		
		int resultado = numeros.stream().reduce(0, somar);
		
		System.out.println("A soma é " + resultado);
	}

}