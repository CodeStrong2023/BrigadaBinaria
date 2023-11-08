Ejercicio 2: Función con *args para multiplicar
Crear una función para multiplicar los valores recibidos
de tipo numérico, utilizando argumentos variables *args
como parámetro de la función y regresar como resultado
la multiplicación de todos los valores pasados como argumento'''
def multiplicar_valores(*args):
    resultado = 1  
    for valor in args:
            resultado *= valor
    return resultado
#Llamamos a la función y le pasamos argumentos
resultado1 = multiplicar_valores(28, 33, 45)
resultado2 = multiplicar_valores(5, 2, 19)
#Mostramos los resultados
print("Resultado 1:", resultado1)
print("Resultado 2:", resultado2)

