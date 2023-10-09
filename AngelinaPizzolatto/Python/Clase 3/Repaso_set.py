#Repaso de set o conjuntos 
#Definimos un conjunto
conjunto = set()
conjunto1 = {"Hola"} #Cuando se  inicializa se debe escribir algo para que luego nos deje agregar valores
#Recordar que dentro de un conjunto no existen valores duplicados 
conjunto.add(7)
conjunto.add("Hola")
print(conjunto)
conjunto1.add(9)  #add(7,8,9) add te perimte agregar únicamente un valor 
print(conjunto1)
print(3 not in conjunto1) #preguntamos si el número 3 NO está en el conjunto1

#Igualdad entre dos conjuntos
print(conjunto == conjunto1) #la respuesta es un booleano

# Operaciones en conjuntos 
conjunto2 = conjunto | conjunto1 #La línea une los dos conjuntos
print(conjunto2)

conjunto2 = conjunto & conjunto1 #Que elemento tienen en común
print(conjunto2)

conjunto2 = conjunto - conjunto1 #Asigna el valor que está en el conjunto y no el conjunto1
print(conjunto2)

conjunto2 = conjunto ^ conjunto1 #Son los elementos que están en los 2 conjuntos y no están compartidos
print(conjunto2)

conjunto2 = conjunto | conjunto1
print(conjunto.issubset(conjunto2)) #Aquí se pregunta si un conjunto es un subconjunto dentro de otro
print(conjunto1.issubset(conjunto2))
print(conjunto2.issubset(conjunto))
print(conjunto2.issubset(conjunto1))

print(conjunto2.issuperset(conjunto1)) #El conjunto 2 tiene todos los elementos del conjunto 1
print(conjunto2.issuperset(conjunto)) #Si es verdadero el conjunto2 es un superconjunto
print(conjunto.issuperset(conjunto2))

#Cómo saber si ambos conjuntos son disconexos, esto es si comparten elementos en común
print(conjunto.isdisjoint(conjunto2)) #No hay cosas en común

#Convertir un conjunto totalmente en inmutable (no se pueden agregar, modificar ni eliminar elementos del conjunto)
conjunto = frozenset

