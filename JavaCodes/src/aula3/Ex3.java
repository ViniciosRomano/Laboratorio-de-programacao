import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		int N, L, B, H, R;
		float A;
		Scanner i;
		i = new Scanner(System.in);
		System.out.println("Digite (1) para quadrado");
		System.out.println("Digite (2) para tri�ngulo");
		System.out.println("Digite (3) para c�rculo");
		N = i.nextInt();
		switch (N) {
		case 1:
			System.out.println("Digite o lado de seu quadrado");
			L = i.nextInt();
			A = L*L;
			System.out.println("Sua area do quadrado �: " + A);
			break;
		case 2:
			System.out.println("Digite a base de seu triangulo");
			B = i.nextInt();
			System.out.println("Digite a altura de seu triangulo");
			H = i.nextInt();
			A = (B*H)/2;
			System.out.println("Sua area do triangulo �: " + A);
			break;
		case 3:
			System.out.println("Digite o raio de seu cirulo");
			R = i.nextInt();
			A = (float)(Math.pow(R, 2)*Math.PI);
			System.out.println("Sua area do quadrado �: " + A);
			break;
		}
		i.close();
	}

}
