#Ejercicio 1: No repetir caracteres
#Hacer un programa que pida una cadena por teclado, luego meter los caracteres en una lista sin
#repetir caracteres.

lista = []
frase = str(input("Ingrese una frase: "))

for i in frase:
    if i not in lista:
        lista.append(i)
print(f"\nLista de caracteres sin repetir ninguno: {lista}")
