# Eliminamos  los elementos repetidos de ambas listas con conjuntos
conjunto1 = set(lista1)
conjunto2 = set(lista2)
conjuntos = conjunto1|conjunto2
solo1 = list(conjunto1 - conjunto2)   #Solo muestra los elementos del conjunto 1
solo2 = list(conjunto2 - conjunto1)   #Solo muestra el conjunto 2
interseccion = list(conjunto1 & conjunto2)   #mostramos lo elementos que coinciden en ambas listas 

print(f"1 lista de palabras que aparecen en la lista: {conjuntos}")
print(f"2 lista de palabras que aparecen en la primer lista, pero no en la segunda: {solo1}")
print(f"3 lista de palabras que aparecen en la segunda lista, pero no en la primera: {solo2}")
print(f"4 lista de palabras que aparecen en ambas listas: {interseccion}")
