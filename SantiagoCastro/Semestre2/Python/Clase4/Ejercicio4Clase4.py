import math
#Ejercicio de matematica - Sacamos la raiz cuadrada de un numero positivo

#El usuario ingresa un valor
numero = int(input("Ingrese un numero: "))
while (numero < 0):
    print("ERROR-Deberia ser un numero positivo")
    numero = int(input("Ingrese un numero"))
#Utilizamos la clase math
print(f"\n Su raiz cuadrada es {math.sqrt(numero):.2f}")