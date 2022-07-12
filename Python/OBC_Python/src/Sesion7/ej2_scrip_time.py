import time

#
"""
Importamos el modulo time, para realizar un script que al ejecutarse, nos diga cuantas horas quedan para las 19 y si son las 19
imprime un mensaje por consola de que es hora de ir a casa
"""

if(time.localtime().tm_hour==19):
    print("Hora de ir a casa !")
else:
    horasRestantes=19-time.localtime().tm_hour
    print("Quedan "+ str(horasRestantes) + " horas de trabajo")