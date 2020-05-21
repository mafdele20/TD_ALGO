import java.util.Scanner;

public class exo20 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int tab[] = new int[100];
        int i , max, position ;
        for (i = 1; i <= 10; i++) {
            System.out.println(" Entrer  un nombre");
            tab[i] = scan.nextInt();
        }
        max = 0;
        position =0;
        for (i = 1; i <= 10; i++) {
            if (tab[i] > max) {
                max = tab[i];
                position =i;
            }
        }
        System.out.println("le plus grand noùmbre est :"+max+" et sa position est :"+position);
    }
}
