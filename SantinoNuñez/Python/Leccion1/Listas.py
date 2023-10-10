# lista = Santino , Angelina , sebas, santiago

nombres= ["santino","angelina","sebas","santiago"]
print(nombres)
print(nombres[2])
print(nombres[0])
print(nombres[-3])  # Corre la lista de forma inversa

# Mostrar mas posiciones por indice
print(nombres[0:2])     # Muestra solo indice 0 y 1
print(nombres[ :3])     # Pedimos las 3 primeras posisciones, igual que arriba
print(nombres[1: ])     # Imprime desde el indice 1 hasta el final

# Modificamos su valor
nombres[2] = "Gian"
nombres[1] = "maya"
print(nombres)

# Iterar una lista con ciclo for
for nombre in nombres:      # Primero va el nombre del ciclo (por asi decir)
    print(nombre)           #  y luego la variable con la lista de los nombres (nombres)
else:
    print("Se acabaron los nombres de la lista")

# Ver cuantos elementos tiene una lista
print(len(nombres))     # Nos muestra la cantidad

# Agregamos un elemento
nombres.append("marcelo")       # Se agrega a la ultima posicion
print(nombres)

# Insertar un elemento en un lugar (indice) especifico
nombres.insert(1,"Alberto")     # Primero indicamos la posicion y luego el elemento
print(nombres)
nombres.insert(3, "Debora")
print(nombres)

# Eliminar un elemento de la lista
nombres.remove("Alberto")       # Indicamos el elemento a eliminar (string)
print(nombres)

# Eliminar el último lemento
nombres.pop()       # Elimina el ultimo elemento de la lista, NO el ultimo ingresado
print(nombres)

# Eliminar un elemento especifico
del nombres[1]      # Elimina el elemento de la posicion 2 (indice 1)
print(nombres)

# Eliminar los elementos de la lista (TODOS)
nombres.clear()
print(nombres)

# Eliminar la lista
del nombres
# print(nombres)      # Tira error, la variable no esta definida


            # Clase 3: Repaso de listas

# Concatenar listas
lista1=[1,2,3]
lista2=[4,5,5,6]
lista3=lista1+lista2        # Concatenamos la lista
print(lista3)

lista3.extend([7,5,8,9])    # agregar mas elementos a una lista
print(lista3)

# Buscar el indice de un elemento
print(lista3.index(9))   # Si el elemento no esta tira error

# Contar la canidad de un elemento en la lista
print(lista3.count(5))

# Poner la lista al reves
lista3.reverse()
print(lista3)

# Multiplicar una lista
lista4=[2,4,5]*4        # Repite la lista, no multiplica los valores
print(lista4)

# Metodos de ordenamiento, (sort es una funcion de python)
lista3.sort()   # Ordena de forma ascendente los elementos
print(lista3)
lista3.sort(reverse=True)   # Ordena de fora descendente los elementos
print(lista3)

        # Pilas usando listas
print("Pilas en listas")
pila = [1,2,3]

# Agregar elementos a la pila por el final
pila.append(4)
pila.append(5)
print(pila)

# Sacamos elementos desde el final
pila.pop()
print(pila)

# Sacamos elementos desde el final y lo guardamos en una variable
elementoBorrado = pila.pop()    # Quita el último elemento y guarda en la variable
print(f"Sacamos el elemento:{elementoBorrado}")
print(f"La pila ahora quedo así: {pila}")

        # Colas con listas
# Estructura de datos de tipo fifo(firs input / first output)
# Exixste el modulo colecciones
print("Colas con listas")
cola = ["Santino", "Angi","Santi"]

# Agregamos mas elementos
cola.append("Maya")
cola.append("Gian")
print(cola)

# Sacamos elementos de la cola
seRetira = cola.pop(0)
print(f"Atenfido el cliente {seRetira}")
print(cola)

seRetira = cola.pop(0)
print(f"Atenfido el cliente {seRetira}")
print(cola)

for clientes in cola:
    print(f"Atendido al cliente {clientes}")
    print(f"El siguiente es: {cola.pop()}")
