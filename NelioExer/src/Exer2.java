import java.util.Scanner;

public class Exer2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double enter1 , enter2 , soma;
		enter1 = sc.nextDouble();
		enter2 = sc.nextDouble();
		soma = enter1 + enter2;
		System.out.printf("RESULT = %.0f%n " , soma);
		sc.close();

	}

}
