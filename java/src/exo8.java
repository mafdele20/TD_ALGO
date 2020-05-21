import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class exo8 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double  a,b,c  , x1, x2;
        double delta;

        System.out.println("entrer les donnees de l’equation");
         a = scan.nextInt();b= scan.nextInt();c = scan.nextInt();
        delta = b*b - 4*a*c;
        if(delta < 0) {
            System.out.println("Pas de solution dans l’ensemble R");
        }
        else{
            if (delta == 0) {
            x1 = -b/(2*a);
            System.out.println("une solution double : " + x1);
            }else {

           x1 = (-b - sqrt(delta) )/ (2*a);
           x2 =  (-b + sqrt(delta))/ (2*a);

                System.out.println("l'equation  : " + x1);

            }
        }

     //   Afficher "deux solutions distinctes " + x1 + " et " + x2

    }
}
