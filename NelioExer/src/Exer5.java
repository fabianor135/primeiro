//número de um funcionário, seu número de horas trabalhadas,
//o valor que recebe por hora e calcula o salario dst funcionario

import java.util.Locale;
import java.util.Scanner;

public class Exer5 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numero , horas;
		double valorHora, salario;
		
		numero = sc.nextInt();
		horas = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = valorHora * horas;
		
		System.out.println("NUMERO =" + numero);
		System.out.printf("SALARIO = U$ %.2f%n" , salario);
		
		sc.close();
		

	}

}
