
# Tipo Set o conjunto
# No tiene indice el orden es aleatorio, no se puede modificar pero si eliminar o agregar

# se utilizan para datos que no se tengan que duplicar

planetas = {'marte','júpiter','venus'}
print(planetas)
print(len(planetas))  # Para ver el largo del se, cantidad de elementos

# Revisar si hay un elemento en especifico
print('marte' in planetas)  # Hay que poner exactamente como esta en el set
                            # de lo contrario no lo toma

# Agregar un elemento
planetas.add("tierra")      # funcion para añadir
planetas.add("tierra")      # no se pueden agregar elementos duplicados
print(planetas)

# Eliminar elementos
planetas.remove("marte")   # si no se escribe bien el elemento a borrar
print(planetas)            # genera un error

planetas.discard("tierra") # si está mal escrito no se borra pero
print(planetas)            # no genera error

# Limpiar el set o conjunto
planetas.clear()        # Eliminamos los elementos dentro del set
print(planetas)

# Eliminar el set o conjunto
del planetas
#print(planetas)


        # Leccion 3: Repaso de tipo set o conjunto

# Repaso de set o conjuntos
# Definir un conjunto
conjunto=set()     # Unic manera de inicializarlo vacio
conjunto1={"Oi",}
conjunto.add(8)
conjunto.add('hola')
print(conjunto)
conjunto.add(7.23)
conjunto1.add("que tal")
conjunto1.add(5)
conjunto1.add("Hola")
print(conjunto1)
print(3 not in conjunto)    # Preguntamos si 3 no esta en ese set

# hacemos una igualdad
print(conjunto == conjunto1)    # Devuelve boolean

# Operaciones en set(conjuntos)
conjunto3 = conjunto | conjunto1      # Si hay elementos repetidos deja solo 1
print(conjunto3)

# Elementos en común
conjunto3 = conjunto & conjunto1        # Muestra que elemento está repetido
print(conjunto3)

conjunto3 = conjunto - conjunto1        # Muestra valores que estan en el conjunto y no en conjunto1
print(conjunto3)

conjunto3 = conjunto1 - conjunto        # Muestra valores que estan en el conjunto1 y no en conjunto
print(conjunto3)

conjunto3 = conjunto ^ conjunto1        # Muestra elementos que no comparten o son diferentes entre ambos
print(conjunto3)

# Ver si un conjunto está dentro de otro
conjunto3 = conjunto | conjunto1        # preguntamos si un conjunto está dentro de otro conjunto
print(conjunto1.issubset(conjunto3))    # preguntamos si conjunto1 esta dentro de conjunto3,respuesta es booleana
print(conjunto.issubset(conjunto3))
print(conjunto.issubset(conjunto1))
print(conjunto3.issubset(conjunto1))

# Ver si es un superconjunto, muestra si los elementos de un conjunto estan dentro de otro conjunto
print(conjunto3.issuperset(conjunto))       # True = superconjunto
print(conjunto3.issuperset(conjunto1))      # Preguntamos si los elementos del conjunto1 estan en el conjunto3
print(conjunto.issuperset(conjunto1))

# Como saber si ambos conjuntos son disconexos, es decir, que si no comparten elementos en comun
print(conjunto1.isdisjoint(conjunto))
print(conjunto.isdisjoint(conjunto1))
print(conjunto)
print(conjunto1)

# Convertir un conjunto totalmente en inmutable
conjunto1 = frozenset     # Esto hace que el conjunto sea totalmente inmutable
# ES DECIR, NO se puede agregar, modificar ni eliminar elementos del conjunto