"""
Ejercicio 10: no repetir caracteres
Hacer un programa que pida una cadena por teclado, luego meter
los caracteres en una lista sin repetir caracteres
"""

cadena = input("Ingrese una cadena: ")
lista = []
for i in cadena:
    if i not in lista:      # comprueba si el caracter aun no esta en la lista
        lista.append(i)     # lo agremgamos a la lista
print(f"cadena sin repetir caracteres: {lista}")