from math import sqrt
def distance():

         x1=int(input(" entrer la premiere coordonnée du point A\n"))
         y1=int(input(" entrer la deuxieme coordonnée du point A\n"))
         x2=int(input(" entrer la premiere coordonnée du point B\n"))
         y2=int(input(" entrer la deuxieme coordonnée du point B\n"))
         dis = (((x1 - x2)*2) + ((y1-y2)*2))
         if dis < 0:
           print("imposible")
         else:
           sqrte = sqrt(dis)
           print("la distance entre A et B est "+str(sqrte))


if __name__ == '__main__':
    distance()