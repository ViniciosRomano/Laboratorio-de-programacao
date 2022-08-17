import java.util.Scanner;

public class Imc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int peso[]= new int[5];
        int altura[]= new int[5];
        int imc[]= new int[5];
        int i;

        for (i=0;i<peso.length;i++){
            System.out.println("Digite o "+ (i+1)+ " *peso");
            peso[i] = input.nextInt();
            System.out.println("Digite o "+ (i+1)+ " *altura");
            altura[i] = input.nextInt();

            imc[i] = peso[i]*altura[i];
        }

    }
}
