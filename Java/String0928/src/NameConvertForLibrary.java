
import java.util.Locale;
import java.util.Scanner;

public class NameConvertForLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nomeINN;
        String nomeOUT = "";
        String nomes[] = new String[1];
        int i;

        System.out.println("Digite seu nome: ");
        nomeINN = input.nextLine().toUpperCase(Locale.ROOT).trim();
        //Remover Espaço em branco .trim()
        nomes =  nomeINN.split(" ");
        nomeOUT = nomeOUT + nomes[nomes.length-1]+", ";
        for (i=0;i< nomes.length-1;i++){
            nomeOUT = nomeOUT + nomes[i].charAt(0)+". ";
        }
        System.out.println("NomeINN: "+nomeINN);
        System.out.println("NomeOut: "+nomeOUT.trim());
    }
}