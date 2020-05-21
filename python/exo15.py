def somme() :

    nbr=-1
    somme = 0
    while nbr < 0:
     nbr = int(input(" Entrer un nombre"))
    i =1
    while i  <= nbr :
     somme = somme + i
     i = i+1

    print("La somme de 1 à " + str(nbr)+ " est : " +str(somme))


if __name__ == '__main__':
        somme()