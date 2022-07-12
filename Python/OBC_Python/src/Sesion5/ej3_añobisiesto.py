
año=int(input("Escribe el año, y averiguaré si es bisiesto o no:" + '\n'))

if(año%4==0)and((año%400==0)or(año%100!=0)):
    print("El año " + str(año) + " es bisiesto")
else:
    print("El año " + str(año) + " no es bisiesto")