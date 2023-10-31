#Son un conjunto de datos al igual que las listas, peros son inmutables
#No se pueden modificar 
tecnologia = ("telefono","auriculares","computadora","televisor")
print(tecnologia)

cant_elementos = len(tecnologia)
print(f"La cantidad de elementos es {cant_elementos}")
#Accedemos a un elemento 
print(tecnologia[2])
print(tecnologia[-1])

#Accedemos a un rango específico 
print(tecnologia[0:2])
#Las tuplas siempre deben llevar al menos una coma (,)

#Recorremos los elementos de una tupla 
for elemento in tecnologia: 
    print(elemento, end=' ') #el end se usa para eliminar saltos de línea

#para agregar elementos en una tupla se debe convertir a lista 
#NO ES UNA BUENA PRÁCTICA 
cosas = list(tecnologia)
cosas.append("laptop")
print(cosas)