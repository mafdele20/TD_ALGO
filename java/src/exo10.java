import java.util.Scanner;

public class exo10 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int A, B, C;

        System.out.println(" Entrer les valeurs à comparer");
        A = scan.nextInt();
        B = scan.nextInt();
        C = scan.nextInt();
        if (A > B && B > C) {
            System.out.println("dans l’ordre on a " + A + " ; " + B + "\" et " + C);
        }
        if (A > B && C > B) {
            System.out.println("dans l’ordre on a " + A + " ;" + C + " et " + B);
        }
        if (B > A && A >C){
        System.out.println("dans l’ordre on a " + B + " ;" + A + " et " + C);
        }
        if (B > C && C > A) {
            System.out.println("dans l’ordre on a " + B + " ;" + C + " et " + A);

        }

        if (C > A && A > B){
            System.out.println("dans l’ordre on a " + C  + " ;" + A+ " et " + B);

        }
        if (C > B && B > A) {
        System.out.println("dans l’ordre on a " + C  + " ;" + B+ " et " + A);

        }
    }
}
