import java.util.Scanner;

public class exo16 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, grand = 0, cpt = 0;
        do {
            System.out.println(" entrer deux valeur ");
            a = scan.nextInt();
            b = scan.nextInt();
        } while (a < 0 && b < 0);
        cpt = 0;
        if( a < b ) {
            grand = b;
            b=a;
            a = grand;

        }
        while(a >= b){

            a = a - b;

            cpt++;

            }


        System.out.println ("le resultat de la division  est "+cpt);
        System.out.println ("le reste de la division  est " +a);


    }
}
