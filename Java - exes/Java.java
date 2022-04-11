import java.util.Scanner;

public class Java {

	public static void main(String[] args) {
		double V, P;
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Informe o valor de venda");
		V = entrada.nextDouble();
		System.out.println("Informe o valor do preço");
		P = entrada.nextDouble();
		entrada.close();
		
		if (V<500 || P<30) {
			System.out.println("O preço é " + P*1.1);
		}
		else if(V>=500 & V<1200 || P>=30 & P<80){
			System.out.println("O preço é " + P*1.15);		
		}
		else {
			//(V>=1200 || P>=80) else n precisa
			System.out.println("O preço é " + P*0.8);
		}
	}
}
