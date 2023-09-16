# Ejercicio1: eliiminar duplicados de una lista
# Escribe un programa donde tengs una lista y a
# continuacion elimine los elementos duplicados

lista = [5,3,6,3,5,"santi",5.55,5,"nuñez","santi",5.55,6,"santi"]
print(lista)

# En una sola línea
# lista = list(set(lista))
# print(lista)

# Eliminamos elementos repetidos
conjunto = set(lista)
print(conjunto)

# Convertimos nuevamente a lissta
lista = list(conjunto)
print(lista)