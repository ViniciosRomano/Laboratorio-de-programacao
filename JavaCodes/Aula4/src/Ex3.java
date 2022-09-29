import java.util.Scanner;
import java.util.logging.XMLFormatter;

public class Ex3 {
    public static void main(String[] args) {
        int N;
        //boolen sair = false
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Digite (1) para exibir o valor de pi\nDigite (2) para exibir o valor de e.\nDigite (3) para sair");
            N = input.nextInt();
            switch (N){
                case 1:
                    System.out.println("Valor de pi: "+ Math.PI);
                    break;
                case 2:
                    System.out.println("Valor de E: " + Math.E);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Valor incorreto, digite novamente");
            }
        } while (N!=3);
        //while()sair == false;
        input.close();
    }
}
