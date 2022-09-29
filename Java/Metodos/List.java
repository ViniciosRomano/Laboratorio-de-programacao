public class List {
    public static boolean verificador(int num){
        if(num<0){
            return false;
        }
        else {
            return true;
        }
    }

    public static boolean imparPar(int par){
        if (par%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static int Dobro(int dobro){
        return dobro*2;
    }
    public static int Soma(int nota1, int nota2){
        int t;
        t = nota1+nota2;
        return t;
    }
    public static int Media(int note1,int nota2){
        return (note1+nota2)/2;
    }
    public static int SomaIntervalos(int note1,int note2){
        int i, soma;
        soma = 0;
        for(i = note1; i<=note2;i++){
            soma = soma + i;
        }
         return soma;
    }
    public static int multiplos(int A,int B, int C){
        int soma, i;
        soma = 0;
        for(i = B;i<=C;i++){
            if(i%A == 0){
                soma = soma + i;
            }
        }
        return soma;
    }
    // continuar



    public static int[] ReturnPerfect(){
        int vertor[] = {1,2,3};
        int soma, i , N,contador;
        contador = 0;
        N=1;
        while(contador < 3) {
        soma=0;
        for (i=1;i<N;i++) {
            if (N % i == 0)
                soma = soma + i;
        }
            if (soma == N) {
                vertor[contador] = N;
                contador++;
            }
            N++;

        }
        return vertor;
    }
}

