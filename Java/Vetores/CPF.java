import java.util.Scanner;

public class CPF {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
    int cpf[]={1,2,3,4,5,7,7,8,9,5,4};
    int soma, peso,i, resto ,DV1c,DV2c,DV1i,DV2i;
    //int cpf[]= new int[10];
    soma = 0;
    peso = 10;
    DV1i = cpf[cpf.length-2];
    DV2i = cpf[cpf.length-1];
    DV1c = 0;
    DV2c = 0;
        //System.out.println("Digite seu cpf:");
        //cpf[0] = input.nextInt();

        for (i=0; i<cpf.length-2; i++) {
                soma = soma + peso*cpf[i];
                peso--;
        }
        resto = soma%11;
        if (resto<2) {
            DV1c=0;
        }
        else {
            DV1c = 11 - resto;
        }
        soma = 0;
        peso = 11;

            for (i=0; i<cpf.length-1; i++) {
                soma = soma + peso*cpf[i];
                peso--;
            }
            resto = soma%11;
            if (resto<2) {
                DV2c=0;
            }
            else {
                DV2c = 11 - resto;
            }

                if ((DV1c==DV1i)&& (DV2c==DV2i)){
                    System.out.println("CPF VALIDO!");
                }
                else{
                    System.out.println("CPF INVALIDO");
                }
        }
    }