import java.util.Locale;
import java.util.Scanner;

public class Cripto {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String frase,FRASE;
        int i;

        System.out.println("Digite uma frase: ");
        frase = input.nextLine();
        FRASE = frase.toUpperCase(Locale.ROOT);
        char crypt[] = frase.toCharArray();

        for(i = 0; i< FRASE.length();i++){
            if (FRASE.charAt(i) == 'A' ||
                    FRASE.charAt(i) == 'E' ||
                    FRASE.charAt(i) == 'I' ||
                    FRASE.charAt(i) == 'O' ||
                    FRASE.charAt(i) == 'U') {
                    crypt[i] = '*';
            }
        }
        System.out.println("Crypt= ");
        for(i = 0;i<crypt.length;i++){
            System.out.print(crypt[i]);
        }
        input.close();
    }
}
