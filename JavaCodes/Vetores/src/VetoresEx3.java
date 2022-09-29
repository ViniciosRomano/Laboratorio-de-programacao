import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class VetoresEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random R = new Random();
        int Faces[] = {0,0,0,0,0,0};
        int Dado[] = new int[10];
        int i;

        for (i = 0; i < Dado.length;i++){
            Dado[i] = R.nextInt(6)+1;
            System.out.println(Dado[i]);
            switch (Dado[i]){
                case 1:
                    Faces[0] += 1;
                    break;
                case 2:
                    Faces[1] += 1;
                    break;
                case 3:
                    Faces[2] += 1;
                    break;
                case 4:
                    Faces[3] += 1;
                    break;
                case 5:
                    Faces[4] += 1;
                    break;
                case 6:
                    Faces[5] += 1;
                    break;
                }
        }
        System.out.println(Arrays.toString(Faces));
    }
}
