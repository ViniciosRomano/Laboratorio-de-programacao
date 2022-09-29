import java.util.Scanner;

public class Java2 {

	public static void main(String[] args) {
		Scanner entrada;
		entrada = new Scanner(System.in);
		int A,B,C;
		System.out.println("Informe um valor");
		A = entrada.nextInt();
		System.out.println("Informe outro valor");
		B = entrada.nextInt();
		System.out.println("Informe outro valor");
		C = entrada.nextInt();
		
		if (A<B & B<C) {
			System.out.println(A + "<" + B + "<" + C);
		}
		else if (A<C & B<C) {
			System.out.println(A + "<" + B + "<" + C);
		}
	}

}
