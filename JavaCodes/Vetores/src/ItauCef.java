public class ItauCef {
    public static void main(String[] args) {
        int cef[]={2,5,4,5,0,2,3,6,6,1};
        int soma,mult, peso,i,DVc,DVi,resto;
        soma = 0;
        peso = 2;
        DVi = cef[cef.length-1];
        for(i=0;i< cef.length-1; i++){
            mult = cef[i]*peso;
            /*if (mult>9){
                mult = mult % 10;
                mult++;
            }*/
            if (mult>9){
                mult= mult-9;
            }
            soma = soma+mult;
            peso--;
            if (peso == 0 ){
                peso=2;
            }
            }
            resto = soma %10;
            if (resto==0){
                DVc=0;
            }
            else {
                DVc = 10-resto;
            }

            if (DVc ==DVi){
                System.out.println("CEF Valida");
            }
            else {
                System.out.println("CEF Invalida");
        }
    }
}
