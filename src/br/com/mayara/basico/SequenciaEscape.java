package br.com.mayara.basico;

public class SequenciaEscape {

	public static void main(String[] args) {
		System.out.println("\"Hello, world!\"");
		
// Se eu desejar dar output em hello, world com aspas duplas,
// o java não vai entender e não vai deixar,
// por isso uso a barra.
		System.out.print("\"Hello, world!\"\n\r");
		
// O "ln" final do System.out.println("\"Hello, world!\"");	
// tem a mesma função de se usar \n\r.
		
		System.out.println("1\\4");
		
// Se eu quiser imprimir o valor 1\4, eu tenho que 
// inserir duas barras, pois uma barra é entendido
// como comando de escape.
		
	}

}
