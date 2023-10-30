#Ejercicio 1: Eliminar duplicados de una lista
#Escribir una lista y que a continuacion elimine los elemntos repetidos, por ultimo mostrar la lista

lista = [1,2,3,3,4,"Santiago", "Castro",4,5,6, "Castro",6,7,7,5,"Santiago"]

conjunto = set(lista)
lista = list(conjunto)

print(lista)
