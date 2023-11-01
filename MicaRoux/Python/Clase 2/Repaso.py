#LISTAS 
#En otros lenguajes las listas son los vectores o arreglos 
#En las listas se puede ingresar cualquier tipo de dato e incluso hasta otras listas
lista = [1,2,3] 
print(lista)
lista.append([4,5,6])
print(lista)
print(len(lista))

#Concatenamos listas 
lista1 = [1,2,3]
lista2 = [4,5,6]
lista3 = [7,8,9]
lista_def = lista1 + lista2 + lista3 
print(lista_def)
lista_def.extend([10,11,12])
print(lista_def)

print(lista_def.index(5)) #index te muestra el índice del elemento que le pasamos

#Cómo saber cuantos valores repetidos hay en una lista
print(lista_def.count(1))

#Cómo dar vuelta una lista (invertirla)
lista_def.reverse()
print(lista_def)

#multplicamos la lista repitiendo sus elementos 
print(lista_def *2)

# Métodos de ordenamiento 
listaa = [4,7,2,8,9]
lista_ordenada = sorted(listaa,reverse=True) #ordena descendentemente
print(lista_ordenada)

#TUPLAS 
tupla = (4,"Mono",8.76,[1,2,3,4]) #puede tener diferentes tipos de datos 
print(tupla)

print(4 in tupla) #su respuesta es del tipo booleana