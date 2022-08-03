import java.util.Scanner;

public class Vetores {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int vetX[] = new int[5];
        int vetY[] = new int[5];
        int vetI[] = new int[10];
        int i;
        for(i=0;i< vetX.length;i++){
            System.out.print("Digite o "+ (i+1) +"* elemento: ");
            vetX[i] = input.nextInt();
        }
        System.out.println();
        System.out.print("Vetx[]= ");

        for (i=0;i<5;i++){
            System.out.print(vetX[i] + ",");
        }
        System.out.print("\b");

        System.out.println();

            for(i=0;i<5;i++){
                System.out.print("Digite o "+ (i+1) +"* elemento: ");
                vetY[i] = input.nextInt();
            }

            System.out.println();
            System.out.print("vetY[]= ");
            System.out.print("\b");


        for (i=0;i< vetY.length;i++){
                System.out.print(vetY[i] + ",");
            }

                for (i=0;i< vetX.length;i++){
                    vetI[2*i] = vetX[i];
                    vetI[(2*i)+1] = vetY[i];
                }

                    for (i=0;i< vetI.length;i++){
                        System.out.print(vetI[i] + ",");
                    }
        System.out.print("\b");
        input.close();
    }
}
