import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {
    public static final int TRABALHADORES = 5;
    public static final double SAL_MIN = 1212.0;
    public static final double SAL_MAX = 3636.0;
    public static final int
    public static void main(String[] args) {
        int i, id, idMAIOR, idmenor, turno ,trabDiurno, trabNoturno;
        double Salario,sal_MAIOR, sal_menor, folha, folhaDiurno, folhaNoturna;
        Scanner input = new Scanner(System.in);
        DecimalFormat R$ = new DecimalFormat("R$ ##,###.00");

        id = 0; idMAIOR = 0; idmenor= 0;
        Salario = 0; sal_MAIOR = 0; sal_menor = 0;
        folha= 0; folhaDiurno = 0; folhaNoturna = 0;

        for(i = 1; i<= TRABALHADORES; i++){
            do {
            System.out.println("Informe o Id da "+ i + " pessoa");
            id = input.nextInt();
                if (id <11 || id>99){
                    System.out.println("ID INVÁLIDO");
                }
            }while (id <11 || id>99);
            do {
            System.out.println("Informe a Salario da "+ i +" pessoa");
            Salario = input.nextInt();
                if (Salario< SAL_MIN || Salario > SAL_MAX){
                System.out.println("Salario INVÁLIDO");
                }
            } while (Salario< SAL_MIN || Salario > SAL_MAX);
            do {

            System.out.println("Informe seu turno de trabalho da"+ i +" pessoa");
            turno = input.nextInt();
            }while (turno != 1 && );

            folha = folha + Salario;

            if (i == 1){
                idMAIOR = id;
                sal_MAIOR = Salario;
                idmenor = id;
                sal_menor = Salario;
            }
            else{
                if (Salario < sal_menor){
                    idmenor = id;
                    sal_menor = Salario;
                }
                if (Salario > sal_menor){
                    idMAIOR = id;
                    sal_MAIOR = Salario;
                }
            }
        }
        System.out.println("Pessoa maior " + idMAIOR + " " + R$.format(sal_MAIOR));
        System.out.println("Pessoa menor " + idmenor + " " + R$.format(sal_menor));
        System.out.println("Folha de pagamentos: " + R$.format(folha));
        System.out.println("Media salarial: " + R$.format(folha/TRABALHADORES));
    }
}
