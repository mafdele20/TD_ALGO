import java.util.Scanner;

public class exo21 {

    public static void main(String [] args){
        int  a, n,choix,score ,t ;
        Scanner scan = new Scanner(System.in);
        t=0;
        choix = 0;
        score = 0;
        System.out.println("entre le nombre  à deviner ");
         a =scan.nextInt();

        while( choix != 2){
        System.out.println("deviné le nombre ");
        n =scan.nextInt();
        t = t + 1;
        if( n > a ) {

            System.out.println("le nombre cherché est plus petit ");
        }else if (n < a){

        System.out.println(" le nombre cherché plus grand");
        }
                score = score +1;
        System.out.println("Vous avez trouvé le nombre et votre score est :"+score+" sur" +t+" tentatives");
        do {
              System.out.println("voulez vous continué \n1 : oui \n2 : non ");
             choix = scan.nextInt();
        } while ( choix == 1 && choix ==2);

        if ( choix ==1){
            System.out.println("Entrer le nombre à deviné ");
             a = scan.nextInt();
        }else {
            break;
        }
    }

    }
}
