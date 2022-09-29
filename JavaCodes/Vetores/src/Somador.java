import java.util.Scanner;

public class Somador {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int X[]= new int[5];
        int i, soma,mult;
        soma = 0;
        mult = 1;
        System.out.println("Some 5 numeros: ");
        for (i=0;i<X.length;i++){
            System.out.println("Digite o "+(i+1)+" Numero: ");
            X[i]= input.nextInt();
            soma = soma + X[i];
            mult = mult * X[i];
        }
        System.out.println("Soma: "+soma);
        System.out.println("Multi: "+mult);
    }
}