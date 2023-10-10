# Ejercicio 2: Operaciones de conjunto con listas
# Escriba un programa que contenga 2 listas y que a continuacion
# cree las siguientes listas (en las que no deben haber repeticiones)
# 1 lista de palabras que aparecen en la lista
# 2 lista de palabras que aparecen en la primer lista, pero no en la segunda
# 3 lista de palabras que aparecen en la segunda lista, pero no en la primera
# 4 lista de palabras que aparecen en ambas listas

lista1 = ["Manzana","Coche","Montaña","Sol","Libro","Felicidad"]
lista2 = ["Perro","Sol","Manzana","Luna","Amistad","Felicidad"]

# Eliminamos elementos repetidos
conjunto1 = set(lista1)
conjunto2 = set(lista2)

#unimos los conjuntos
conjuntos = conjunto1|conjunto2
solo1 = list(conjunto1 - conjunto2)     # Muestra los elementos del conjunto 1
solo2 = list(conjunto2 - conjunto1)     # Muestra el conjunto 2
interseccion = list(conjunto1 & conjunto2)      # Muestra ambas listas

print(f"1 lista de palabras que aparecen en la lista: {conjuntos}")
print(f"2 lista de palabras que aparecen en la primer lista, pero no en la segunda: {solo1}")
print(f"3 lista de palabras que aparecen en la segunda lista, pero no en la primera: {solo2}")
print(f"4 lista de palabras que aparecen en ambas listas: {interseccion}")