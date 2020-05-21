import java.util.Scanner;
import static java.lang.StrictMath.sqrt;


public class exo6 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int x1, y1, x2, y2 ;

        System.out.println(" entrer le  coordonnées du point A");
         x1= scan.nextInt();
         y1= scan.nextInt();
        System.out.println(" entrer les coordonnées du point B");
         x2= scan.nextInt();
         y2= scan.nextInt();
        System.out.println("la distance entre A et B est "+ sqrt((x1 - x2)*2  + (y1-y2)*2));

    }
}
