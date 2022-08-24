import java.util.Random;

public class MatrizEx3 {
    public static final int Line = 4;
    public static final int Col = 5;
    public static void main(String[] args) {
    Random Rand = new Random();
    int M[][]= new int[Line][Col];
    int i,j,maior,menor,LineMaior,LineMenor,ColMenor,ColMaior;
    for (i=0;i<M.length;i++){
        for (j=0;j<M[0].length;j++){
            System.out.println("elemente, lin "+i+", col "+j+": ");
            M[i][j] = Rand.nextInt(10)+1;
        }
    }

        System.out.println("\nM[][]= ");
    for (i=0;i<M.length;i++){
        for (j=0;j< M[0].length;j++){
            System.out.print("\t"+ M[i][j]);
        }
        System.out.println();
    }
    maior = M[0][0];
    menor = M[0][0];
    LineMaior = 0;
    LineMenor = 0;
    ColMaior =0;
    ColMenor = 0;
    for (i=0;i< M.length;i++){
        for(j=0;j< M[0].length;j++){
            if (M[i][j]>maior){
                maior = M[i][j];
                LineMaior = i;
                ColMaior = j;
            }else {
            if (M[i][j]<menor){
               menor = M[i][j];
               LineMenor = i;
               ColMenor = j;
            }
            }
        }
    }
    System.out.println("\nMaior: "+ maior + " Line: "+ (LineMaior+1)+" Col: "+ (ColMaior+1));
    System.out.println("\nMenor: "+ menor+ " Line: "+ (LineMenor+1)+" Col: "+ (ColMenor+1));

    }
}

