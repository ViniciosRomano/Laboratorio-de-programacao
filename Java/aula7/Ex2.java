import java.util.Scanner;

public class Ex2 {
	public static final int OP = 2;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i,EstagioMin,EstadioMedio,EstagioG, Semestres;
		String Nome = "";
		Semestres = 0;
		for(i = 1; i<=OP;i++){
			System.out.println("Digite seu nome");
			Nome = input.next();
			System.out.println("Quais semestres foram completados: ");
			Semestres = input.nextInt();
			System.out.println(Nome + " está no semestre " + Semestres);
		}
	}

}
