package br.com.mayara.basico;

import java.util.Scanner;

public class TreinandoLeituturaOperadoresLogicosRelacionaisAritmeticos {

	public static void main(String[] args) {
		//01
		System.out.println("Ola, mundo!");
		
		//02
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int n = scan.nextInt();
		System.out.println("O numero informado foi:" + n);
		
		//03
		int n1 , n2;
		int resultado;
		System.out.println("Digite um numero:");
		n1 = scan.nextInt();
		System.out.println("Digite outro numero:");
		n2 = scan.nextInt();
		resultado = n1+n2;
		System.out.println("O resultado foi de: " + resultado);
		
		//04
		double nota1, nota2,nota3, nota4, resultNota;
		System.out.println("Digite a nota 1: ");
		nota1 = scan.nextDouble();
		
		System.out.println("Digite a nota 2: ");
		nota2 = scan.nextDouble();
		
		System.out.println("Digite a nota 3: ");
		nota3 = scan.nextDouble();
		
		System.out.println("Digite a nota 4: ");
		nota4 = scan.nextDouble();
		
		resultNota = (nota1 + nota2 + nota3 + nota4) / 4;
		
		System.out.println("A media da turminha foi de: " + resultNota);
		
		//05
		System.out.println("Entre com a quantidade de metros: ");
		double metros = scan.nextDouble();
		double cm = metros * 100;
		System.out.println("O valor convertido foi de: " + cm);
		
		//06
		
		double raio, area;
		
		 raio = scan.nextDouble();
		 System.out.println("Vamos calcular a area de um circulo! Para comecarmos, "
		 		+ "digite o raio do circulo: ");
		 area = Math.PI * Math.pow(raio, 2);
		System.out.println("A área do circulo é: " + area);
		
		//07
		
		double ladoQ,areaQ, dobroQ;
		System.out.println("Entre com o valor do lado do quadrado:  ");
		ladoQ = scan.nextDouble();
		areaQ = Math.pow(ladoQ, 2);
		dobroQ = areaQ * 2;
		System.out.println("A area é: " + areaQ);
		System.out.println("A area do quadrado em dobro é: " + dobroQ);
		
		//08
		double valorHora, horasTrabalhadas,salario;
		System.out.println("Quanto você ganha por hora? Em seguida"
				+ "digite tambem quantas horas trabalhou neste mês:  ");
		 valorHora = scan.nextDouble();
		horasTrabalhadas = scan.nextDouble();
		salario =  valorHora * horasTrabalhadas;
		System.out.println("Ao final do mês voce vai receber: " + salario);
		//System.out.println();
		//09
		System.out.println("E vamos de física dessa vez!!!");
		double gFarenheit, gCelsius;
		System.out.println("Digite um valor para graus Farenheit: ");
		gFarenheit = scan.nextDouble();
		gCelsius =(5 * (gFarenheit - 32) / 9);
		System.out.println("A temperatura em graus Celsius equivamente a "
				+ gFarenheit +" é de:" + gCelsius);
		
		//10
		System.out.println("Digite um valor para graus Celsius: ");
		gCelsius = scan.nextDouble();
		gFarenheit = gCelsius * 1.8 + 32;
		System.out.println("A temperatura em graus Celsius equivamente a "
				+ gCelsius +" graus Farenheit é de: " + gFarenheit);
		
		//11
		System.out.println("Voltamos para o mundo da Matemática ;(");
		int num1, num2;
		double num3, calc1, calc2, calc3;
		System.out.println("Digite um numero INTEIRO: ");
		num1 = scan.nextInt();
		System.out.println("Digite um segundo numero INTEIRO: ");
		num2 = scan.nextInt();
		System.out.println("Digite um numero REAL: ");
		num3 = scan.nextInt();
		calc1 = (num1 *2) * (num2 / 2);
		calc2 = (num1*3) + num3;
		calc3 = Math.pow(num3, 3);
		System.out.println("O produto dobro do primeiro com metade do segundo "
				+ "é: " + calc1);
		System.out.println("A soma do triplo do primeiro com o terceiro é: "
				+ calc2);
		System.out.println("O terceiro valor elevado ao cubo é: " + calc3);
		
	}
	

}
