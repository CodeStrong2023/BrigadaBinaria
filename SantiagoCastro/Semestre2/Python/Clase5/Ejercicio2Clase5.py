#Ejercicio 2: Factorial de un numero positivo
#Hacer un programa para calcular el factorial de un numero positivo

num = int(input("Ingrese un numero para sacar el factorial: "))
5
while num < 0:
    print("Error")
    num = int(input("ingrese un numero nuevamente"))

factorial = 1

for i in range (1,num+1):
    factorial *= i
print(f"El factorial del numero es: {factorial}")