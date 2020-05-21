import java.util.Scanner;

public class exo25 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        //partie 1
       int i , j ;
        for(i=1;i <=10;i++) {
            for (j = 1; j <= i; j++) {
                System.out.println(i);
            }
        }

	//Partie 2 nombre premier

        int nbr, premier,cpt= 0;
        System.out.println("         \" Entrer un nombre \"\n");
         nbr= scan.nextInt();
         for(i=1;i <=  nbr-1 ;i++) {
             if (nbr % i == 0) {
                 cpt = cpt + 1;
             }
         }
        if (cpt == 1) {
            System.out.println(" le nombre " + nbr + "est premier ");
            }else{
             System.out.println(" le nombre " + nbr + " n'est pas premier ");
            }


    }
}
