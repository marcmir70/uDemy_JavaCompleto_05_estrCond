// aula 35
import java.util.Locale;
import java.util.Scanner;

public class aula35_exercParaInics {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
/*
	// exercício 1
		int A;
		System.out.println("Digite um número inteiro...");
		A = sc.nextInt();
		if (A > 0) System.out.println("POSITIVO");
		else if (A<0) System.out.println("NEGATIVO");
		else System.out.println("NAO NEGATIVO");
		
	// exercício 2
		int B;
		System.out.println("Digite um número inteiro...");
		B = sc.nextInt();
//			if (B % 2 == 0) System.out.println("PAR");
//			else System.out.println("IMPAR");	
		System.out.println(( B % 2 == 0 ) ? "PAR" : "IMPAR"); // aula 38
				
	// exercício 3
		int C, D;
		System.out.println("Digite dois números inteiros...");
		C = sc.nextInt();
		D = sc.nextInt();
		if ((C % D == 0) || (D % C ==0)) System.out.println("Sao Multiplos");
		else System.out.println("Nao sao Multiplos");

	// exercício 4
		int horaInicio, horaFim, duracao;
		System.out.println("Digite hora de inicio e hora de fim...");
		horaInicio = sc.nextInt();
		horaFim = sc.nextInt();
		if (horaFim > horaInicio) duracao = horaFim - horaInicio; 
		else duracao = (24-horaInicio) + horaFim; 
		System.out.printf("O JOGO DUROU %d HORA(S)", duracao);

	// exercício 5
		int code, quantity;
		double unitCost = 0;
		double totalCost = 0;
		System.out.println("Digite codigo e quantidade...");
		code = sc.nextInt();
		quantity = sc.nextInt();
		
//			if (code==1) unitCost = 4.0;      // cachorro-quente
//			else if (code==2) unitCost = 4.5; // x-salada
//			else if (code==3) unitCost = 5.0; // x-bacon
//			else if (code==4) unitCost = 2.0; // torrada simples
//			else unitCost = 1.5;              // refrigerante
	
		switch (code) {					// aula 37
		case 1 : unitCost = 4.0; break;
		case 2 : unitCost = 4.5; break;
		case 3 : unitCost = 5.0; break;
		case 4 : unitCost = 2.0; break;
		default: unitCost = 1.5; break;
		}
		
		totalCost = unitCost * quantity;
		System.out.printf("Total: R$ %.2f", totalCost);

	// exercício 6
		double valor;
		System.out.println("Digite valor...");
		valor = sc.nextDouble();
		if ((valor>=0) && (valor<=25)) System.out.println("Intervalo [0, 25]");
		else if ((valor>25) && (valor<=50)) System.out.println("Intervalo (25,50]");
		else if ((valor>50) && (valor<=75)) System.out.println("Intervalo (50,75]");
		else if ((valor>75) && (valor<=100)) System.out.println("Intervalo (75,100]");
		else System.out.println("Fora de intervalo");

	//exercício 7
		double x, y;
		System.out.println("Digite coordenadas X e Y...");
		x = sc.nextDouble();
		y = sc.nextDouble();
		if ((x>0)&&(y>0)) System.out.println("Q1");
		else if ((x<0)&&(y>0)) System.out.println("Q2");
		else if ((x<0)&&(y<0)) System.out.println("Q3");
		else if ((x>0)&&(y<0)) System.out.println("Q4");
		else System.out.println("origem");
*/
	//exercício 8
		double limiteFaixa1 = 2000.00, limiteFaixa2 = 3000.00, limiteFaixa3 = 4500.00;
		double percFaixa2 = 0.08, percFaixa3 = 0.18, percFaixa4 = 0.28;
		double salario, baseCalculo = 0, imposto = 0, impostoFaixa2 = 0, impostoFaixa3 = 0, impostoFaixa4 = 0;
		System.out.println("Informe seu salário para o cálculo do imposto...");
		salario = sc.nextDouble();
		
		baseCalculo = salario;
		if ( salario > limiteFaixa3 ) impostoFaixa4 = percFaixa4 * ( baseCalculo - limiteFaixa3 );
		
		if ( salario > limiteFaixa2 ) {
			if (salario>limiteFaixa3) baseCalculo = limiteFaixa3 ;
			else baseCalculo = salario ;
			impostoFaixa3 = percFaixa3 * (baseCalculo - limiteFaixa2);
		}
		if ( salario > limiteFaixa1 ) {
			if (salario>limiteFaixa2) baseCalculo = limiteFaixa2 ;
			else baseCalculo = salario ;
			impostoFaixa2 = percFaixa2 * (baseCalculo - limiteFaixa1);
		}
		imposto = impostoFaixa2 + impostoFaixa3 + impostoFaixa4;
		if ( imposto != 0 ) System.out.printf("R$ %.2f", imposto);
		else System.out.println("Isento");
		
		sc.close();
	}
}