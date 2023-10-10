# Ejercicio 2: modificar los elementos de una lista
# llenar una lista con los numeros del 1 al 10, luego modificar
# los elementos de la lista multiplicandolos por un valor ingresado por el usuario

lista = list(range(1,11))
print(f"Lista {lista}")
numero = int(input("Ingrese un número a multiplicar: "))

# Multiplicamos cada elemento (indice)
for indice,i in enumerate(lista):   # Utilizamos enumerate para trabajar con los elementos de la lista (indice)
    lista[indice] *= numero         # El iterador (i) solo recorre los imdices

print(f"La lista multiplicada por {numero} es: ")
for i in lista:
    print(i, end=" ")