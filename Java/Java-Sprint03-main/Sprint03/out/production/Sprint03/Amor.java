import java.util.Locale;
import java.util.Scanner;

public class Amor {
    public static void main(String[] args) {
        String vc;
        Scanner input = new Scanner(System.in);
        boolean ilovey = true;
        do {
        System.out.print("O tubo digestorio tem qual formato: ");
        vc =  input.nextLine().toLowerCase(Locale.ROOT);
        if (vc.equals("u")){
            ilovey = false;
            System.out.println("Exatamente voce a mulher mais inteligente");
        }else {
            System.out.println("Triangulo, Reto, Redondo, X, U ou Y");
            ilovey =true;
        }

        }while (ilovey);
        input.close();
    }
}
