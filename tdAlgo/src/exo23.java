import java.util.Scanner;

public class exo23 {

    public static void main(String [] args){
       // Scanner scan = new Scanner(System.in);
        int  N = 12 ,milliard = 1000000000;

        int m, M = 0, FN, i ;

        m = 2;
        FN = m;

        for(i=1;i <=  N;i++){
            if(i == 1) {
                M=2;
                FN=M;
            }else {

                FN = M + m;
                m = M;
                M=FN;
            }
        }
        System.out.println("le nombre de lapins au bout de "+N+" mois est : " +FN);


        while(FN <= milliard) {
            N++;
            FN = M + m;
            m = M;
            M = FN;
        }

        System.out.println("le nombre de depasse " + milliard + " au bout de " + N +" mois");


    }
}
