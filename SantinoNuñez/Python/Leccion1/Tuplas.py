
    # Tuplas: son inmutables, es decir que no se pueden modificar

# Definimos la tupla
cocina = ("cuchara","tenedor","cuchillo")
print(cocina)
print(len(cocina))

# Acceder a un elemento, para esto utilizamos CORCHETES no parenteci
print(cocina[1])
print(cocina[-1])   # Muestra el ultimo elemento

# Acceder a un rango
print(cocina[0:2])

verduras= ("papa")
print(f"esto seria un string {verduras} y esto una tupla (verduras ,)")

# Recorrer elementos de una tupla
for cocinar in cocina:
    print(cocinar, end=" ") # end=" " se utiliza para que se vea en una linea

# Agregar elementos a una tupla (LA UNICA FORMA PERO NO SE USA MUCHO)
cocinaLista = list(cocina)   # Pasamos la tupla a lista para añadir un elemento
cocinaLista[0] = "plato"
cocina = tuple(cocinaLista)    # Pasamos la lista a tupla nuevamente
print("\n",cocina)

    # En tuplas no se puede utilizar append, insert y remove

# Eliminar una tupla
del cocina
# print(cocina)

    # Se pueden agregar varios valores diferentes
tupla=(6,"buenass",3,73,[2,3,4,5],"hola",5)
print(tupla)

# Prefuntar si un elemento especifico esta (respuesta es booleana)
print(5 in tupla)     # Se puede preguntsr si no esta

    # Dentro de las tuplas se puede usar: index, cont, len
    # En tuplas se pueden convertir de tuplas a lista y de lista a tupla

