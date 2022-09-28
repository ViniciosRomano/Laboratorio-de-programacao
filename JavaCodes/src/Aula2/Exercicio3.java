import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner i;
		i = new Scanner(System.in);	
		float A, B, C, menor, medio, maior;
		System.out.println("Digite um valor");
		A = i.nextFloat();
		System.out.println("Digite outro valor");
		B = i.nextFloat();
		System.out.println("Digite outro valor");
		C = i.nextFloat();
		i.close();
		menor = Math.min(A, Math.min(B, C));
		maior = Math.max(A, Math.max(B, C));
		medio = (A + B + C - menor - maior);
		System.out.println("Ordem crescente");
		System.out.println("A sequencia é: "+(int) (menor) + "," + (int) (medio) + "," + (int)(maior) );
	}

}
