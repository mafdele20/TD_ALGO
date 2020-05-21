import java.util.Scanner;

public class exo7 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
      int  montant, billet20, billet10, billet5, piece2, piece1 , rest,rest2,rest3,rest4 ;
        do {
            System.out.println(" entrer un montant");
             montant = scan.nextInt();
        }while (montant <0);

        rest = 0;

//215
        billet20  = ( montant /  20);
        rest= ( montant %  20);
        billet10  = ( rest  /  10);
        rest = ( rest %  10);
        billet5 = ( rest  /  5);
        rest = ( rest %  5);
        piece2 = ( rest /  2);
        piece1 = ( rest %  2);

        System.out.println(montant+" est composé de "+billet20+" billet de 20 ,"+billet10+" billet de 10 ,"+billet5+"billet de 5 ,"+piece2+"pieces de 2 et "
                +piece1+"piece de 1 ,");
    }
}
