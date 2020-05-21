import java.util.Scanner;

public class exo12 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int nbr , i , parfait, diviseur ;
        do {
            System.out.println("entre le nombre à tester");
             nbr = scan.nextInt();
        }while (nbr <0);

        diviseur  = 0;

        for(i = 1 ;i< nbr;i++){
            if( nbr % i == 0) {
                diviseur = diviseur + i;
            }
        }

        if (diviseur == nbr){
            System.out.println(nbr+" est un nombre parfait");

        }else {
            System.out.println(nbr+" est un nombre n'est pas parfait");
        }
    }
}
