
# Ejercicio 4: sumar números pares dentro de un rango
# Hacer un programa par suamar números pares dentro de un rango, por ejemplo:
#       suma de números pares del 2 al 30

num1 = int(input("Ingrese un número: "))
num2 = int(input("Ingrese un número mayor que el anterior: "))

suma = 0
for i in range(num1,num2+1):
    if i %2 == 0:
        suma += i
        print(i)
print(f"La suma de todos los numeros entre {num1} y {num2} es de: {suma}")