import java.util.Scanner;

public class DiasDoAno {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dias[] = {31, 28, 31, 30, 31, 30, 31, 30, 31, 30, 31, 30};
        int mes, i, control;
        control = 1;
        for (i = 0; i < control; i++) {
            System.out.println("Digite o mes em numeros que deseja saber quantos dias tem no mes: ");
            mes = input.nextInt();
            if (mes > 0 && mes < 13) {
                System.out.println("O numero selecionado foi: " + mes + " que tem " + dias[(mes - 1)] + " dias");
            } else {
                System.out.println("Coloque um mes valido!!");
                control++;
            }
        }
    }
}
