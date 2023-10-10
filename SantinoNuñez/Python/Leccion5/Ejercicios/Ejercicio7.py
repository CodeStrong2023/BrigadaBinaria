"""
Ejercicio 7: jueg adivina el número
Realizar un juego para adivinar un número. Para ello se debe generar
un número aleatorio entre 1-100, y luego ir pidiendo números indicando
si es mayor o menor segun el número aleatorio.
El proceso termina cuando el usuario acierta y se muestran los intentos
"""
import random

aleatorio = random.randint(0,100)
contador = 0

while True:
    numero = int(input("Digite un número: "))
    contador += 1
    if numero < aleatorio:
        print("El número es mayor")
    elif numero < aleatorio:
        print("El número es menor")
    else:
        break   # Rompe el ciclo y el bucle

print(f"  FELICIDADESAcertó en {contador} intentos")