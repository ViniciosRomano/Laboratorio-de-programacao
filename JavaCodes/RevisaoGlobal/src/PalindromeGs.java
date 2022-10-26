import java.util.Locale;
import java.util.Scanner;

public class PalindromeGs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase;
        boolean palindrome = true;
        System.out.print("Digite uma frase: ");
        frase = input.nextLine().toLowerCase(Locale.ROOT);
        //next quebra no primeiro espaço em branco, next line pega a linha inteira
        char [] palavra = frase.toCharArray();
        int j = palavra.length-1;
        for (int i=0;i<frase.length();i++){
            if (palavra[i] == palavra[j]){
                j--;
            }else {
                palindrome = false;
                break;
            }
        }


        if (ehPalindrome(frase) == true){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Nao Palindrome");
        }
        input.close();
    }
    public static boolean ehPalindrome (String palavra){
        StringBuffer arvalap = new StringBuffer();
        arvalap.append(palavra);
        arvalap.reverse();
        //.equalsIgnoreCase ignora MAiuscula e minuscula
        if (palavra.equals(arvalap.toString())){
            return true;
        }else {
            return false;
        }
    }
}