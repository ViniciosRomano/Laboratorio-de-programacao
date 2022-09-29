import java.util.Scanner;
public class CryptoCifraCesar {
    public static void main(String[] args) {
        String frase;
        String letras = "ABCDEFGIJKLMNOPQRSTUVWXYZ";
        String trocas = "DEFGIJKLMNOPQRSTUVWXYZABC";
        Scanner input = new Scanner(System.in);
        int i,j;
        char letra;

        System.out.print("Digite uma frase para Criptografia: ");
        frase = input.nextLine().toUpperCase();
        char cript[] = frase.toCharArray();
        for (i=0;i<cript.length;i++){
            letra = cript[i];
            for (j=0;j<letras.length();j++){
                if (letra == letras.charAt(j)){
                    cript[i] = trocas.charAt(j);
                    break;
                }
            }
        }
        System.out.println("Frase: "+ frase);
        System.out.print("Crypt: ");
        for (i=0;i<cript.length;i++){
            System.out.print(cript[i]);
        }
    }
}
