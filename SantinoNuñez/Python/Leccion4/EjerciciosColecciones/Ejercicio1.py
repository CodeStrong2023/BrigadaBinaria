# Ejercicio 1: llenar una lista con numeros del 1 al 50,
# luego mostrar la lista con el bucle for, los elementos
# de la siguiente forma:
# 1-2-3-4...50
lista = []
i=1
while i <=50:
    lista.append(i)
    i = i+1

# En una sola linea
# lista = list(range(1,51))
for i in lista:
    print(i,end= "-")
