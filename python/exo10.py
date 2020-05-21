def comparaison():

        A = int(input(" Entrer une valeur\n"))
        B = int(input(" Entrer une valeur \n"))
        C = int(input(" Entrer une valeur \n"))

        if (A > B and B > C) :
            print("dans l’ordre on a " + str(A) + " ; " +str(B) + "\" et " + str(C));

        if (A > B and C > B) :
            print("dans l’ordre on a " + str(A) + " ;" + str(C) + " et " + str(B));

        if (B > A and A >C):
           print("dans l’ordre on a " +str(B) + " ;" +str(A) + " et " +str(C));

        if (B > C and C > A) :
            print("dans l’ordre on a " + str(B) + " ;" + str(C) + " et " + str(A));

        if (C > A and A > B):
            print("dans l’ordre on a " + str(C)  + " ;" + str(A)+ " et " + str(B));

        if (C > B and B > A) :
           print("dans l’ordre on a " + str(C)  + " ;" + str(B)+ " et " + str(A));

if __name__ == '__main__':
    comparaison()