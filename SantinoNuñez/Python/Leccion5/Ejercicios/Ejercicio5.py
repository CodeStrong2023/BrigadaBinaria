# Ejercicio 5: factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

num = int(input("Ingrese un número positivo: "))
factorial = 1
if num >= 0:
    for i in range(1,num+1):
        factorial *= i
        print(factorial)
else:
    print("Error, Número no valido")
print(f"El factorial de {num} es: {factorial}")
