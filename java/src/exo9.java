import java.util.Scanner;

public class exo9 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);


        int  hh1,mn1,ss1,hh2,mn2,ss2,difference, reste, difhh, difmn,ds,nbrssD,nbrssA ,dhh,dmn = 0,dss;

        do {
            System.out.println("Entrer l' heure du heure de depart ");
            hh1 = scan.nextInt();
        }while(hh1 < 0 || hh1 >= 24);
            do {
                System.out.println("Entrer  minutes du heure de depart");
                mn1 = scan.nextInt();
            }while (mn1 <   0 ||  mn1  >= 60);
          do {
              System.out.println("Entrer  secondes du heure de depart ");
              ss1 = scan.nextInt();
          }while (ss1 < 0 || ss1  >= 60 );

        do {
            System.out.println("Entrer l' heure du heure de d'arrivee ");
            hh2 = scan.nextInt();
        }while(hh2 < 0 || hh2 >=  24);
        do {
            System.out.println("Entrer  minutes du heure d'arrivee");
            mn2 = scan.nextInt();
        }while (mn2 <   0 ||  mn2  >= 60);
        do {
            System.out.println("Entrer  secondes du heure d'arrivee ");
            ss2 = scan.nextInt();
        }while (ss2 < 0 || ss2 >= 60);


        nbrssD  = (hh1 * 3600) + (mn1 * 60 )+ ss1;
        nbrssA  = (hh2 * 3600) +( mn2 * 60 )+ ss2;

        //version a
        if( hh2 >=hh1 ) {
            difference = nbrssA - nbrssD;
            dhh = difference / 3600;
            reste = difference % 3600;
            dmn = reste / 60 ;
            dss = reste % 60;
            System.out.println("la durée du vol si le depart et l’arrivee se tiennent à la meme journée est:"
                    +dhh+ "hh:"+dmn+"mn:"+dss+"ss");
            //version b
        }else {
            nbrssA  = nbrssA + 24 * 3600;
            difference =nbrssA - nbrssD ;
            dhh = difference / 3600;
            reste = difference % 3600;
            dmn = reste / 60;
            dss = reste % 60;
            System.out.println("la durée du vol si le l’arrivee\n" +
                    "            se tienne le lendemain est: " +dhh+" hh:"+dmn+" mn:"+dss+"ss:");

        }

    }
}
