package Aula1;
import java.util.Scanner;
// psvm
public class EstSeq_exe1{
    public static void main(String[] args) 
    {
        int A, B, C,soma;
        Scanner teclado;
        teclado = new Scanner(System.in);
        //sysout
        System.out.println("Informe o valor de A: ");
        A = teclado.nextInt();
        System.out.println("informe o valor de b: ");
        B = teclado.nextInt();
        System.out.println("Informe o valor de C: ");
        C = teclado.nextInt();

        soma = A + B + C;
        System.out.println("soma = " + soma);
        teclado.close();
    }
}