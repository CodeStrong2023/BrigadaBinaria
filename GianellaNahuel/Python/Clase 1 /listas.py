nombres = ["Gianella", "katalina", "Abril","Valentina","Aldana"]
print(nombres)
print(nombres[0])	
print(nombres[1])
print(nombres[-2]) print(nombres[1:3])  
print(nombres[1: ])
nombres[2] = "Lucia"
print(nombres)

for nombre in nombres: 
    print(f"Hola {nombre}")
else: 
    print("Ya no quedan elementos en la lista")

#utilizamos la función len
cant_elementos = len(nombres)
print(f"La cantidad es de {cant_elementos}")

nombres.append("Luciana")
print(nombres)

#Insertamos un elemento en un índice específico 
nombres.insert(3,"Vicktoria ")   
print(nombres)

#Vamos a eliminar un elemento 
nombres.remove("Viktoria")
print(nombres)

#Vamos a eliminar el último elemento de la lista 
nombres.pop() 
print(nombres)

#Vamos a eliminar un índice específico 
del nombres[2] #del siginifica delete (eliminar)
print(nombres)

#Limpiamos la lista
nombres.clear()
print(nombres)

#Eliminamos directamente la lista 
del nombres
