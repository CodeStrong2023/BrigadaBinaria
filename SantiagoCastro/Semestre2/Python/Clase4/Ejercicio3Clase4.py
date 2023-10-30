#Ejercicio 3: Argegar personajes a una lista.
#Escribir un programa donde cree una lista con los siguientes personajes del señor de los anillos

#Nombre: Aragon
#Clase: Guerrero
#Raza: Dúndan del norte

#Nombre: Gandalf
#Clase: Mago
#Raza: Istar

#Nombre: Legolas
#Clase: Arquero
#Raza: Elfo Sindar

personajes = []
#Creamos el personaje
Personaje1 = {
    "Nombre": "Aragon",
    "Clase": "Guerrero",
    "Raza": "Dúndan del norte"
}
#Lo agregamos a la lista
personajes.append(Personaje1)
#Creamos otro personaje
Personaje2 = {
    "Nombre": "Gandalf",
    "Clase": "Mago",
    "Raza": "Istar"
}
##Lo agregamos a la lista
personajes.append(Personaje2)
#Creamos otro personaje
Personaje3 = {
    "Nombre": "Legolas",
    "Clase": "Arquero",
    "Raza": "Elfo Sindar"
}
#Lo agregamos a la lista
personajes.append(Personaje3)
#Creamos otro personaje
Personaje4 = {
    "Nombre": "Frodo Bolsón",
    "Clase": "(No encontré)",
    "Raza": "Hobbit"
}
#Lo agregamos a la lista
personajes.append(Personaje3)
#Creamos otro personaje
Personaje5 = {
    "Nombre": "Gollum",
    "Clase": "(No encontré)",
    "Raza": "Hobbit"
}
#Lo agregamos a la lista
personajes.append(Personaje3)
#Creamos otro personaje
Personaje6 = {
    "Nombre": "Sauron",
    "Clase": "(No encontré)",
    "Raza": "Maiar (Ainur)"
}
#Lo agregamos a la lista
personajes.append(Personaje3)
#Mostramos los personajes
print(personajes)
