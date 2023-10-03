"""
Ejercicio: crear una funcion para sumar los valores recibidos de tipo numericos,
utilizando argumentos variables *args como parametro de la funcion y agregar
como resultado la suma de todos los argumentos pasados como arguementos
"""
def sumar(*numeros):
#    pass    # No dejarla vasia Para que no de error
    resultado =0
    for valor in numeros:
        resultado += valor
    return resultado

#Llamamos a la función
print(sumar(6,9,2,56))