import java.util.Scanner;

public class Exo3v2 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);


        double R1, R2, R3, rserie, rpara, frqserie, frqpara;
        int  choix;

        System.out.println("entre la resistance R1");
         R1 = scan.nextDouble();

        System.out.println("entre la resistance R2");
        R2 = scan.nextDouble();
        System.out.println("entre la resistance R3");
        R3 = scan.nextDouble();
        rserie = R1 + R2 + R3;
        rpara = (R1 * R2 * R3) / (R1 * R2 + R2 * R3 + R1 * R3);

          do {
              System.out.println("faites votre choix\n" +
                      "              1 ->fréquence en série\n" +
                      "              2 - > fréquence en parallèle  ‘’");
               choix = scan.nextInt();
          }while (choix <1 || choix > 2);


        if (choix == 1) {

            frqserie  = (R1 / rserie) + (R2 / rserie) + (R3 / rserie);
            System.out.println("la fréquence en serie est: "+frqserie );

        }else {
            frqpara = (R1 / rpara) + (R2 / rpara) + (R3 / rpara);
            System.out.println("la fréquence en parallèle est: "+frqpara);
        }


    }
}
