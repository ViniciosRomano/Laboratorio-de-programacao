import java.util.Random;

public class MatrizEx2 {
    public static final int Line = 3;
    public static final int Col = 4;

    public static void main(String[] args) {
       int M[][] = new int[Line][Col];
       int S[] = new int[3];
       int R[][] = new int[Line][Col];
       Random Rand = new Random();
        int i,j;
        for (i=0;i<M.length;i++){
            for (j=0;j< M[0].length;j++){
                System.out.println("elemente, lin "+i+", col "+j+": ");
                M[i][j] = Rand.nextInt(10)+1;
                S[i] = S[i]+ M[i][j];
            }
        }
        for (i=0;i< R.length;i++){
            for (j=0;j<R[0].length;j++){
                R[i][j] = S[i]*M[i][j];
            }
        }

        System.out.println("\nM[][]= ");
        for (i=0;i<M.length;i++){
            for (j=0;j< M[0].length;j++){
                System.out.print("\t"+ M[i][j]);
            }
            System.out.println();
        }

        System.out.println("\nSoma[]= ");
        for(i=0;i<S.length;i++){
            System.out.print("\t"+S[i]+"\n");
        }

        System.out.println("\nR[][]= ");
        for (i=0;i<R.length;i++){
            for (j=0;j< R[0].length;j++){
                System.out.print("\t"+ R[i][j]);
            }
            System.out.println();
        }

    }
}
