# Un diccionario esta compuesto por dos elementos (una llave y un valor)
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
for termino in diccionario:   
    print(termino)

# Necesitamos una funcion para reccorrer un diccionario
for termino,valor in diccionario.items():       
    print(termino, valor)

# Otra manera de reccorrerlo
for termino in diccionario.keys():
    print(termino)      
for valor in diccionario.values():      
    print(valor)

# Comprobar un elemento en el diccionario
print("IDE" in diccionario)     

# Agregar un elemento al diccionario
diccionario["PK"] = 
print(diccionario)

# Eliminar un elemento
diccionario.pop("SABD")     
print(diccionario)

# Vaciar un diccionario
diccionario.clear()
print(diccionario)

#Eliminar un diccionario
del diccionario
# print(diccionario)
