import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		float M1,M2,MA;
		Scanner entrada;
		entrada = new Scanner(System.in);
		System.out.println("Digite sua media do primeiro semestre");
		M1 = entrada.nextFloat();
		System.out.println("Digite sua media do segundo semestre");
		M2= entrada.nextFloat();
		entrada.close();
		MA = (float) (0.4*M1+0.6*M2);
		System.out.println("A media anual � " + MA);
	
		if (MA<=3.9){
		System.out.println("Voc� est� reprovado");
		}
		
		// ou = || , e = &
		// Macara de formata�ao (prinf "%s%2.2%F")
		
		
		else if(MA>=4 & MA<=5.9){
			System.out.println("Voc� est� de recupera��o");
		}
		else {
			System.out.println("Voc� est� Aprovado");
		}
	}

}
