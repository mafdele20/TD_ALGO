import java.util.Scanner;


public class Exo2 {
    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        double surf ,pi ,prm , r ;

        do {
            System.out.println("entrer le rayon\n");
             r = scan.nextFloat() ;
        }while (r <= 0) ;

         pi = 4 * Math.atan(1) ;

        prm  = r  * pi * 2 ;

        surf  = pi * r*r;

        System.out.println("le perimetre est : "+prm+ "cm et la surface est : "+surf+ "cm²");


    }
}
