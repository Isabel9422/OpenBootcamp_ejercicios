n=int(input("Introduce un numero y averiguaré si es primo o no"+'\n'))

while(n<100):
    if(n==2)or(n==3)or(n==5)or(n==7)or(n==11):
        print(str(n)+" Es primo")
        n=n+1
    elif(n%2==0)or(n%3==0)or(n%5==0)or(n%7==0)or(n%11==0):
        print(str(n)+" No es primo")
        n=n+1
    else:
        print(str(n)+" Es primo")
        n=n+1