def main() :
    a =-1 ; b = -1
    while a <= 0 :
     a = int(input("entrer le dividende \n"))


    while b <= 0:
      b = int(input("entrer le diviseur\n"))
     # reste


    rt = a % b
    qe = a // b
    qr = a / b
    print("les quotient entier : " + str(qe))
    print("les quotient reel : " + str(qr))
    print("’ le reste est : " + str(rt))

if __name__ == '__main__':

   main()