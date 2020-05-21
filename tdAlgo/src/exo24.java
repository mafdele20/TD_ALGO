import java.util.Scanner;

public class exo24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, n =0, t;

        System.out.println("entre le nombre  à deviner ");
         a = scan.nextInt();

         while (a != n) {

            System.out.println("deviné le nombre ");
            n = scan.nextInt();
            if (a > n) {
                System.out.println(" trop petit ");
            } else if (a < n){
                System.out.println(" trop grand ");

            }else
            System.out.println("Youpiii nombre trouvé ");

        }
    }
}
