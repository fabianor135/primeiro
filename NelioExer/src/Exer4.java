import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class Exer4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double A, B, C, D , result;// ler 4 valores inteiros
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		D = sc.nextDouble();
		
		//Calculei a diferença pela fórmula
		result = (A*B-C*D);
		
		// Declarei a saida
		System.out.printf("DIFERENCA = %.0f%n " ,result);
		sc.close();
		
		
		
		

	}

}
