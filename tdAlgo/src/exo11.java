import java.util.Scanner;

public class exo11 {

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int a, b ; int resultat = 0;

        String operateur ;

        System.out.println("saisir le premier nombre");
        a = scan.nextInt();

        System.out.println("saisir le deuxième nombre");
        b = scan.nextInt();

        do{
            System.out.println("Choisir l’operateur ");
            operateur = scan.next();

        }while(operateur == "+" && operateur == "-" && operateur == "*" && operateur != "/");

        if (operateur.equalsIgnoreCase("-")){
            resultat = a - b;
            System .out.println(" le resultat est : "+ resultat);

        }
        if(operateur.equalsIgnoreCase("+")) {
            resultat = a + b;
            System .out.println(" le resultat est : "+ resultat);

        }
        if (operateur.equalsIgnoreCase("*")) {
            resultat = a * b;
            System .out.println(" le resultat est : "+ resultat);

        }
        if (operateur.equalsIgnoreCase("/")) {
            if(b == 0){
                    System.out.println("impossible");
            }else {
                resultat = a / b;
                System .out.println(" le resultat est : "+ resultat);

            }
        }

    }
}
