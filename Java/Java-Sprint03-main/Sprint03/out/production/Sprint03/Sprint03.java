import java.util.Scanner;

public class Sprint03 {
    public static void main(String[] args) {
        int total, i, j, equipes;


        int resultados[] = new int[3];
        Scanner input = new Scanner(System.in);

        System.out.print("Qual o numero de equipes? ");
        System.out.println();
        equipes = input.nextInt();

        int pontuacao[] = new int[equipes];
        int infoFinal[][] = new int [equipes][3];


        for (i = 0; i < equipes; i++) {

                do {
                    System.out.print("Qual o numero da " + (i+1) + " equipe? ");
                    infoFinal[i][0] = input.nextInt();
                } while (infoFinal[i][0] < 11 || infoFinal[i][0] > 99);


                System.out.println();

                System.out.print("Quantas vitorias a " + (i + 1) + " equipe possui? ");
                resultados[0] = input.nextInt() * 5;

                System.out.println();

                System.out.print("Quantos empates a " + (i + 1) + " equipe possui? ");
                resultados[1] = input.nextInt() * 3;

                System.out.println();

                System.out.print("Quantas derrotas a " + (i + 1) + " equipe possui? ");
                resultados[2] = input.nextInt();

                System.out.println();

                System.out.print("Qual a nota do design do robo? ");
                infoFinal[i][2] = input.nextInt();
                System.out.println();


                total = resultados[0] + resultados[1];
                pontuacao[i] = total;
                infoFinal[i][1] = pontuacao[i];
            }

        System.out.println("Classificacao\tCodigo\t Pontuacao\tNota Design");
            for (i=0; i< equipes;i++) {
                for (j = 0; j < 3; j++) {
  // 1 lugar, 2 lugar - codigo
                        if (infoFinal[i][j] == infoFinal[i][0]) {
                            System.out.print((i+1) + " lugar\t\t\t  " + infoFinal[i][j] + "\t\t");
                        }
  //pontuaçao
                        if (infoFinal[i][j] == infoFinal[i][1]){
                            System.out.print(infoFinal[i][1] + "\t\t\t");
                        }
  //nota design
                        if (infoFinal[i][j] == infoFinal[i][2]){
                            System.out.print(infoFinal[i][2]);
                            System.out.println();
                        }
                }
            }



        input.close();
    }
}
