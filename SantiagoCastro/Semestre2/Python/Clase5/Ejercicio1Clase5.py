#Ejercicio 1:Sumar pares dentro de un rango
#Hacer un rango para sumar números pares dentro de un rango, suma de numeros pares del 2 al 30
#por ejemplo:
#                       suma de numeros pares del 2 al 30
#                       suma = 240

inicio = int(input("Ingrese el valor de donde va a comenzar la suma: "))
final = int(input("Ingrese el valor de hasta donde va a llegar la suma: "))

suma = 0

for i in range(inicio,final+1):
    if i % 2 == 0:
        suma += i
print(f"\nLa suma de los numeros pares dentro del rango es: {suma}")