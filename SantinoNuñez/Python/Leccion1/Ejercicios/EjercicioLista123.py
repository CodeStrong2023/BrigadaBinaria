
    #   Ejercicio 1: Iterar un rango de 0 a 10 e imprimir números divisibles entre 3
    #   Ejemplo de ecucion: 0,3,6,9
print ("Ejercicio 1")
fin = 10

for i in range(fin):
    if i %3 == 0:
        print(i)

    #   Ejercicio 2: Crear un rango de numeros de 2 a 6 e imprimirlos
    #   Ejecucion 2,3,4,5,6
print ("Ejercicio 2")
inicio = 2
fin = 7
rango = range(2,7) # Otra opcion para remplazar el rango
for i in range(fin):
    print(i)

    #   Ejercicio 3: Crear un rango de 3 a 10 pero con incremento de 2 en 2
    #   Ejecucion: 3,5,7,9
print ("Ejercicio 3")
for i in range(3,11,2):     # (inicio, fin, paso) = (3,11,2) <- paso 2 en 2
    print(i)