import java.util.Scanner;
import java.lang.Math;

public class EstSeq_exe3 {
    public static void main(String[] args) 
    {
        double raio, Result;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o valor do raio: ");
        raio = entrada.nextFloat();
        // conver(tipo de numero)
        Result = (int)(Math.PI * Math.pow(raio, 2));
        System.out.println("A area do circulo é "+ Result);
    }
    
}
