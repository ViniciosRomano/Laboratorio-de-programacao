import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number, x, y,A,B,C;
        /*boolean postivo;

        System.out.print("Informe um numero: ");
        number = input.nextInt();
        postivo = verificador(number);

        if(List.verificador(number) == true){
            System.out.println(number + " positivo");
        }
        else {
            System.out.println(number + " negativo");
        }

        if(List.imparPar(number)== true){
            System.out.println(number + " Par");
        }
        else {
            System.out.println(number + " Impar");
        }
        System.out.print("Seu dobro e "+ List.Dobro(number));

        System.out.print("\nInforme a primeira nota: ");
        x = input.nextInt();
        System.out.print("\nInforme a segunda nota: ");
        y = input.nextInt();

        System.out.print("\nSoma das notas: "+ List.Soma(x,y));
        System.out.print("\nSoma do intervalo das notas: "+ List.SomaIntervalos(x,y));
        System.out.print("\nMedia das notas: "+ List.Media(x,y));

        System.out.print("\nInforme A: ");
        A = input.nextInt();
        System.out.print("\nInforme B: ");
        B = input.nextInt();
        System.out.print("\nInforme C: ");
        C = input.nextInt();

        System.out.println("Soma dos multiplos: " + List.multiplos(A,B,C));
        input.close();*/


//        int vetor[] ={1,2-3,4,-5};
//        int i;
//        System.out.print("Vetor[] (int)= ");
//        for(i=0; i<vetor.length;i++){
//            System.out.print(vetor[i]+", ");
//        }
//        System.out.println("\b");
//
//        removeNegative();
// Continuar

        int perfeitos[] = new int[3];
        int i;
        perfeitos = List.ReturnPerfect();
        System.out.print("Os 3 primeiros numeros perfeitos: ");
        for (i=0;i<perfeitos.length;i++){
            System.out.print(perfeitos[i]+",");
        }


    }

}