import java.util.Scanner;

public class exo13 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int jour, mois, annee ;

        System.out.println("enter le jour ");
        jour = scan.nextInt();
        System.out.println("enter le mois ");
        mois = scan.nextInt();
        System.out.println("enter l'annee ");
        annee = scan.nextInt();
        if(  (jour < 1 ) || (jour > 31 ) || (mois < 1 || mois >12)
        || ((mois == 2 ) && (((jour  >29 && (annee % 4 == 0 )) || ((jour  >  28 &&
                (annee % 4 != 0))))))){
            System.out.println("la date est incorect "+jour+ " jj "+mois+" m "+annee);

        }else{
             System.out.println("la date est correct");
        }

    }
}
