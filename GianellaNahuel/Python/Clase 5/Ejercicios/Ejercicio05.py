# Ejercicio 5: factorial de un número positivo
# Hacer un programa para calcular el factorial de un número positivo

numero = int(input("Digite un número : "))
factorial = 1
if numero >= 0:
    for i in range(1,numero+1):
        factorial *= i
        print(factorial)
else:
    print("Error, el numero tiene que ser positivo ")
print(f"El factorial del numero {numero} positivo ingresado es: {factorial}")
