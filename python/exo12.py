def parfait():
    nbr = -1
    diviseur = 0
    while nbr <=0:
     nbr=int(input("entre le nombre à tester"))
     i=1
     while i < nbr:
      if nbr % i == 0:
       diviseur = diviseur + i
      i += 1

    if diviseur == nbr:
          print(str(nbr)+" est un nombre parfait")
    else:
       print(str(nbr)+" est un nombre n'est pas parfait")


if __name__ == '__main__':
 parfait()