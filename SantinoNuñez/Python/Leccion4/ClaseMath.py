import math # Importamos clase math para usar la funcion sqrt(raíz cuadrada)
# Ejercicio
# Para sacar la raiz cuadrada de un número
numero = int(input("Ingrese un número: "))
while numero < 0:
    print("Error, digite un número positivo")
    numero = int(input("Ingrese un número: "))
print(f"\n La raiz cuadrada de {numero} es: {math.sqrt(numero):.2f}")