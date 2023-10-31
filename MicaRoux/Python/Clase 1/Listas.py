#Listas (son un conjunto de datos)
#dentro de una misma lista pueden haber diferentes tipos de datos 
#son mutables/modificables
nombres = ["Agustina", "Candelaria", "Eliana","Catalina","Victoria"]
print(nombres)
#accedemos a los elementos de manera individual 
print(nombres[0])
print(nombres[1])
print(nombres[-2]) # -1 es el último elemento y así sucesivamente
#como recorrer una determinada parte de la lista 
print(nombres[1:3]) #no incluye el último índice 
#mostramos desde el índice indicado hasta el final 
print(nombres[1: ])
#modificamos un valor dentro de la lista 
nombres[2] = "Florencia"
print(nombres)

#Iteramos nuestra lista 
for nombre in nombres: 
    print(f"Hola {nombre}")
else: 
    print("Ya no quedan elementos en la lista")

#Averiguamos cuántos elementos tiene una lista (utilizamos la función len)
cant_elementos = len(nombres)
print(f"La cantidad de elementos de la lista es de {cant_elementos}")

#Agregamos un elemento en la lista (lo agrega al final)
nombres.append("Camila")
print(nombres)

#Insertamos un elemento en un índice específico 
nombres.insert(3,"Lita")   #(necesita sí o sí 2 parámetros) 
print(nombres)

#Eliminamos un elemento 
nombres.remove("Lita")
print(nombres)

#Eliminar el último elemento de la lista 
nombres.pop() 
print(nombres)

#Eliminar un índice específico 
del nombres[2] #del siginifica delete (eliminar)
print(nombres)

#Borramos todos los elementos (limpiamos la lista)
nombres.clear()
print(nombres)

#Eliminamos directamente la lista 
del nombres