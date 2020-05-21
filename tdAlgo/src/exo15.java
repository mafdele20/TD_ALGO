import java.util.Scanner;

public class exo15 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int nbr, somme ,i ;


        do {
            System.out.println(" Entrer un nombre");
            nbr = scan.nextInt();
        }while (nbr <0);

        somme  = 0;
        for (i =1 ;i <= nbr ;i++) {
            somme = somme + i;
        }
        System.out.println("La somme de 1 à "+nbr+" est : "+ somme);

    }
}
