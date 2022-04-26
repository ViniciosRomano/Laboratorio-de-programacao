import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner i;
		i = new Scanner(System.in);
		int mes, ano;
		System.out.println("Digite o ano desejado");
		ano = i.nextInt();
		System.out.println("Digite o mês desejado");
		mes = i.nextInt();
		
		switch (mes) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			System.out.println(mes + "/"+ ano+ " tem 31 dias");	
			break;
		case 2:
			boolean C1,C2;
			C1 = (ano % 400 == 0);
			C2 = ((ano % 4 == 0) && (ano % 100 != 0 ));
			if (C1 || C2)
				System.out.println(mes + "/" + ano + " tem 29 dias");
			else
				System.out.println(mes + "/" + ano + " tem 28 dias");
			break;
		case 4: case 6: case 9: case 11:
			System.out.println(mes + "/" + ano + " tem 30 dias");
			break;
		default:
			System.out.println("Mês invalido");
			break;
		}
		i.close();
	}

}
