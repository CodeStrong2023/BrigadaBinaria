'''
Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
Puede ser cualquier valor positivo, por ejemplo, si pasamos el
valor de 5, debe imprimir:
5
4
3
2
En caso de ser el número 3 debe imprimir
2
1
Si se Digitan números negativos no imprime nada'''
def descendentes_recursivos(num):
    if num <= 0:
        return
    print(num)
    descendentes_recursivos(num - 1)
numero = int(input("\nDigite un número positivo: "))
if numero > 0:
    descendentes_recursivos(numero)
else:
    print("No puede Digitar números negativos")

