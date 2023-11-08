'''
Ejercicio 7: juego adivina el número
Realizar un juego para adivinar un número. Para ello se debe
 generar un número aleatorio entre 1-100, y luego ir pidiendo números indicando
Si es mayor o menor según el número aleatorio.
El proceso termina cuando el usuario acierta y allí se debe mostrar el número de intentos.
'''
import random

aleatorio = random.randint(0,100)
contador = 0

while True:
    numero = int(input("Digite un número: "))
    contador += 1
    if numero < aleatorio:
        print("No es el número , digite un número menor ")
    elif numero < aleatorio:
        print("No es el número , digite un número mayor")
    else:
        break   # Rompe el ciclo y el bucle

print(f"  FELICIDADES, acabas de adivinar el número {contador} intentos")
