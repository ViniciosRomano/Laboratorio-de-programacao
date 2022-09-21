import java.util.Locale;
import java.util.Scanner;

public class NewVersionPalindrome {
        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            String palavra,YesNo;
            StringBuffer arvalap = new StringBuffer();
            boolean continuar = true;

            do {
            System.out.println("Digite uma Palavra: ");
            palavra = input.nextLine().toLowerCase(Locale.ROOT);
            arvalap.append(palavra);
            arvalap.reverse();
            if (palavra.equals(arvalap.toString()) == true){
                System.out.println("Palindrome");
            }else {
                System.out.println("Tente novamente");
            }



                System.out.println("Deseja continuar(s/n)");
                YesNo = input.nextLine().toLowerCase(Locale.ROOT);
                System.out.println(YesNo);
                if (YesNo.equals("s")) {
                    continuar = true;
                }
                else {
                    continuar = false;
                }
            }while (continuar);


            input.close();
        }

}
