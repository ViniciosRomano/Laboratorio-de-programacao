import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		int N;
		Scanner I;
		I = new Scanner(System.in);
		
		System.out.println("Digite (2) para exibir o n�mero de Euler");
		System.out.println("Digite (3) para exibir o n�mero pi");
		N = I.nextInt();
		I.close();
		switch(N) {
		case 2:
			System.out.println("O n�mero de Euler � " + Math.E );
			break;
		case 3:
			System.out.println("O n�mero pi � " + Math.PI);
			break;
		}
	}

}
