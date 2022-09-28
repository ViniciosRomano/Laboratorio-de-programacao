import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        int i, N ,Fn = 0, Fn1 = 1,Fn2 = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Numero de sequencia fibonacci");
        N = input.nextInt();

        // 0, 1, 1, 2, 3, 5, 8...
        for (i = 0; i <=N; i++){
            System.out.print(Fn + ",");
            Fn = Fn1+Fn2;
            if (i>1)
             Fn2 = Fn1;
             Fn1 = Fn;
        }
    }
}
