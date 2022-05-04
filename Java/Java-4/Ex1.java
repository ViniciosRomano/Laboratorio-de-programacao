import java.util.Scanner;

public class Ex1 {
    //psvm
    //sout
    //souf

    public static void main(String[] args) {
        int A,B,soma,mult,i, aux;
        Scanner input = new Scanner(System.in);
        System.out.print("Digit o valor de A: ");
        A = input.nextInt();
        System.out.print("Digite o valor de B: ");
        B = input.nextInt();
        if (A>B){
            aux = A;
            A=B;
            B=aux;
        }

        soma = 0;
        mult = 1;
        for (i=A;i<=B;i++){
            if (i%2 == 0)
                soma = soma + i;
            else
                mult = mult * i;
        }
        System.out.print("soma="+ soma+ "\n"+"multiplication =" + mult);
        input.close();
    }
}
