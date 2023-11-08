seleccionArgentina = {
    10:{"Nombre": "Lionel Messi", "Edad": 35, "Altura": 1.70, "Precio": "50 millones","Posición":"Extremo derecho"},
    24:{"Nombre": "Angel Di Maria", "Edad": 34, "Altura": 1.80, "Precio": " 12 millones","Posición":"Extremo derecho "},
    23:{"Nombre": "Paulo Dybala", "Edad": 28, "Altura": 1.77, "Precio": "35 millones","Posición":"Media Punta"},
    9:{"Nombre": "Nicolas Otamendi", "Edad": 34, "Altura": 1.83, "Precio": "3.5 millones","Posición":"Defensa Central"},
    11:{"Nombre": "Franco Armani", "Edad": 35, "Altura": 1.89, "Precio": "3.5millones","Posición":"Portero"}
}
print(seleccionArgentina) 
print(f"\nMostramos únicamente a Messi {seleccionArgentina[10]}") #Le pedimos que muestre a Messi 
print("\nMostramos únicamente los valores")
#Mostramos a todos los jugadores de manera ordenada (únicamente los valores, sin llaves)
for jugador in seleccionArgentina.values():
    print(jugador)
print("\nMostramos las llaves y los valores")
for jugador in seleccionArgentina.items(): 
    print(jugador)
