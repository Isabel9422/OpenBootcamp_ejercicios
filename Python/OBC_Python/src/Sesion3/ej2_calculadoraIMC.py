import math

peso= int(input("Introduce tu peso" + '\n'))
altura= float(input("Introduce tu altura"+'\n'))

print(type(peso))
print(type(altura))

def calculoimc(peso,altura):
    imc=peso/(math.pow(altura,2))
    return imc

print("Tu índice de masa corporal es :")
print(round(calculoimc(peso,altura),2))