import java.util.Scanner;

public class exo1{

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int a ,b,rt,qe ;
        double qr ;

        do {

            System.out.println("entrer le dividende");
            a = scan.nextInt();

          }while(a < 0);

        do {

            System.out.println("’entrer le diviseur ");
            b = scan.nextInt();

        }while(b > a);

        rt = a % b;
        qe =  a / b;
        qr =  (double)a / (double) b;
        System.out.println("les quotient entier : "+qe) ;
        System.out.println("’ le reste est : "+rt);
        System.out.println("les quotient reel : "+qr);


    }
}
