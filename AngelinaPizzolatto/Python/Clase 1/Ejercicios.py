# EJERCICIOS LISTAS
print("Ejercicio 1") #Iterar un rango de 0 a 10 e imprimir números divisibles entre 3 
#Ejemplo de salida: 0,3,6,9
numeros = [0,1,2,3,4,5,6,7,8,9,10]
for numero in numeros: #también se puede hacer sin una lista con un rango específico
    if numero % 3 == 0: 
        print(f"El número {numero} es divisible por 3")
else: 
    print("Ya se recorrió toda la lista")


print("Ejercicio 2") #Crear un rango de números de 2 a 6 e imprimelos 
#Ejemplo de ejecución: 2,3,4,5,6
for i in range(2,7): 
    print(i)

print("Ejercicio 3") #Crear un rango de 3 a 10 pero con incremento de 2 en 2
#Ejemeplo de ejecución: 3,5,7,9 
for i in range(3,10):
    if i % 2 != 0: 
        print(i)
        
#EJERCICIO TUPLAS
# Dada la siguiente tupla 
tupla = (13,1,8,3,2,5,8)
#Crear una lista que solo incluya los números menores a 5 e imprima por consola [1,3,2]
for i in tupla: 
    if i<5: 
        lista = i
        print(lista)