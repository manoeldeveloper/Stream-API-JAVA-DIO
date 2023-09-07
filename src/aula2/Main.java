package aula2;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

		
public static void main(String[] args) {
	
	//Supplier T

	Supplier<String> saudacao = () -> "Olá mundo com Supplier";
	
	//Usar Supplier para obter uma lista com 5 saudações
	
	List<String> listaSaudacoes = Stream.generate(() -> "Salve").limit(5).
			collect(Collectors.toList());
	
	//imprimir saudações geradas
	
	listaSaudacoes.forEach(System.out::println);
}

}
