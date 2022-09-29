import java.util.Scanner;

public class NewVersionSprint3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int equipes,i,j,total;
        System.out.print("Digite o numero de equipes: ");
        equipes = input.nextInt();
        int [][] results = new int [equipes][3];
        int [] ponts = new int[3];

        for (i=0;i<equipes;i++){
            do {
                System.out.print("Numero da "+(i+1) +" equipe: ");
                results[i][0] = input.nextInt();
            }while (results[i][0]<11 || results[i][0]>99);

            System.out.print("\nQuantas vitorias a " + (i + 1) + " equipe possui: ");
            ponts[0] = input.nextInt() * 5;

            System.out.print("\nQuantos empates a " + (i + 1) + " equipe possui: ");
            ponts[1] = input.nextInt() * 3;

            System.out.print("\nQuantas derrotas a " + (i + 1) + " equipe possui: ");
            ponts[2] = input.nextInt();

            do {
            System.out.print("\nQual a nota do design do robo: ");
            results[i][2]= input.nextInt();
            }while (results[i][2]<0|| results[i][2]>10);

            total = ponts[0] + ponts[1];
            results[i][1] = total;
            }
            for (i = 1; i < results.length; i++) {
                for (j = 0; j < results.length; j++) {
                    if (results[i][1] > results[j][1] || results[i][1] == results[j][1] && results[i][2]>results[j][2]) {
                        int pontosTemp = results[i][1];
                        results[i][1] = results[j][1];
                        results[j][1] = pontosTemp;

                        int codTemp = results[i][0];
                        results[i][0] = results[j][0];
                        results[j][0] = codTemp;

                        int designTemp = results[i][2];
                        results[i][2] = results[j][2];
                        results[j][2] = designTemp;
                    }
                }
            }
//            for (i = 1; i < results.length; i++) {
//                for (j = 0; j < results.length; j++) {
//                    if (results[i][1] == results[j][1] && results[i][2]>results[j][2]) {
//                        int codTemp = results[i][0];
//                        results[i][0] = results[j][0];
//                        results[j][0] = codTemp;
//
//                        int designTemp = results[i][2];
//                        results[i][2] = results[j][2];
//                        results[j][2] = designTemp;
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
        for (i=0;i< equipes;i++) {
            System.out.print((i+1) + " lugar\t\t\t");
            for (j = 0; j < 3; j++) {
                // 1 lugar, 2 lugar - codigo
                if (results[i][j] == results[i][0]) {
                    System.out.print(results[i][j] + " \t\t");
                }
                //pontuaçao
                if (results[i][j] == results[i][1]){
                    System.out.print(results[i][1] + "\t\t\t\t");
                }
                //nota design
                if (results[i][j] == results[i][2]){
                    System.out.print(results[i][2]+"\n");
                }
            }
        }
       }
    }

