#No son completamente mutables, ni completamente inmutables
#No tienen un orden y no permite almacenar elementos repetidos
#el orden es aleatorio y se le pueden agregar elementos
#Los sets son una colección sin orden ni índices 
#conocidos como sets o conjuntos 
planetas = {"Marte","Mercurio","Júpiter","Venus","Saturno"}
print(planetas)
cant_planetas = len(planetas)
print(cant_planetas)
#Revisamos si un elemento existe dentro de set 
print("Plutón" in planetas) #el elemento se debe escribir igual a como fue almacenado 
print("Marte" not in planetas)
#Función para agregar elementos
planetas.add("Tierra")
print(planetas)
#No se pueden agregar elementos duplicados 
planetas.add("Marte")
print(planetas)
#Cómo eliminar un elemento 
planetas.remove("Tierra") #si el elemento no está, la función da error
print(planetas)
planetas.discard("Plutón") #si el elemento no está, NO DA ERROR 

#Limpiamos nuestro set 
planetas.clear()
print(planetas)

#Borramos todo el conjunto 
del planetas 
print(planetas)

#SIRVEN PARA EVITAR DUPLICADOS