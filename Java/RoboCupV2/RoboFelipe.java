import java.util.Scanner;

public class RoboFelipe {
	public static final int FRENTE = 1;
	public static final int TRAS = 2;
	public static final int ESQUERDA = 3;
	public static final int DIREITA = 4;

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int Ix, Iy, Cx, Cy, Cmd, Direct,Distance,Watts;
		boolean C1,C2,C3,C4,C5,C6; 
		
		Ix = 2;
		Iy = 4;

		Cx = 21;
		Cy = 11;
		
		Cmd = 0;
		Direct = 0;
		Distance = 0;
		Watts = 0;
				
		C1 = false;
		C2 = false;
		C3 = false;
		C4 = false;
		C5 = false;
		C6 = false;
		
		
		while(C1 != true) {
		System.out.println("--------------------------\nDigite (1) para Frente\nDigite (2) para Trás\nDigite (3) para Esquerda\nDigite (4) para Direita\n--------------------------\nDigite o "+ (Cmd + 1) + " Comando:\nInforme a direção: " );
		Direct = i.nextInt();
		System.out.println("Informe a distancia: ");
		Distance = i.nextInt();
		C1 = Direct == FRENTE && Distance == 50;
			if (Direct == FRENTE && Distance == 50) {
				System.out.println("Comando bem sucedido!! \n");
				Cmd++;
				Ix = Ix + (Distance/10);
				Watts = Watts + (Distance/10);
			}
			else {
				System.out.println("Comando incorreto!!, Tente novamente... \n");
			}
		}
			
			while (C2 != true){	
			System.out.println("--------------------------\nDigite (1) para Frente\nDigite (2) para Trás\nDigite (3) para Esquerda\nDigite (4) para Direita\n--------------------------\nDigite o "+ (Cmd + 1) + " Comando:\nInforme a direção: " );
			Direct = i.nextInt();
			System.out.println("Informe a distancia: ");
			Distance = i.nextInt();
			C2 = Direct == ESQUERDA && Distance == 80;
				if (Direct == ESQUERDA && Distance == 80) {
					System.out.println("Comando bem sucedido!\n");
					Cmd++;
					Iy = Iy + (Distance/10);
					Watts = Watts + (Distance/10);
				}
				else {
					System.out.println("Comando incorreto!!, Tente novamente... \n");
				}
			}
				while(C3 != true){					
				System.out.println("--------------------------\nDigite (1) para Frente\nDigite (2) para Trás\nDigite (3) para Esquerda\nDigite (4) para Direita\n--------------------------\nDigite o "+ (Cmd + 1) + " Comando:\nInforme a direção: " );
				Direct = i.nextInt();
				System.out.println("Informe a distancia: ");
				Distance = i.nextInt();
				C3 = Direct == FRENTE && Distance == 80;
					if (Direct == FRENTE && Distance == 80) {
						System.out.println("Comando bem sucedido!\n");
						Cmd++;
						Ix = Ix + (Distance/10);
						Watts = Watts + (Distance/10);
					}
					else {
						System.out.println("Comando incorreto!!, Tente novamente... \n");
					}
				}
					
					while(C4 != true){						
					System.out.println("--------------------------\nDigite (1) para Frente\nDigite (2) para Trás\nDigite (3) para Esquerda\nDigite (4) para Direita\n--------------------------\nDigite o "+ (Cmd + 1) + " Comando:\nInforme a direção: " );
					Direct = i.nextInt();
					System.out.println("Informe a distancia: ");
					Distance = i.nextInt();
					C4 = Direct == DIREITA && Distance == 70;
						if (Direct == DIREITA && Distance == 70) {
							System.out.println("Comando bem sucedido!\n");
							Cmd++;
							Iy = Iy - (Distance/10);
							Watts = Watts + (Distance/10);
						}
						else {
							System.out.println("Comando incorreto!!, Tente novamente... \n");
						}
					} 
					while(C5 != true){
						System.out.println("--------------------------\nDigite (1) para Frente\nDigite (2) para Trás\nDigite (3) para Esquerda\nDigite (4) para Direita\n--------------------------\nDigite o "+ (Cmd + 1) + " Comando:\nInforme a direção: " );
						Direct = i.nextInt();
						System.out.println("Informe a distancia: ");
						Distance = i.nextInt();				
							C5 = Direct == FRENTE && Distance == 60;
							if (Direct == FRENTE && Distance == 60) {
								System.out.println("Comando bem sucedido!\n");
								Cmd++;
								Ix = Ix + (Distance/10);
								Watts = Watts + (Distance/10);
							}
							else {
								System.out.println("Comando incorreto!!, Tente novamente... \n");
							}
					}
						
							while(C6 != true){								
							System.out.println("--------------------------\nDigite (1) para Frente\nDigite (2) para Trás\nDigite (3) para Esquerda\nDigite (4) para Direita\n--------------------------\nDigite o "+ (Cmd + 1) + " Comando:\nInforme a direção: " );
							Direct = i.nextInt();
							System.out.println("Informe a distancia: ");
							Distance = i.nextInt();
							C6 = Direct == ESQUERDA && Distance == 60;
								if (Direct == ESQUERDA && Distance == 60) {
									System.out.println("Comando bem sucedido!\n");
									Cmd++;
									Iy = Iy + (Distance/10);
									Watts = Watts + (Distance/10);
								}	
								else {
									System.out.println("Comando incorreto!!, Tente novamente... \n");
								}
								
							}
									if ((Ix == Cx) && (Iy == Cy) && (Cmd == 6)) {
									System.out.println("Potência gasta pelo robô na tragetoria foi de: " + Watts + "w\nObjetivo alcançado,Parabéns!");
									} 					
		i.close();
	}	
}
