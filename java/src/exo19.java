import java.util.Scanner;

public class exo19 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tab[] = new int[500];
        int i, n, somme;
        do {
            System.out.println(" Entrer le nombre d’article ");
            n = scan.nextInt();
        } while (n < 0);
        for (i = 1; i <= n; i++) {
            System.out.println(" Entrer Le prix de l’article numero " + i);
            tab[i] = scan.nextInt();
        }
        somme = 0;
        for (i = 1; i <= n ; i++) {
            if (tab[i] % 10 == 0) {
                somme = somme + tab[i];
            }
        }
        System.out.println(" la somme des prix d’article dont le prix se termine par zero est : " + somme);

    }
}