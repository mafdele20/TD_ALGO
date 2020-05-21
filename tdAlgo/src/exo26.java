import javafx.scene.control.Tab;

import java.util.Scanner;

public class exo26 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int tab[]= new int[100] ;

        int i ,crx, decrx;

        for (i=1;i <=5;i++) {
            System.out.println("entrer un nombre");
            tab[i] = scan.nextInt();
        }
        crx = 0;
        decrx = 0;
        for (i=0;i < 5;i++) {

            if (tab[i] <= tab[i]+1 ) {
                crx = crx++;
            } else if (tab[i] >= tab[i]+1) {
                decrx = decrx++;
            }else {
                crx =   0;
                decrx =  0;
            }

        }
        if( crx == 5) {
            System.out.println("Les valeurs sont saisies dans l’ordre croissant");
        }else if ( decrx == 5 ) {
          System.out.println("Les valeurs sont saisies dans l’ordre decroissant");
        }else {
            System.out.println("Les valeurs sont saisies dans l’ordre quelconque");
        }
    }
}
