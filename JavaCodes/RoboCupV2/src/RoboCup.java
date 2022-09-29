import java.util.Scanner;

public class RoboCup {

	public static final int FRENTE = 1;
	public static final int TRAS = 2;
	public static final int ESQUERDA = 3;
	public static final int DIREITA = 4;

		public static void main(String[] args) {
			Scanner i = new Scanner(System.in);
			int Ix, Iy, Cx, Cy, Cmd, Direct,Distance,Watts;

			Ix = 2;
			Iy = 4;

			Cx = 21;
			Cy = 11;
			
			Cmd = 0;
			Direct = 0;
			Distance = 0;
			Watts = 0;
			
			System.out.println("--------------------------");
			System.out.println("Digite (1) para Frente");
			System.out.println("Digite (2) para Trás");
			System.out.println("Digite (3) para Esquerda");
			System.out.println("Digite (4) para Direita");
			System.out.println("--------------------------");
			System.out.println("Digite o "+ (Cmd + 1) + " Comando:");
			System.out.println("Informe a direção: ");
			Direct = i.nextInt();
			System.out.println("Informe a distancia: ");
			Distance = i.nextInt();
		
				if (Direct == FRENTE && Distance == 50) {
				
				System.out.println("Comando bem sucedido!\n");
				Cmd++;
				Ix = Ix + (Distance/10);
				Watts = Watts + (Distance/10);
				
				System.out.println("--------------------------");
				System.out.println("Digite (1) para Frente");
				System.out.println("Digite (2) para Trás");
				System.out.println("Digite (3) para Esquerda");
				System.out.println("Digite (4) para Direita");
				System.out.println("--------------------------");
				System.out.println("Digite o "+ (Cmd + 1) + " Comando:");
				System.out.println("Informe a direção: ");
				Direct = i.nextInt();
				System.out.println("Informe a distancia: ");
				Distance = i.nextInt();
					
					if (Direct == ESQUERDA && Distance == 80) {
					System.out.println("Comando bem sucedido!\n");
					Cmd++;
					Iy = Iy + (Distance/10);
					Watts = Watts + (Distance/10);
					
					System.out.println("--------------------------");
					System.out.println("Digite (1) para Frente");
					System.out.println("Digite (2) para Trás");
					System.out.println("Digite (3) para Esquerda");
					System.out.println("Digite (4) para Direita");
					System.out.println("--------------------------");
					System.out.println("Digite o "+ (Cmd+ 1) + " Comando:");
					System.out.println("Informe a direção: ");
					Direct = i.nextInt();
					System.out.println("Informe a distancia: ");
					Distance = i.nextInt();
						
						if (Direct == FRENTE && Distance == 80) {
						System.out.println("Comando bem sucedido!\n");
						Cmd++;
						Ix = Ix + (Distance/10);
						Watts = Watts + (Distance/10);
						
						System.out.println("--------------------------");
						System.out.println("Digite (1) para Frente");
						System.out.println("Digite (2) para Trás");
						System.out.println("Digite (3) para Esquerda");
						System.out.println("Digite (4) para Direita");
						System.out.println("--------------------------");
						System.out.println("Digite o "+ (Cmd + 1) + " Comando:");
						System.out.println("Informe a direção: ");
						Direct = i.nextInt();
						System.out.println("Informe a distancia: ");
						Distance = i.nextInt();

							if (Direct == DIREITA && Distance == 70) {
							System.out.println("Comando bem sucedido!\n");
							Cmd++;
							Iy = Iy - (Distance/10);
							Watts = Watts + (Distance/10);
							
							System.out.println("--------------------------");
							System.out.println("Digite (1) para Frente");
							System.out.println("Digite (2) para Trás");
							System.out.println("Digite (3) para Esquerda");
							System.out.println("Digite (4) para Direita");
							System.out.println("--------------------------");
							System.out.println("Digite o "+ (Cmd+ 1) + " Comando:");
							System.out.println("Informe a direção: ");
							Direct = i.nextInt();
							System.out.println("Informe a distancia: ");
							Distance = i.nextInt();
							
								if (Direct == FRENTE && Distance == 60) {
								System.out.println("Comando bem sucedido!\n");
								Cmd++;
								Ix = Ix + (Distance/10);
								Watts = Watts + (Distance/10);
								
								System.out.println("--------------------------");
								System.out.println("Digite (1) para Frente");
								System.out.println("Digite (2) para Trás");
								System.out.println("Digite (3) para Esquerda");
								System.out.println("Digite (4) para Direita");
								System.out.println("--------------------------");
								System.out.println("Digite o "+ (Cmd+ 1) + " Comando:");
								System.out.println("Informe a direção: ");
								Direct = i.nextInt();
								System.out.println("Informe a distancia: ");
								Distance = i.nextInt();
									
									if (Direct == ESQUERDA && Distance == 60) {
									System.out.println("Comando bem sucedido!\n");
									Cmd++;
									Iy = Iy + (Distance/10);
									Watts = Watts + (Distance/10);
										
										if ((Ix == Cx) && (Iy == Cy) && (Cmd == 6)) {
										System.out.println("Potência gasta pelo robô na tragetoria foi de: " + Watts + "W");
										System.out.println("Objetivo alcançado,Parabéns!");
										} 
										else {
											System.out.println("Obejetivo não alcançado, comando incorreto!\n(Missão abortada)");					
										}	
									}
									else {
										System.out.println("Obejetivo não alcançado, comando incorreto!\n(Missão abortada)");									
									}
								} 
								else {
									System.out.println("Obejetivo não alcançado, comando incorreto!\n(Missão abortada)");							
								}
							}
							else {
								System.out.println("Obejetivo não alcançado, comando incorreto!\n(Missão abortada)");	
							}
						}
						else {
							System.out.println("Obejetivo não alcançado, comando incorreto!\n(Missão abortada)");
						}
					}
					else {					
						System.out.println("Obejetivo não alcançado, comando incorreto!\n(Missão abortada)");
					}
				}
				else {
					System.out.println("Obejetivo não alcançado, comando incorreto!\n(Missão abortada)");				
				}
			i.close();
	}

}
