import java.util.Scanner;

public class Ex2 {
    public static final float ESTAGIOMIN =(float)600;
    public static final float ESTAGIOMEDIO = (float)1310;
    public static final float ESTAGIOG = (float)2020;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, Semestres, Smin, Smin2, Smid, Smid2, Sg, OP,id,idJ,idV;
        double folha,gp1,gp2,gp3,gp4,gp5,min1,min2,min3,minsal;
        String Nome = "";
        Smin=0;
        Smin2=0;
        Smid=0;
        Smid2=0;
        Sg=0;
        gp1 =0;
        gp2 =0;
        gp3 =0;
        gp4 =0;
        gp5 =0;
        id = 0;
        idJ = 0;
        idV = 0;

        System.out.println("Quantos funcionarios deseja analizar: ");
        OP = input.nextInt();
        for(i = 1; i<=OP;i++){
            System.out.println("Digite dados do funcionario N"+i+"\n");
            System.out.println("Digite seu nome");
            Nome = input.next();
            System.out.println("Digite seu id");
            id = input.nextInt();
            if (i==1) {
                idJ = id;
                idV = id;
            }
            else {
                if(id<idJ){
                    idJ = id;
                }
                if (id>idV) {
                    idV = id;
                }
            }
            do {
                System.out.println("Quais semestres foram completados: ");
                Semestres = input.nextInt();
                if(Semestres<1 || Semestres>10){
                    System.out.println("Digite um semestre valido!!");
                    }else {
                    if (Semestres<=2){
                        System.out.println("Você consegue um estagio com salario baixo\nValor de: "+ESTAGIOMIN+"\n");
                        Smin++;
                        gp1 = Smin*ESTAGIOMIN;
                    }else{
                        if (Semestres<=4) {
                            System.out.println("Você consegue um estagio com salario baixo porem com um aumento de 40%\nValor de: "+ESTAGIOMIN*1.4+"\n");
                            Smin2++;
                            gp2 = Smin2*ESTAGIOMIN*1.4;
                        }
                        else {
                            if (Semestres<=6){
                                System.out.println("Você consegue um estagio com salario medio\nValor de: "+ESTAGIOMEDIO+"\n");
                                Smid++;
                                gp3 = Smid*ESTAGIOMEDIO;
                            }
                            else {
                                if (Semestres<=8){
                                    System.out.println("Você consegue um estagio com salario medio com um aumento de 30%\nValor de: "+ESTAGIOMEDIO*1.3+"\n");
                                    Smid2++;
                                    gp4 = Smid2*ESTAGIOMEDIO*1.3;
                                }else {
                                    if(Semestres <= 10){
                                    System.out.println("Você consegue um estagio com salario alto\nValor de: "+ESTAGIOG+"\n");
                                    Sg++;
                                    gp5 = Sg*ESTAGIOG;
                                    }
                                }
                            }
                        }
                    }
                }
            }while (Semestres<1 || Semestres>10);
        }
        min1 = Math.min(gp1,gp2);
        min2 = Math.min(gp3,gp4);
        min3 = Math.min(gp5,min1);
        minsal = Math.min(min3,min2);
        folha = gp1+gp2+gp3+gp4+gp5;
            System.out.printf("id mais jovem: "+idJ+" id mais velho "+idV);
            System.out.println("Integrantes contratados com salario minimo: "+Smin+" folha de pagamento para este grupo "+ gp1);
            System.out.println("Integrantes contratados com salario minimo com aumento: "+Smin2+" folha de pagamento para este grupo "+gp2);
            System.out.println("Integrantes contratados com salario medio: "+Smid+" folha de pagamento para este grupo "+gp3);
            System.out.println("Integrantes contratados com salario medio com aumento: "+Smid2+" folha de pagamento para este grupo "+gp4);
            System.out.println("Integrantes contratados com salario alto: "+Sg+" folha de pagamento para este grupo "+ gp5);
            System.out.println("Menor valor gasto por gp foi de: "+minsal);
            System.out.println("Folha de pagamento para "+(Smin+Smin2+Smid+Smid2+Sg)+" fucionarios no valor de: "+folha+"\n");

    }

}
// Maior e menor gasto por gp, notas para vantagens, adicionar tentativas