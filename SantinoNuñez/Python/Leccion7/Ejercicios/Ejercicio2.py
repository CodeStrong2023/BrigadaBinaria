"""
Ejercicio2: Función con * args para multiplicar. crear una función
para multiplicar  los valores recibidos de tipo númerico, utilizando
argumentos variables *args como parámetro de la función y regresar como
resultado la multiplicacion de todos los valores pasados como argumentos.
"""
def multiplicacion(*numeros):   # Creamos clase
    resultado = 1
    for valor in numeros:   # ciclo para multiplicar los numeros
        resultado *= valor
    return resultado
# Mostramos el resultado de la clase
print(multiplicacion(4,6,3))