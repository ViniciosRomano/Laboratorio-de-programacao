import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;


public class finalAverage {
    public static final int MATERIAS = 7;
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String [] names = new String[MATERIAS];
        double [] notes = new double[MATERIAS];
        double [] sprint = new double[2];
        double [] sprintFinal = new double[MATERIAS];
        double [] checkpoint = new double[2];
        double [] checkpointFinal = new double[MATERIAS];
        double [] noteFinal = new double[MATERIAS];
        double [] gsFinal = new double[MATERIAS];

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.DOWN);
        for (int i=0;i<names.length;i++){
        System.out.println();
        System.out.print("Digite o nome da materia: ");
        names[i] = input.next();
        System.out.print("Digite a media Final do primeiro semestre: ");
        notes[i] = input.nextDouble();
        if (notes[i]>10){
            notes[i] = notes[i]/10;
        }
        notes[i] = notes[i]*0.4;
        for (int j=0;j<2;j++){
        System.out.print("Digite sua nota do sprint "+(j+1)+": ");
        sprint[j] = input.nextDouble();
        if (sprint[j]>10){
            sprint[j] = sprint[j]/10;
        }
        }
        sprintFinal[i] = ((sprint[0]+sprint[1])/2);

        for (int j=0;j<2;j++){
            System.out.print("Digite sua nota do checkpoint "+(j+1)+": ");
            checkpoint[j] = input.nextDouble();
            if (checkpoint[j]>10){
                checkpoint[j] = checkpoint[j]/10;
            }
         }
        checkpointFinal[i] =((checkpoint[0]+checkpoint[1])/2);
        noteFinal[i] = (((checkpointFinal[i]+ sprintFinal[i])/2)*0.24)+notes[i];
        if (noteFinal[i]<6){
            gsFinal[i] = (6-noteFinal[i])/0.36;
        }else {
            gsFinal[i] =(8.5-noteFinal[i])/0.36;
        }

        }
        System.out.println("\nPrimeiro semestre:");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------");
        for (int i=0;i< notes.length;i++){
            if (noteFinal[i]<6){
                System.out.println(names[i]+"\tNota: "+df.format(notes[i])+ "\tMedia Atual: "+df.format(noteFinal[i])+"\tFaltaGs: "+df.format(gsFinal[i]));
                System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            }else {
                System.out.println(names[i]+"\tNota: "+df.format(notes[i])+ "\tMedia Atual: "+df.format(noteFinal[i])+"\tBeneficios: "+df.format(gsFinal[i]));
                System.out.println("----------------------------------------------------------------------------------------------------------------------------");
            }
        }
    }
}