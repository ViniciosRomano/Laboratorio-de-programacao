import java.util.Scanner;

public class Ex1 {
    public static final int PESSOAS = 5;
    public static void main(String[] args) {
        int i, id, idade, idJovem, idadeJovem,idVelha, idadeVelha;
        Scanner input = new Scanner(System.in);

        id = 0; idJovem = 0; idVelha= 0;
        idade = 0; idadeJovem = 0; idadeVelha = 0;

        for(i = 1; i<=PESSOAS;i++){
            System.out.println("Informe o Id da "+ i + " pessoa");
            id = input.nextInt();
            System.out.println("Informe a idade da "+ i +" pessoa");
            idade = input.nextInt();
        if (i == 1){
            idJovem = id;
            idadeJovem = idade;
            idVelha = id;
            idadeVelha = idade;
        }
        else{
            if (idade < idadeVelha){
                idJovem = id;
                idadeJovem = idade;
            }
            if (idade > idadeVelha){
                idVelha = id;
                idadeVelha = idade;
            }
        }
        }
        System.out.println("A pessoa mais jovem " + idJovem + " " + idadeJovem + " Anos");
        System.out.println("A pessoa mais velha " + idVelha + " " + idadeVelha + " Anos");
    }
}
