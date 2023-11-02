##Ejercicio 2: Funcion con *args para multiplicar.Crear una funcion para multiplicar valores
#recibidos de tipo numerico, utilizando argumentos variables *args como parametro de la funcion y
#regresar como resultado la multiplicacion de todos los valores pasados como argumentos.

#Definimos la fucion para multiplicar
def multiplicar_valores(*args):
    resultado = 1;
    for numero in args:
        resultado *= numero
    return resultado

#Llalmamos a la funcion
print(multiplicar_valores(5,10,15))