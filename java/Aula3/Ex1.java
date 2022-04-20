import java.util.Scanner;

public class Ex1{

	public static void main(String[] args) {
		int A,B,C;
		boolean C1,C2,C3;
		Scanner i;
		i = new Scanner(System.in);
		System.out.println("Digite o valor de A");
		A = i.nextInt();
		System.out.println("Digite o valor de B");
		B = i.nextInt();
		System.out.println("Digite o valor de C");
		C = i.nextInt();
		i.close();
		C1 = Math.abs(B-C) < A && A < B+C;
		C2 = Math.abs(A-C) < B && B < A+C;
		C3 = Math.abs(A-B) < C && C < A+B;
		if(C1 && C2 && C3) {
			System.out.println("É triangulo");
			if ((A==B) && (B==C))
				System.out.println("equilátero");
			else
				if ((A !=B) && (A!=C)&&(B != C))
					System.out.println("escaleno");
				else
					System.out.println("isoceles");
		}
		else {
			System.out.println("Não é triangulo");
		}
	}

}
