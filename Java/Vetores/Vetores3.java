import java.util.Random;

public class Vetores3 {
    public static void main(String[] args) {
        int vetX[] = {1,3,5,7,9};
        int vetY[] = {2,4,6,8,10};
        int vetI[] = new int[10];
        int i;

        System.out.print("vetX[]: ");
        for (i=0;i<5;i++){
            System.out.print(vetX[i] + ",");
        }
        System.out.print("\b");

        System.out.println();

        System.out.print("vetY[]: ");
        for (i=0;i<5;i++){
            System.out.print(vetY[i] + ",");
        }
        System.out.print("\b");

        System.out.println();

        System.out.print("vetI[]: ");
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
