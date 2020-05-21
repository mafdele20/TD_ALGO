import math
def equation():

    a = int(input("entrer la valeur A \n"))
    b = int(input("entrer la valeur B\n"))
    c = int(input("entrer la valeur C\n"))


    delta =( b * b )- (4 * a * c)
    if (delta < 0) :
      print("Pas de solution dans l’ensemble R");

    else :
        if (delta == 0):
         x1 = -b / (2 * a)
         print("une solution est double : " + x1);
        else:
         x1 = (-b - math.sqrt(delta) ) / (2 * a);
         x2 = (-b + math.sqrt(delta)) / (2 * a);
         print("l'equation admet deux solution x1  : " +str(x1)+" et x2"+str(x2))


if __name__ == '__main__':
    equation()