import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        int n, i, divisores;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero");
        n = input.nextInt();
        input.close();

        divisores = 0;
        for (i =1; i<=n; i++)
            if (n%i == 0)
                divisores++;

        if (divisores == 2)
            System.out.println("O N°"+ n + "É um N° primo");
        else
            System.out.println("O N°"+ n + "Não é um N° primo");

    }
}
