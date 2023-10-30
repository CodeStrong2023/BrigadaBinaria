#Ejercicio 6: Modificar los elementos de una lista
#Llenar una lista con los numeros del 1 al 10, luego modificar los elementos
#de la lista multiplicandolos por un valor ingresado por el usuario.
#Creamos la lista
lista = list(range(1,11))
#Mostramos la lista
for i in lista:
    print(i,end="-")
#El usuario ingresa un número
multiplicador = int(input("\nIngrese un valor para multplicar la lista: "))
#Multiplicamos los elementos de la lista
for indice,i in enumerate(lista):
    lista[indice] *= multiplicador
print(f"Lista con los elementos modificados {multiplicador}")
for i in lista:
    print(i,end="-")
