##Ejercicio 4: Juego adivina el numero
#Realizar un juego para adivinar un numero.Para ello se debe generar un número aleatorio entre 1 - 100,
#y luego ir pidiendo números indicando si "es mayor" o "es  menor" segun sea mayor o menor con respecto a N.
#El proceso termina cuadno el usuario acierta y allí se debe mostrar el numero de intentos
import random

aleatorio = random.randint(0,100)
num = int(input("Ingrese un numero:"))
contador = 0
while num != aleatorio:
    if num < aleatorio:
        print("\nDebe ingresar un número mayor")
        num = int(input("\nIngrese otro numero: "))
        contador+=1
    elif num > aleatorio:
        print("\nDebe ingresar un numero menor")
        num = int(input("\nIngrese otro numero: "))
        contador+=1

print(f"\nCORRECTO,el numero era {aleatorio}")
print(f"Lo lograste en {contador} intentos")