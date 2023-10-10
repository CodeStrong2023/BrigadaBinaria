# Ejercicio 3: agregar personas a una lista
# Escriba un prgrama donde cree una lista con los personajes del señor de los anillos
# Nombre: Aagon
# Clase: Guerrero
# Raza: Dúndan del norte

# Nombre: Gandalf
# Clase: Mago
# Raza: Istar

# Nombre: Legolas
# Clase: Arquero
# Raza: Elfo Sindar

personajes = [] # Lista vacia
p1= {"Nombre": "Aagon","Clase": "Guerrero", "Raza": "Dúndan del norte"}
personajes.append(p1)   # Agregamos un personaje a la lista
p2= {"Nombre": "Gandalf","Clase": "Mago","Raza": "Istar"}
personajes.append(p2)
p3= {"Nombre": "Legolas","Clase":"Arquero","Raza":"Elfo Sindar"}
personajes.append(p3)
print(personajes)

# Tarea: agregar otros 3 personajes a eleccion
# Creo otra lista XD

personajes= []
p= {"Nombre": "Gollum","Clase": "Criatura","Raza": "Hobbit corrompido por el Anillo"}
personajes.append(p)   # Reutilizamos la variable (p)
p= {"Nombre": "Legolas","Clase": "Arquero","Raza": "Elfo Sindar"}
personajes.append(p)
p= {"Nombre": "Galadriel","Clase": "Dama de la Luz","Raza": "Elfo Noldor"}
personajes.append(p)
print(personajes)