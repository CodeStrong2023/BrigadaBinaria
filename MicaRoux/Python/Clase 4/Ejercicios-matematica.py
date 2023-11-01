import math
#Sacar la raíz cuadrada de un número positivo 
numero = int(input("Ingrese un número positivo: "))
while numero < 0:
    print ("El valor ingresado no es válido")
    numero = int(input("Ingrese un número positivo: "))
print(f"La raíz cuadrada del número ingresado es: {math.sqrt(numero):.2f}") #Llamamos a la función para la raíz cuadrada
#Recorremos el Diccionario seleccionArgentina

'''Ejercicio 1: Llenar una lista 
Llenar una lista con los números del 1 al 50, 
luego mostrar la lista con el bucle for, los elementos 
deben mostrarse de la siguiente forma 
1-2-3-4-5-...50
'''
print("\nEJERCICIO 1")
lista1 = []
i = 1
while i <= 50:
    lista1.append (i) #Agregamos a nuestra lista cada elemento que se va agregar en el while
    i += 1
for i in lista1:
    print(i,end=" ")
    

'''Ejercicio 2: Modificar los elementos de una lista
Llenar una lista con los números del 1 al 10, luego modificar 
los elementos de la lista multiplicándolos por un valor ingresado por el usuario'''

print("\nEJERCICIO 2")
lista2 = []
i = 1
while i<=11:
    lista2.append(int(i))
    i += 1
for i in lista2:
    print(i,end=" ")
#Multiplicamos la lista por el número ingresado 
num = int(input("\nIngrese un número para multiplicar por los elementos de la lista: "))
for i in lista2:
    mult = i*num
    print(mult,end=" ")


print("\nEJERCICIO 3")
''' Ejercicio 3: Insertar elementos y ordenarlos 
Pedir números y meterlos en una lista, cuando el usuario 
introduzca un número 0, nuestro programa dejaría de insertar 
Por último, mostrar los números ordenados de menor a mayor
'''
lista3 = []
salida = False
while salida == False:
    numero2 = int(input("Ingrese un número: "))
    if numero2 == 0:
        salida = True
    else: 
        lista3.append(numero2)
#Ordenamos la lista 
lista3.sort()
print(f"LISTA ORDENADA: {lista3}")