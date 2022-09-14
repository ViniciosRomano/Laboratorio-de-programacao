import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String frase,frasinha,FRASE;
        int vogais,i,consoantes;


        System.out.println("Digite uma frase: ");
        frase = input.nextLine();
        FRASE = frase.toUpperCase(Locale.ROOT);
        frasinha = frase.toLowerCase(Locale.ROOT);
        System.out.println("Frase Original: "+ frase);
        System.out.println("Frase Lower: "+ frasinha);
        System.out.println("Frase Upper: "+ FRASE);

        vogais = 0;
        consoantes = 0;
        for(i = 0; i< FRASE.length();i++){
            if (FRASE.charAt(i) == 'A' ||
                FRASE.charAt(i) == 'E' ||
                FRASE.charAt(i) == 'I' ||
                FRASE.charAt(i) == 'O' ||
                FRASE.charAt(i) == 'U') {
            vogais++;
            }
            else {
                consoantes++;
            }
        }
        System.out.println("Tem " + vogais + " vogais\nTem "+ consoantes+" consoantes \nTem "+ FRASE.length() + " letras") ;




    }
}
