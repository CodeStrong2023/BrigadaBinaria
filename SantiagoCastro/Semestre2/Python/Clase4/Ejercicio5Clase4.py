#Ejercicio 5: Llenar una lista
#Llenar una lista con los numeros del 1 al 50,luego mostrar la lista con ciclo for,
#los elementos deben mostrarse de la siguiente manera: 1-2-3-4-5...-50

lista = []
numero = 1

#Hacemos la suma de los numeros
while numero <= 50:
    lista.append(numero)
    numero += 1

#forma de hacerlo mas eficaz: lista = list(range(1,51))

#Mostramos la lista
for numero in lista:
    print(numero,end="-")



