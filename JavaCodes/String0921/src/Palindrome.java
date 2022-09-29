import java.util.Locale;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase,YesNo;
        boolean palindrome = true;
        boolean continuar = true;
        int i,j;
        System.out.println("Digite uma Palavra: ");
        frase = input.nextLine().toLowerCase(Locale.ROOT);
        char palavra [] = frase.toCharArray();
        j = palavra.length - 1;

        for (i=0;i< palavra.length;i++){
            if (palavra[i] != palavra[j]){
                palindrome = false;
            break;
            }
            j--;
        }

        if (palindrome){
            System.out.println("Palindrome");
        }else {
            System.out.println("N Palindrome");
        }




        input.close();
    }
}