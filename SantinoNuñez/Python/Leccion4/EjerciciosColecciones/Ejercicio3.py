# Ejercicio 3: insertar elementos y ordenarlos
# Pedir numeros y meterlos en una lista, cuando ell usuario
# introduzca un numero 0, deja de pedir numeros.
# Mostrar los elementos ordenados de menor a mayor


lista = []
salir = False   # Boolean
while not salir:    # = true
    numero = int(input("Ingrese un número: "))
    if numero == 0:
        salir = True
    else:
        lista.append(numero)    # Añade otro numero a la lista
lista.sort()    # Ordena la lista de menor a mayor
print(f"Lista ordenada {lista}")
