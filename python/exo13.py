def date():


    jour= int(input("enter le jour "))
    mois =int(input("enter le mois "))
    annee = int(input("enter l'annee "))

    if ((jour < 1) or (jour > 31) or (mois < 1 or mois > 12)
            or ((mois == 2) and (((jour > 29 and (annee % 4 == 0)) or ((jour > 28 and
                                                                          (annee % 4 != 0))))))):
      print("la date est incorect "+str(jour)+ " jj "+str(mois)+" m "+str(annee));
    else:
     print("la date est correct")


if __name__ == '__main__':
    date()