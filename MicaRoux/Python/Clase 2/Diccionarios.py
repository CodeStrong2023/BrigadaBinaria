#son una colección que tienen claves y valores 
#key and value 
diccionario = {
    "Jugo":"bebida",
    "Fideos":"comida",
    "Durazno":"postre"
}
print(len(diccionario))
print(diccionario)

#cómo acceder a un diccionario con la clave(key)
print(diccionario["Jugo"])
print(diccionario.get("Fideos"))

#modificamos los elementos 
diccionario["Jugo"] = "líquido"
print(diccionario)

#Cómo recorrer los diccionarios 
for key in diccionario: 
    print(key) #solo para acceder a las claves 
    
#para acceder a las claves y los valores 
for key,value in diccionario.items():
    print(f"{key}: {value}") #muestra clave y valor
    
#para acceder simplemente al valor 
for value in diccionario.values(): 
    print(value)
    
#Comprobamos la existencia de un elemento 
print("jugo" in diccionario)

#Agregamos un elemento 
diccionario["Almendra"] = "Fruto seco"
print(diccionario) 

#Eliminamos un elemento 
diccionario.pop("jugo")
print(diccionario)
#Limpiamos el diccionario 
diccionario.clear()
print(diccionario)
#Eliminamos el diccionario 
del diccionario