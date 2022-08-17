import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X[] = new int[10];
        int i,cont;

        cont = 0;

        System.out.println("Digite os 10 numeros inteiros entre 1 a 100: ");

        for (i=0;i<X.length;i++){
            System.out.println("Digite o "+(i+1)+"* numero");
            X[i] = input.nextInt();

            if (X[i]%2 == 0){
               cont++;
            }
        }
        int par[] = new int[cont];
        for (i=0; i<cont;i++){
                if (X[i]%2 == 0){
                   par[i] = X[i];
                }
        }
        System.out.print("VetX[]: ");
        for (i=0;i<(X.length);i++){
            System.out.print(X[i]+",");
        }
        System.out.print("\b");

        System.out.println("\n" + cont);

        System.out.print("Par[]: ");
        for (i=0;i<par.length;i++){
            System.out.print(par[i]+",");
        }
        System.out.print("\b");

    }
}
