public class CaixaCef {
    public static void main(String[] args) {
        int cef[]={2,0,0,4,0,0,1,0,0,0,0,0,4,4,8,6};
        int soma, peso,i,DVc,DVi;
       // int cef[] = new int[16];
    soma = 0;
    peso = 8;
    DVi = cef[cef.length-1];
    for(i=0;i< cef.length-1;i++){
        soma = soma + cef[i]*peso;
        peso--;
        if (peso == 1){
            peso = 9;
        }
        }
        System.out.println(soma);
        soma = 10*soma;
        DVc= soma % 11;
        if (DVc==10){
            DVc = 0;
        }
        if(DVi==DVc){
            System.out.println("CEF VALIDO");
        }
        else {
            System.out.println("CEF INVALIDO");
        }
    }
}