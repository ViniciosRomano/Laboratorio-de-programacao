import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        int N;
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de N: ");
        N = input.nextInt();

        while (N<=0){
            System.out.println("Numero invalido, escreva outro numero:");
            N=input.nextInt();
        }
        System.out.println("Numero:"+N);
    }
}
