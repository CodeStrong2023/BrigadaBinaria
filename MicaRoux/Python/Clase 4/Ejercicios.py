''' Ejercicio 1: Eliminar duplicado de una lista 
Escriba un programa donde tenga una lista y que a continuación 
elimine los elementos repetidos, por último mostrar la lista 
'''
print("\nEJERCICIO 1")
lista_duplicados = [234567890,'hola', 'Angi', 'rata','mundo','hola',3.7,9,5,3,5]
print(f"LISTA COMPLETA CON DUPLICADOS: {lista_duplicados}")
lista_sin_duplicados = list(set(lista_duplicados)) #utilizamos un conjunto para elimar duplicados 
print(f"Lista sin duplicados por set set {lista_sin_duplicados}")

lista_sin_duplicados2 = []
for elemento in lista_duplicados:
    if elemento not in lista_sin_duplicados2:
        lista_sin_duplicados2.append(elemento)
print(f"Lista sin duplicados por sentencia if {lista_sin_duplicados2}")


''' Ejercicio 2: Operaciones de conjuntos con listas 
Escriba un programa donde tenga 2 listas y que cree las siguientes listas 
1 Lista de palabras que aparecen en las listas 
2 Lista de palabras que aparecen en la primera lista, pero no en la segunda
3 Lista de palabras que aparecen en la segunda lista, pero no en la primera
4 Lista de palabras que aparecen en ambas listas
'''
print("\nEJERCICIO 2") #Lo hice pensando en que al decir palabras eran únicamente strings :)
lista1 = ["Adidas","Nike","Zara",215,65.6,"Gmail","Drive",1,2,3,4,12,3]
lista2 = [1,4,"Drive","GitHub","Telegram",425,634,"Gmail",457,585,86]

#Lista de palabras que aparecen en las listas
total_palabras = []
for elemento in lista1: 
    if isinstance(elemento, str):
        total_palabras.append(elemento)
for elemento in lista2: 
    if isinstance(elemento, str) and elemento not in lista1:
        total_palabras.append(elemento) 
print(f"Lista de palabras que aparecen en las listas {total_palabras}")

#Lista de palabras que aparecen en la primera lista, pero no en la segunda
palabras_primera_lista = []
for elemento in lista1: 
    if isinstance(elemento, str):
        palabras_primera_lista.append(elemento)
print(f"Lista de palabras de la primera lista {palabras_primera_lista}")

#Lista de palabras que aparecen en la segunda lista, pero no en la primera
palabras_segunda_lista = []
for elemento in lista2: 
    if isinstance(elemento, str):
        palabras_segunda_lista.append(elemento)
print(f"Lista de palabras de la segunda lista {palabras_segunda_lista}")

#Lista de palabras que aparecen en ambas listas 
palabras_repetidas = []
for elemento in lista1: 
    if elemento in lista2 and isinstance(elemento,str):
        palabras_repetidas.append(elemento)
print(f"Lista de palabras que se repiten en ambas listas {palabras_repetidas}")


''' Ejercicio 3: Agregar personajes a una lista 
Escriba un programa donde cree una lista con los siguientes personajes del señor de los anillos
Nombre: Aragon
Clase: Guerrero
Raza: Dúnadan del norte

Nombre: Gandalf 
Clase: Mago
Raza: Istar

Nombre: Legolas
Clase: Arquero 
Raza: Elfo Sindar
'''
print("\nEJERCICIO 3")
characters_lord_of_the_rings = [
    {"Nombre": "Aragorn", "Clase": "Guerrero", "Raza":"Dúnadan del norte"},
    {"Nombre": "Gandalf", "Clase": "Mago", "Raza":"Istar"},
    {"Nombre": "Legolas", "Clase": "Arquero", "Raza":"Elfo Sindar"}
]
#Agregamos 2 personajes más a la lista 
nuevos_personajes = [
    {"Nombre": "Gollum", "Clase": "Corrompido", "Raza":"Hobbit"},
    {"Nombre": "Bilbo Bolsón", "Clase": "Albo", "Raza":"Hobbit"},
    {"Nombre": "Galadriel", "Clase": "Princesa", "Raza":"Elfos noldor"},
]
print("LISTA COMPLETA DE PERSONAJES")
characters_lord_of_the_rings.extend(nuevos_personajes)
for personaje in characters_lord_of_the_rings:
    print(personaje)
print(f"La cantidad actual de personajes de la lista es de: {(len(characters_lord_of_the_rings))}")
#También se pueden escribir los personajes en distintos diccionarios y con append ir agregándolos a una lista