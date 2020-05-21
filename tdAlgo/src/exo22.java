import java.util.Scanner;
public class exo22 {

    public static void main(String [] args){
        Scanner scan = new Scanner(System.in);
       int Tab [] = new int[100];
       int     i, long_seq ,seq_prec ,N  ,position  ,max_seq = 0 ;
        do {
            System.out.println(" Entrer un nombre entier compris entre 10 et 50 ");
            N= scan.nextInt();
        }while (N < 10 || N > 50);


       for (i=1;i <=N;i++){

           do {
               System.out.println(" Entrer un nombre entier compris entre 1 et 100 "  );
               Tab[i] = scan.nextInt();
           }while (Tab[i]   <  1 || Tab[i]   > 100);
       }


        position = 0 ;
        max_seq = 0 ;
        seq_prec = 0;
        long_seq = 1 ;
        for (i=1;i <=N;i++){
        if (Tab[i] <= Tab [i + 1]){
                long_seq = long_seq + 1;
            }else{
                if(max_seq < long_seq) {
                    max_seq = long_seq;
                    seq_prec = seq_prec + long_seq;
                    position = seq_prec - long_seq + 1;
                }
                long_seq =1;
            }
        }
        System.out.println("la séquence la plus longue a une longueur de "+max_seq+" et commance par :"+position);
    }
}
