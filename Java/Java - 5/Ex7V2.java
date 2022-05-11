import java.util.Scanner;

public class Ex7V2 {
    public static void main(String[] args) {
        int n, i;
        boolean primo;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um numero");
        n = input.nextInt();
        input.close();

        primo = true;
        for (i =2; i<n; i++){
            if (n % i == 0){
                primo = false;
                break;
            }
        }

        if (primo){
            System.out.println("O N° " + n + " é um N° primo");
        }
        else{
            System.out.println("O N° " + n + " não é um N° primo");
        }
    }
}

