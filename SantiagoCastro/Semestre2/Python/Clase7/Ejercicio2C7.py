#Ejercicio 3: Funcion recursiva
#Imprimir numeros de 5 a 1 de manera descendente unsando funciones recursivas.Puede ser cualquier valor positivo,
#por ejemplo, si pasamos el valor de 5, debe imprimir:
#5
#4
#3
#2
#1
#En caso de ser el numero 3 debe imprimir:
#3
#2
#1
#Si se ingresan numeros negativos no se debe imprimir nada

def imprimir_recursivo(args):
    if args >= 1:
        print(args)
        imprimir_recursivo(args-1)
    elif args == 0:
        return
    elif args <= 0:
        print("Valor ingresado incorrecto")

numero = int(input("Ingresa un numero: "))
imprimir_recursivo(numero)
