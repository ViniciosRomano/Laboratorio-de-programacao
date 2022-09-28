import java.util.Scanner;

public class Ex4 {

		public static void main(String[] args) {
			int L, B, H, R;
			char N;
			float A;
			Scanner i;
			
			i = new Scanner(System.in);
			System.out.println("Digite (Q) para quadrado");
			System.out.println("Digite (T) para triângulo");
			System.out.println("Digite (C) para círculo");
			N = i.nextLine().charAt(0);
// 	nextLine() = pega a linha, charAt(0) pode subistituir o 0 por outra entrada = pega o primeiro caracter da linha neste caso, .toUpperCase() deixa tudo maiusculo 
			
			switch (N) {
			case 'Q':
				System.out.println("Digite o lado de seu quadrado");
				L = i.nextInt();
				A = L*L;
				System.out.println("Sua area do quadrado é: " + A);
				break;
			case 'T':
				System.out.println("Digite a base de seu triangulo");
				B = i.nextInt();
				System.out.println("Digite a altura de seu triangulo");
				H = i.nextInt();
				A = (B*H)/2;
				System.out.println("Sua area do triangulo é: " + A);
				break;
			case 'C':
				System.out.println("Digite o raio de seu cirulo");
				R = i.nextInt();
				A = (float)(Math.pow(R, 2)*Math.PI);
				System.out.println("Sua area do quadrado é: " + A);
				break;
			}
			i.close();
		}

	}
