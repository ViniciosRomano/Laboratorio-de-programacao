import java.util.Random;

public class Vetores2 {
    public static void main(String[] args) {
        Random r = new Random();
        int vetX[] = new int[5];
        int vetY[] = new int[5];
        int vetI[] = new int[10];
        int i;
        for(i=0;i< vetX.length;i++){
            vetX[i] = r.nextInt(10)+1;
        }
        for (i=0;i<5;i++){
            System.out.print(vetX[i] + ",");
        }
        System.out.print("\b");

        System.out.println();

        for(i=0;i<vetY.length;i++){
            vetY[i] = r.nextInt(10)+11;
        }
        for (i=0;i<5;i++){
            System.out.print(vetY[i] + ",");
        }
        System.out.print("\b");

        System.out.println();

        for (i=0;i< vetX.length;i++){
            vetI[2*i] = vetX[i];
            vetI[(2*i)+1] = vetY[i];
        }

        for (i=0;i< vetI.length;i++){
            System.out.print(vetI[i] + ",");
        }
        System.out.print("\b");
    }
}
