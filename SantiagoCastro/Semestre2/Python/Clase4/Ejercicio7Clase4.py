#Ejercicio 7: Inesrtar elementos y ordenarlos
#Pedir numeros y meterlos en una lista, cuando el usuario introduzca el numero 0
#nuestro programa dejará de insertar.Por ultimo mostrar los numeros de menor a mayor.
#Creamos la lista sin ningun valor
lista = []
#Le decimos al usuario que ingrese los valores
salir = False
while not salir:
    numero = int(input("\nIngrese un numero: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)
#Mostramos la lista desordenada
print(f"\nLista desordenada: {lista}")

lista.sort()
print(f"\nLista ordenanda {lista}")