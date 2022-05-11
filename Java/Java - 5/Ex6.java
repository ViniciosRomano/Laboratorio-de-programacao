import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X, loops,vezes,i;
        double fat;
        System.out.println("Quantas vezes deseja calcular N! ");
        vezes = input.nextInt();

        loops = 0;
        while (loops < vezes){
            System.out.println("\nDigite o valor de fatorial N!:");
            X = input.nextInt();

            fat = 1;
            for (i=X; i>1; i--)
                fat = fat * i;
            System.out.println(X +"!= "+ fat);
            loops++;
        }
        input.close();
    }
}
