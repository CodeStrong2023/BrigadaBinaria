La tarea consiste en ingresar elementos al diccionario llamado seleccionArgentina, 
los elementos a ingresar deben ser como mínimo 4, 
estos elementos son los jugadores con su número de :
camiseta, nombre, apellido, edad, altura, precio y posición de juego
'''
seleccionArgentina = {
    10:{"Nombre": "Lionel Messi", "Edad": 36, "Altura": 1.70, "Precio": "280 millones","Posición":"Delantero"},
    24:{"Nombre": "Enzo Fernández", "Edad": 22, "Altura": 1.78, "Precio": "121 millones","Posición":"Centrocampista"},
    23:{"Nombre": "Emiliano Martínez", "Edad": 31, "Altura": 1.95, "Precio": "28 millones","Posición":"Arquero"},
    9:{"Nombre": "Julián Álvarez", "Edad": 23, "Altura": 1.70, "Precio": "60 millones","Posición":"Delantero"},
    11:{"Nombre": "Ángel Di María", "Edad": 35, "Altura": 1.78, "Precio": "75 millones","Posición":"Centrocampista"}
}
print(seleccionArgentina) #Se muestran de manera desordenada 
#Se pueden mostrar de a uno

print(f"\nMostramos únicamente a Messi {seleccionArgentina[10]}") #Le pedimos que muestre a Messi 

print("\nMostramos únicamente los valores")
#Mostramos a todos los jugadores de manera ordenada (únicamente los valores, sin llaves)
for jugador in seleccionArgentina.values():
    print(jugador)

print("\nMostramos las llaves y los valores")
for jugador in seleccionArgentina.items(): #muestra las llaves y los valores
    print(jugador)
    
#Agregamos 4 jugadores más al diccionario 
nuevos_jugadores = {
        7:{"Nombre": "Rodrigo de Paul", "Edad": 29, "Altura": 1.80, "Precio": "37 millones","Posición":"Centrocampista"},
        22:{"Nombre": "Lautaro Martínez", "Edad": 26, "Altura": 1.74, "Precio": "80 millones","Posición":"Delantero"},
        3:{"Nombre": "Nicolás Tagliafico", "Edad": 31, "Altura": 1.72, "Precio": "15 millones","Posición":"Defensa"},
        15:{"Nombre": "Ángel Correa", "Edad": 28, "Altura": 1.71, "Precio": "25 millones","Posición":"Delantero"}
}
seleccionArgentina.update(nuevos_jugadores)
print("\nDICCIONARIO ACTUALIZADO")
for jugador in seleccionArgentina.items():
    print(jugador)
    
print(f"La cantidad de jugadores en la lista actualmente es de: {len(seleccionArgentina)}") #Para mostrar la cantidad de jugadores del diccionario

#Otra forma de recorrer un diccionario
print("\nOtra forma de recorrer un diccionario") 
for i in seleccionArgentina:
    print(f"{i}-> {seleccionArgentina[i]}")