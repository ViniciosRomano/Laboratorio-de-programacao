import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        DecimalFormat casas = new DecimalFormat("###,###,###,###");
        /* DecimalFormat casas = new DecimalFormat("000,000,000,000");
        DecimalFormat casas = new DecimalFormat("R$ ###,###,###,###,00");*/
        int N,i;
        long fat;
        System.out.println("Informe N:");
        N = input.nextInt();
        input.close();

        System.out.println("\n>>>>> (For) <<<<<");
        fat = 1;
        for (i = N;i >= 1; i--){
            fat = fat*i;
        }
        System.out.println("N!= "+ casas.format(fat));

        System.out.println("\n>>>>> (while) <<<<<");
        fat = 1;
        i= N;
        while (i > 1) {
             fat = fat*i;
             i--;
        }
        System.out.println("N!" + fat);

        System.out.println("\n>>>>> (do-while) <<<<<");
        fat=1;
        i = 1;
        do
        {
             fat = fat*i;
             i++;
        }while (i<=N);
        System.out.println("N!= "+fat);
    }
}
