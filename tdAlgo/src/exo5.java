import java.util.Scanner;

public class exo5 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int  i , somme ,val ;
        int n  = 5;

        somme = 0;
        for(i = 1 ;i<= n; i++){
            System.out.println("entrer un nombre entier ");
             val = scan.nextInt();
            somme = somme + val;
        }

        System.out.println(" la somme des 5 valeurs est"+somme);


    }
}
