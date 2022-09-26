import java.util.Scanner;

public class NewVersionSprint3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int equipes,i,j,total;
        System.out.print("Digite o numero de equipes: ");
        equipes = input.nextInt();
        int [][] info = new int [equipes][3];
        int [] resultados = new int[3];

        for (i=0;i<equipes;i++){
            do {
                System.out.print("Numero da "+(i+1) +" equipe: ");
                info[i][0] = input.nextInt();
            }while (info[i][0]<11 || info[i][0]>99);

            System.out.print("\nQuantas vitorias a " + (i + 1) + " equipe possui: ");
            resultados[0] = input.nextInt() * 5;

            System.out.print("\nQuantos empates a " + (i + 1) + " equipe possui: ");
            resultados[1] = input.nextInt() * 3;

            System.out.print("\nQuantas derrotas a " + (i + 1) + " equipe possui: ");
            resultados[2] = input.nextInt();

            System.out.print("\nQual a nota do design do robo: ");
            info[i][2]= input.nextInt();

            total = resultados[0] + resultados[1];
            info[i][1] = total;
        }
            for (i = 1; i < info.length; i++) {
                for (j = 0; j < info.length; j++) {
                    if (info[i][1] > info[j][1]) {
                        int pontosTemp = info[i][1];
                        info[i][1] = info[j][1];
                        info[j][1] = pontosTemp;

                        int codTemp = info[i][0];
                        info[i][0] = info[j][0];
                        info[j][0] = codTemp;

                        int designTemp = info[i][2];
                        info[i][2] = info[j][2];
                        info[j][2] = designTemp;
                    }
                }
            }
            //erro
//            for (i = 0; i < info.length; i++) {
//                for (j = 1; j < info.length; j++) {
//                    if (info[i][1] == info[j][1] && info[i][2]!=info[j][2]) {
//                        int codTemp = info[i][0];
//                        info[i][0] = info[j][0];
//                        info[j][0] = codTemp;
//
//                        int designTemp = info[i][2];
//                        info[i][2] = info[j][2];
//                        info[j][2] = designTemp;
//                    }
//                }
//            }


//        for (int i = 1; i < vet.length; i++) {
//            for (int j = 0; j < i; j++) {
//                if (vet[i] > vet[j]) {
//                    int temp = vet[i];
//                    vet[i] = vet[j];
//                    vet[j] = temp;
//                }
//            }
//        }
            //

        System.out.println("Classificacao\tCodigo\t Pontuacao\tNota Design");
        for (i=0; i< equipes;i++) {
            System.out.print((i+1) + " lugar\t\t\t");
            for (j = 0; j < 3; j++) {
                // 1 lugar, 2 lugar - codigo
                if (info[i][j] == info[i][0]) {
                    System.out.print(info[i][j] + " \t\t");
                }
                //pontuaçao
                if (info[i][j] == info[i][1]){
                    System.out.print(info[i][1] + " \t\t\t");
                }
                //nota design
                if (info[i][j] == info[i][2]){
                    System.out.print(info[i][2]+"\n");
                }
            }
        }
       }
    }

