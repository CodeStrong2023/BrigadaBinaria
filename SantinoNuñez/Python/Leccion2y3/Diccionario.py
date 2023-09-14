#
# Un diccionario tiene dos elementos (llave y valor)
# dict( key, value)
# "Maradona": 10
diccionario = {
    "IDE": "Integrated Development Enviroment",
    "POO": "Programacion Orientada a Objetos",
    "SABD": "Sistema de Administracion de Base de Datos"
}
print(diccionario)
# Ver la cantidad de elementos del diccionario
print(len(diccionario))

# Acceder a un diccionario con la llave(key)
print(diccionario["SABD"])

# Forma de recuperar un dato
print(diccionario.get("POO"))
print(diccionario.get("IDE"))

# Modificar un elemento
diccionario["IDE"] = "Entorno de desarrollo integrado"
print(diccionario["IDE"])

# Como recorrer los elementos
for termino in diccionario:    # Recorre solo las llaves (keys)
    print(termino)

# Necesitamos una funcion para reccorrer un diccionario
for termino,valor in diccionario.items():       # Recorre tanto la llave como el elemento (key,value)
    print(termino, valor)

# Otra manera de reccorrerlo
for termino in diccionario.keys():
    print(termino)      # Muestra solo las llaves, pero recorre todoel diccionario

for valor in diccionario.values():      # Muestra solo los valores
    print(valor)

# Comprobar un elemento en el diccionario
print("IDE" in diccionario)     # Devuelve un Booleano

# Agregar un elemento al diccionario
diccionario["PK"] = "Primari key"
print(diccionario)

# Eliminar un elemento
diccionario.pop("SABD")     # Elimina la key como el valor
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar un diccionario
del diccionario
# print(diccionario)


            # Leccion 3: Repaso de diccionarios
# Repaso Diccionarios
colores={"azul":"blue","rojo":"red","verde":"green","amarillo":"yellow"}
print(colores)

# Eliminar un elemento
del (colores["azul"])
print(colores)

# Agregar diferentes tipos de datos
diccionario2={"santino":{"edad":18,"altura":1.60},"angelina":[19,1.62],"santiago":[20,1.64]}
print(diccionario2)

        # Actividad diccionario Seleccion Argentina
# La tarea consiste en ingresar elementos al diccionario llamado seleccionArgentina,
# lo elementos a ingresar deben ser como mínimo 4, estos elementos son los jugadores con su número de camiseta,
# nombre, apellido, edad, altura, precio y posición de juego, por supuesto ver el video anterior.

seleccionArgentina={
    10:{"Nombre":"Lionel Andres Messi", "Edad":36, "Altura":1.70, "Salario":"55 millones", "Posición":"Delantero"},
    17:{"Nombre":"Alejandro Garnacho", "Edad":19, "Altura":1.80, "Salario":"1 millón", "Posición":"Delantero"},
    23:{"Nombre":"Emiliano Martínez", "Edad":31, "Altura":1.95, "Salario":"5 millones", "Posición":"Arquero"},
    27:{"Nombre":"Julián Álvarez", "Edad":23, "Altura":1.70, "Salario":"4 millones", "Posición":"Delantero"},
    11:{"Nombre":"Ángel Di María", "Edad":35, "Altura":1.78, "Salario":"15 millones", "Posición":"CCentrocampista"},
    7:{"Nombre":"Rodrigo de Paul", "Edad":29, "Altura":1.80, "Salario":"2 millones", "Posición":"Centrocampista"},
    21:{"Nombre":"Paulo Dybala", "Edad":29, "Altura":1.77, "Salario":"5 millones", "Posición":"Delantero"},
    20:{"Nombre":"Alexis Mac Allister", "Edad":24, "Altura":1.76, "Salario":"2 millones", "Posición":"Centrocampista"}
}
print(seleccionArgentina)
print(seleccionArgentina[27])
print(seleccionArgentina.values())

# Recorremos el diccionario
for llaves in seleccionArgentina:       # Mostramos solo las key
    print(llaves)

for values in seleccionArgentina.values():       # Mostramos solo los valores
    print(values)

for llaves,values in seleccionArgentina.items():       # Mostramos tódo el diccionario
    print(values)

print("Jugadores cargados: ", end="")
print(len(seleccionArgentina))      # Cantida de valores
