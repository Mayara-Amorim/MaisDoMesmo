package br.com.mayara.basico;

import java.util.Scanner;

public class LeituraDadosTeclado {

	public static void main(String[] args) {
		Scanner scn = new Scanner (System.in);
		System.out.println("Digite seu nome completo: ");
		String nomeCompleto = scn.nextLine();
		System.out.println("Seu nome �: " + nomeCompleto);
		
		// Diferentemente do #nextLine, next n�o exibir� a linha inteira
		// de conteudo. Veja:
		
		System.out.println("Digite seu primeiro nome: ");
		String primeiroNome = scn.next();
		System.out.println("Seu nome �: " + primeiroNome);
		
		//Lendo um numero inteiro
		System.out.println("Digite sua idade: ");
		int idade = scn.nextInt();
		System.out.println("Sua idade �: " + idade);
		
		//Lendo um double
		
		System.out.println("Digite sua altura: ");
		double altura = scn.nextDouble();
		System.out.println("Sua altura �: " + altura);
		
		/*System.out.println("Digite seu primeiro nome, idade, quantidade"
	+ "\n de filhos, altura e se tem algum bichinho de estima��o (respectivamente): ");
	
		String primeiroNome = scn.next();
		int idade = scn.nextInt();
		byte filhos = scn.nextByte();
		float altura = scn.nextFloat();
		boolean estimacao = scn.nextBoolean();
		System.out.println("Voc� digitou os seguintes valores: ");
		System.out.println("Nome: " + primeiroNome);
		System.out.println("Idade: " + idade);
		System.out.println("Quantidade de filhos: " + filhos);
		System.out.println("Altura: " + altura);
		System.out.println("Tem animal de estima��o: " + estimacao);
		
		Deu Exception ;(
	*/
	}

}
