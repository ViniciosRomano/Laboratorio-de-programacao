import java.util.Scanner;

public class VetoresEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetX[] = {1, 3, 5, 7, 9};
        int vetY[] = {2, 4, 6, 8, 10};
        int vetI[] = new int[10];
        int i;
        int options;
        System.out.println("Digite a opção que deseja:\n[0] para sair\n[1] para ordem crescente\n[2] para ordem Decrescente");
        options = input.nextInt();
        switch (options) {
            case 0:
                System.exit(0);
                break;
            case 1:

                System.out.print("vetI[]: ");
                for (i = 0; i < vetX.length; i++) {
                    vetI[2 * i] = vetX[i];
                    vetI[(2 * i) + 1] = vetY[i];
                }

                for (i = 0; i < vetI.length; i++) {
                    System.out.print(vetI[i] + ",");
                }
                System.out.print("\b");
                break;
            case 2:
                for (i = 0; i < vetX.length; i++) {
                    vetI[2 * i] = vetX[i];
                    vetI[(2 * i) + 1] = vetY[i];
                }
                for (i = vetI.length-1; i >= 0; i--) {
                    System.out.print(vetI[i] + ",");
                }
                System.out.print("\b");
                break;
        }
    }
}
