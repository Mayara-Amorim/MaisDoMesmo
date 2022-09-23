package br.com.mayara.basico;

public class CuriosidadeInteiros {

	public static void main(String[] args) {
		int var1 = 2147483647;
		int var2 = 1;
		//Somando 100 = -2147483549
		//Somando 1   = -2147483648
		System.out.println(var1 + var2);

	}

}
