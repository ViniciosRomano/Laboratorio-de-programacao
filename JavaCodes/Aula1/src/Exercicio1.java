import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		double A,P;
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Digite o valor do lado");
		A = entrada.nextDouble();
		entrada.close();
		if(A>0){
			P = 6*A;
			A = ((3*Math.sqrt(3))/2)*Math.pow(A, 2);
			System.out.println("O seu valor de Area é " + (int)(A) + " O valor do perimetro é " + (int)(P));			
		}
		else {
			System.out.println("Digite um valor maior que 0");
		}
	}
}
