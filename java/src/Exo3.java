import java.util.Scanner;

public class Exo3 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        //VERSION 1

        double R1 ,R2,R3 , rserie, rpara;
        System.out.println("  entre la resistance R1  ");
        R1= scan.nextDouble() ;

        System.out.println("  entre la resistance R2  ");
        R2 = scan.nextDouble() ;

        System.out.println("  entre la resistance R3  ");
        R3 = scan.nextDouble() ;

        rserie = R1 + R2 +R3;
        rpara  =  (R1 *R2 *R3) / (R1 * R2 + R2 * R3 + R1 * R3);
        System.out.println("la résistance en série est :"+ rserie);
        System.out.println("la résistance en parallèle est :"+ rpara);


    }
}
