import java.util.Scanner;

public class RoboCup {

    public static final int FRENTE = 1;
    public static final int TRAS = 2;
    public static final int ESQUERDA = 3;
    public static final int DIREITA = 4;

    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int Cmd, Direct,Distance,Watts,HopeDistance,HopeDirect;

        Cmd = 0;
        Direct = 0;
        Distance = 0;
        Watts = 0;

        HopeDistance = 0;
        HopeDirect = 0;


        do {
            switch (Cmd) {
                case 0:
                    HopeDirect = FRENTE;
                    HopeDistance = 50;
                    break;
                case 1:
                    HopeDirect = ESQUERDA;
                    HopeDistance = 80;
                    break;
                case 2:
                    HopeDirect = FRENTE;
                    HopeDistance = 80;
                    break;
                case 3:
                    HopeDirect = DIREITA;
                    HopeDistance = 70;
                    break;
                case 4:
                    HopeDirect = FRENTE;
                    HopeDistance = 60;
                    break;
                case 5:
                    HopeDirect = ESQUERDA;
                    HopeDistance = 60;
                    break;
            }

            System.out.println("--------------------------\nDigite (1) para Frente\nDigite (2) para Trás\nDigite (3) para Esquerda\nDigite (4) para Direita\n--------------------------\nDigite o " +(Cmd + 1)+ " Comando:\nInforme a direção: " );
            Direct = i.nextInt();
            System.out.println("Informe a distancia: ");
            Distance = i.nextInt();

            if(Direct == HopeDirect && Distance == HopeDistance){
                System.out.println("Comando bem sucedido!" );
                Watts = Watts + (Distance/10);
                Cmd++;
                if (Cmd == 6) {
                    System.out.println("Comandos finalizados!\nVocê chegou no objetivo com sucesso!!\nPotência gasta pelo robô na tragetoria foi de: " + Watts + "W");
                }
                else {
                    System.out.println("Continue...");
                }
            }
            else {
                System.out.println("Comando incorreto!\nTente novamente...\n");
                Watts = Watts + (Distance/10);
            }
        }while(Direct != HopeDirect && Distance != HopeDistance || Cmd != 6);

        i.close();
    }

}
