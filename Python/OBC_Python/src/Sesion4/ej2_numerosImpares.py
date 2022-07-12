print("Escribe dos numeros, de menor a mayor, y yo te mostrare los numeros impares que hay de un numero a otro")

ini = int(input("Escribe el numero inicial" + '\n'))
fin = int(input("Escribe el numero final" + '\n'))

while ini > fin:
    print("El numero inicial no puede ser mayor al final")
    ini = int(input("Escribe el numero inicial" + '\n'))
    fin = int(input("Escribe el numero final" + '\n'))
    if ini < fin:
        break

while ini != fin:
    if ini % 2 != 0:
        print(ini)
        ini = ini + 1
        pass
    else:
        ini=ini+1
        pass