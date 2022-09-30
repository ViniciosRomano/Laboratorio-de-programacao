import java.util.Scanner;

public class NewVersionSprint3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int equipes,i,j,total,ID;
        System.out.print("Digite o numero de equipes: ");
        equipes = input.nextInt();
        int [][] results = new int [equipes][3];
        int [] ponts = new int[3];
        boolean continuar;
        for (i=0;i<equipes;i++){
            do {
                System.out.print("Numero da "+(i+1) +" equipe: ");
                ID = input.nextInt();
                continuar =false;
                if (ID<11 || ID>99){
                    System.out.println("Falso ID (11-99)");
                }
                for (j=0;j< results.length;j++){
                    if (ID==results[j][0]){
                        continuar = true;
                        System.out.println("Digite outro ID usuario ja existente");
                    }
                }
            }while (ID<11 || ID>99||continuar);
            results[i][0] = ID;
            System.out.print("\nQuantas vitorias a " + (i + 1) + " equipe possui: ");
            ponts[0] = input.nextInt() * 5;

            System.out.print("\nQuantos empates a " + (i + 1) + " equipe possui: ");
            ponts[1] = input.nextInt() * 3;

            System.out.print("\nQuantas derrotas a " + (i + 1) + " equipe possui: ");
            ponts[2] = input.nextInt();

            do {
            System.out.print("\nQual a nota do design do robo: ");
            results[i][2]= input.nextInt();
            if (results[i][2]<0|| results[i][2]>10){
                System.out.println("Digite uma nota entre 0 e 10");
            }
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

        System.out.println("Classificacao\tCodigo\t Pontuacao\tNota Design");
        for (i=0;i< equipes;i++) {
            System.out.print((i+1) + " lugar\t\t\t");
            for (j = 0; j < 3; j++) {
                if (results[i][j] == results[i][0]) {
                    System.out.print(results[i][j] + "\t\t\t");
                }
                if (results[i][j] == results[i][1]){
                    System.out.print(results[i][1] + "\t\t\t\t");
                }
                if (results[i][j] == results[i][2]){
                    System.out.print(results[i][2]+"\n");
                }
            }
        }
       }
    }

