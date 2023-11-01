#Repaso Diccionarios 
dic_nuevo = {"Azul":"Blue","Rojo":"Red","Verde":"Green","Amarillo":"Yellow"}
print(dic_nuevo)

#Como eliminar 
del dic_nuevo["Azul"]
print(dic_nuevo)

#Los diccionarios pueden almacenar diferentes tipos de datos
dic_2 = {"Angi":{"Edad":18,"Altura": 1.70}, "Ari": [19,1.60],"Rulo":[19,1.78]}
#Dentro de este diccionario tenemos cadenas, enteros, flotantes, listas y otro diccionario
print(dic_2)