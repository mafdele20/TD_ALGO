
def somme():
    tous = 0

    for i in range(5):
        val = -1
        while val <= 0:
         val = int(input("entrer une valeur entiere \n"))
         if val <=0 :
             print("veillez entrer une valeur positive\n")
         else:
          tous = tous +val
          break

    print(" la somme des 5 valeurs est :" +str(tous))


if __name__ == '__main__':
    somme()