# Ejercicio 3: Función Recursiva.
# Imprimir números de 5 al 1 de manera descendente usando funciones recursivas.
# Puede ser cualquier valor positivo, por ejemplo si pasamos el valor de 5, debe imprimir:
def Recursivos(N):
    if N >= 1:
        print(N)
        Recursivos(N - 1)
    elif N == 0:
        return
    elif N <= 0:
        print("Valor ingresado incorrecto")
Recursivos(5)
print(" ")
Recursivos(3)
print(" ")
N = int(input("Ingrese un número: "))
print(f"\nLos números descendientes a {N} son: ")
Recursivos(N)
