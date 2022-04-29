import java.util.Scanner;

public class RoboFelipe {
	public static final int FRENTE = 1;
	public static final int TRAS = 2;
	public static final int ESQUERDA = 3;
	public static final int DIREITA = 4;

	public static void main(String[] args) {
		Scanner i = new Scanner(System.in);
		int Xr, Yr, Xt,Yt , comando, direcao,distancia,bateria;
		//inicio
		Xr = 1;
		Yr = 7;
		//chegada
		Xt = 19;
		Yt = 3;
		
		comando = 0;
		direcao = 0;
		distancia = 0;
		bateria = 0;

		System.out.println("Digite o "+ (comando + 1) + " Comando:");
		System.out.println("Informe a direção: ");
		direcao = i.nextInt();
		System.out.println("Informe a distancia: ");
		distancia = i.nextInt();

			if (direcao == FRENTE && distancia == 50) {
			System.out.println("Comando bem sucedido!\n");
			comando++;
			Xr = Xr + (distancia/10);
			bateria = bateria + (distancia/10);
	
			System.out.println("Digite o "+ (comando + 1) + " Comando:");
			System.out.println("Informe a direção: ");
			direcao = i.nextInt();
			System.out.println("Informe a distancia: ");
			distancia = i.nextInt();
				
				if (direcao == ESQUERDA && distancia == 70) {
				System.out.println("Comando bem sucedido!\n");
				comando++;
				Yr = Yr + (distancia/10);
				bateria = bateria + (distancia/10);
	
				System.out.println("Digite o "+ (comando + 1) + " Comando:");
				System.out.println("Informe a direção: ");
				direcao = i.nextInt();
				System.out.println("Informe a distancia: ");
				distancia = i.nextInt();
					
					if (direcao == FRENTE && distancia == 70) {
					System.out.println("Comando bem sucedido!\n");
					comando++;
					Xr = Xr + (distancia/10);
					bateria = bateria + (distancia/10);
	
					System.out.println("Digite o "+ (comando + 1) + " Comando:");
					System.out.println("Informe a direção: ");
					direcao = i.nextInt();
					System.out.println("Informe a distancia: ");
					distancia = i.nextInt();

						if (direcao == DIREITA && distancia == 110) {
						System.out.println("Comando bem sucedido!\n");
						comando++;
						Yr = Yr - (distancia/10);
						bateria = bateria + (distancia/10);
	
						System.out.println("Digite o "+ (comando + 1) + " Comando:");
						System.out.println("Informe a direção: ");
						direcao = i.nextInt();
						System.out.println("Informe a distancia: ");
						distancia = i.nextInt();
						
							if (direcao == FRENTE && distancia == 60) {
							System.out.println("Comando bem sucedido!\n");
							comando++;
							Xr = Xr + (distancia/10);
							bateria = bateria + (distancia/10);
						
								if (Xr == Xt && Yr == Yt && comando == 5) {
								System.out.println("Potência gasta pelo robô na tragetoria foi de: " + bateria);
								System.out.println("Objetivo alcançado! Parabéns!!");
								} 
								else 
									System.out.println("Obejetivo Não alcançado");									
							} 
							else 
								System.out.println("Comando mal sucedido! Missão abortada");
						}
						else 
							System.out.println("Comando mal sucedido! Missão abortada");
					}
					else 
						System.out.println("Comando mal sucedido! Missão abortada");
				}
				else 
					System.out.println("Comando mal sucedido! Missão abortada");
			}
			i.close();
	}	
}
