import java.util.Scanner;

public class exo18 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
        int  a,b,x,y,r,ppcm;
        do {
            System.out.println(" entrer deux valeur ");
            a = scan.nextInt();
            b = scan.nextInt();
        } while (a < 0 && b < 0);
        if ( a > b ) {   // 84 60
            x = b;    //   x =    60
            r = a % b;  // r = 24
        }else {
            x = a;
            r = b % a;
        }

        while (r != 0) {
            y = x;//   60    24
            x = r;    //  24     12
            r = y % x ; //  12    12  0

        }
        ppcm =(a * b ) / x;
        System.out.println( " le pgcd de "+a+" et "+b+" est : "+x);
        System.out.println(" le ppcm de "+a +" et"+b +"est : "+ppcm);
    }
}
