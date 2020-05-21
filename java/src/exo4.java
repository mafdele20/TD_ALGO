import java.util.Scanner;

import static java.lang.Math.pow;

public class exo4 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);

        double puiss, x ;
        int n , i ;

//version 1
        System.out.println("entre un nombre  entier ");
        n = scan.nextInt();
        System.out.println(" entrer un nombre reel");
         x = scan.nextDouble();
        System.out.println(x+" a la puissance "+n+" est : "+pow(x,n));

// version 2
        puiss  =  1;
        for(i = 1 ;i<= n; i++){
            puiss = puiss * x;

        }

        System.out.println(x+"a la puissance"+n+ " est : "+ puiss);

    }
}
