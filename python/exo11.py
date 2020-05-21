def operation():
    a = int(input("saisir le premier nombre"))

    b = int(input("saisir le deuxième nombre"))
    operateur = ""
    while operateur == "":
     operateur = input("Choisissez votre oprerateur: ")
    if operateur not in ["+","-","/","*"]:
            print("Choix incorrect !")

    if(operateur == "-"):
         resultat = a - b
         print(" le resultat est : "+str(resultat))
         print("Choisir l’operateur ")

    if (operateur == "+") :
         resultat = a + b
         print(" le resultat est : "+str(resultat))

    if (operateur=="*") :
          resultat = a * b
          print(" le resultat est : "+ resultat)

    if (operateur=="/"):
     if (b == 0):
               print("impossible")
     else:
        resultat = a / b
        print(" le resultat est : "+ str(resultat))

if __name__ == '__main__':
 operation()