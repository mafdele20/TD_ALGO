def vol():



    hhD = int(input ("Entrer l' heure de depart \n"))
    mnD = int(input("Entrer les minutes de depart \n"))
    ssD = int(input ("Entrer  les secondes depart \n"))
    hhA = int(input("Entrer l' heure d'arrivee \n"))
    mnA = int(input("Entrer les minutes d'arrivee \n"))
    ssA = int(input("Entrer  les seconde d'arrivees "))
    if (hhD < 0 or hhD >= 24 ) and (mnD < 0 or mnD >= 60) and (ssD < 0 or ssD >= 60) and (hhA < 0 or hhA >= 24) and (mnA < 0 or mnD >= 60) and (ssD < 0 or ssD >= 60):
     print("l'un des heure saisi est invalid")
    else:
      nbrssD = (hhD * 3600) + (mnD * 60) + ssD
      nbrssA = (hhA * 3600) + (mnA * 60) + ssA
     #version a
      if hhA >= hhD :
            difference = nbrssA - nbrssD
            dhh = difference / 3600
            reste = difference % 3600
            dmn = reste / 60
            dss = reste % 60
            print("la durée du vol si le depart et l’arrivee se tiennent à la meme journée est:"
            +str(dhh)+ "hh:"+str(dmn)+"mn:"+str(dss)+"ss")

     #version b
      else:
       nbrssA  = nbrssA +(24 * 3600)
       difference = nbrssA- nbrssD
       dhh = difference // 3600
       reste = difference % 3600
       dmn = reste // 60
       dss = reste % 60
       print("la durée du vol si le l’arrivee\n" +
            "se tienne le lendemain est: " +str(dhh)+" hh:"+str(dmn)+" mn:"+str(dss)+"ss:")

if __name__ == '__main__':
    vol()