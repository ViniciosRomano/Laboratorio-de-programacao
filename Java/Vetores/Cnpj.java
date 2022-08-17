public class Cnpj {
    public static void main(String[] args) {
        int cnpj[]= {1,4,5,7,2,4,5,7,0,0,0,1,8,5};
        int i,peso,soma,resto,Dvi,Dvi2;
        peso = 5;
        soma = 0;
        for (i=0;i<cnpj.length-2;i++){
            soma = soma + (cnpj[i]*peso);
            peso--;
            if(peso == 1){
                peso = 9;
            }
        }
        resto = soma%11;
        if(resto == 0||resto==1){
            Dvi = 0;
        }
        else {
            Dvi = 11 - resto;
        }

        peso = 6;
        soma = 0;
        for (i=0;i<cnpj.length-1;i++){
            soma = soma + (cnpj[i]*peso);
            peso--;
            if(peso == 1){
                peso = 9;
            }
        }
        resto = soma%11;
        if(resto == 0||resto==1){
            Dvi2 = 0;
        }
        else {
            Dvi2 = 11 - resto;
        }

        if (Dvi == cnpj[12] && Dvi2==cnpj[13]) {
            System.out.println("Valido");
        }
        else {
            System.out.println("Invalido");
        }
    }
}
