package Revisao;

import java.util.Scanner;
public class ex1 {

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		Double N1, N2, MD;
		System.out.println("Digite sua nota:");
		N1 = i.nextDouble();
		System.out.println("Digite a outra nota: ");
		N2 = i.nextDouble();
		i.close();
		MD = (N1*0.4) + (N2*0.6);
		System.out.println(MD);
		if (MD<0) {
			System.out.println("Nota invalida valor inferior a 0");	
		}
		else {
			if (MD <4){
				System.out.println("Reprovado");
			}
			else {
				if(MD<6 && MD>4){
					System.out.println("Recuperação");
				}
					else {
						if(MD>6 && MD<=10){
							System.out.println("Aprovado");
						}
						else {
							if(MD>10){
								System.out.println("Nota invalida valor superior a 10");
							}
						}
					}
				}
			}		

	}

}
