import java.util.Scanner;
// psvm
public class Estseq_exe2 {
    public static void main(String[] args)
    {
        float A,B,media;
        Scanner entrada;
        entrada = new Scanner(System.in);
        //sysout
        System.out.println("Informe o valor de A");
        A = entrada.nextFloat();
        System.out.println("Informe o valor de B");
        B = entrada.nextFloat();

        media = (A + B)/2;
        System.out.println("Sua media é " + media);
        entrada.close();       
    }
}
