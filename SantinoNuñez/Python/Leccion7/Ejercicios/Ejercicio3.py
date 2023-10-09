"""
Ejercicio 3: Funcion Recursiva
Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
Puede ser cualquier valor positivo, por ejemplo, si pedimos el valor de 5
debe imprimir: (5,4,3,2,1)
"""
def decreciente(numero):
    if numero >= 1:
        print(numero)
        decreciente(numero-1)   # Caso recursivo
    elif numero == 0:
        return
numero = int(input("Ingrese un número: "))  # Pedimos número
decreciente(numero) # Mostramos