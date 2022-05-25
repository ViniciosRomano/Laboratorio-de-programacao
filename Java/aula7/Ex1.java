import java.util.Scanner;

public class Ex1 {
	public static final int OP = 3;
	public static final int GP1 = 29;
	public static final int GP3 = 38;
	public static final float  SAL_MIN = (float)1212;
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int i, Gp1,Gp2,Gp3, id,idJ,idV, idade,P, PTotal, idadeJ,idadeV;
		double salarioGp1,salarioGp2,salarioGp3, folha;
		Gp1=0;
		Gp2=0;
		Gp3=0;
		PTotal = 0;
		idadeV = 0;
		idadeJ = 0;
		idJ = 0;
		idV = 0;salarioGp1 = 0;salarioGp2 = 0;salarioGp3 = 0;
		
		for(i = 1; i <= OP; i++){
			do 
			{	
			System.out.println("Comando N° " + i);	
			System.out.println("Digite seu ID: ");
			id = input.nextInt();
				if(id<11 ||id >99){
					System.out.println("ID Invalido");
				}
			}while(id<11 ||id >99); 
			
			System.out.println("Digite sua idade: ");
			idade = input.nextInt();
			
			if(i==1){
			idadeV = idade;
			idadeJ = idade;
			idJ = id;
			idV = id;
			}				
			if(idade < idadeJ){
				idadeJ = idade;
				idJ = id;
			}else {
				if(idade > idadeV){
					idadeV = idade;					
					idV = id;
				}
			}
			
			System.out.println("Digite o numero de peças produzidas: ");
			P = input.nextInt();
			PTotal = PTotal + P;
			if(P <= GP1){
				Gp1++;
				salarioGp1 = 2* SAL_MIN;
				System.out.println("Seu salario é "+ salarioGp1);
			}
				else {
					if(P >=GP3){
						Gp3++;
						salarioGp3 = 2*SAL_MIN + (0.05*SAL_MIN*(P-29));
						System.out.println("Seu salario é "+ salarioGp3);
					}
					else {
						Gp2++;
						salarioGp2 = 2*SAL_MIN + (0.03*SAL_MIN*(P-29));
						System.out.println("Seu salario é "+ salarioGp2);
					}
				}
		}
		folha = Gp1*salarioGp1 + Gp2*salarioGp2 + Gp3*salarioGp3;
		System.out.println("Grupo 1: " + Gp1 );
		System.out.println("Grupo 2: " + Gp2 );
		System.out.println("Grupo 3: " + Gp3 );	
		System.out.println("O valor da folha de pagamento é: " + folha);
		System.out.println("Produção total: " + PTotal);
		System.out.println("Operario "+ idJ +" é o mais novo com "  + idadeJ +" anos");
		System.out.println("Operario "+ idV +" é o mais velho com " + idadeV +" anos");
		input.close();
		
	}

}
