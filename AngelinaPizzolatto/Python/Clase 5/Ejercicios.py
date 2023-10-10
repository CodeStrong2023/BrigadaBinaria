import random
'''Ejercicio 4: Sumar números pares dentro de un rango
Hacer un programa para sumar números pares dentro
de un rango, por ejemplo:
suma de números pares del 2 al 30
suma = 240'''
print("EJERCICIO 4")
print("Suma de números pares del 5 al 45")
suma = 0
for i in range(5,45):
    if i % 2 == 0:
        suma += i
print(f"La suma total de los números pares dentro del rango es de: {suma}")


'''Ejercicio 5: Factorial de un número positivo
Hacer un programa para calcular el factorial de un número positivo'''
print("\nEJERCICIO 5")
num_positivo = 6
factorial = 1
for i in range(num_positivo):
    factorial = factorial * (i+1)
print(f"El factorial del número ingresado es: {factorial}")


'''Ejercicio 6: Tabla de multiplicar
Hacer un programa que pida un número por teclado y guarde
en una lista su tabla de multiplicar hasta el 10. Por ejemplo
Si digita el 5 la lista tendrá: 5,10,15,20,25,30,35,40,45,50'''
print("\nEJERCICIO 6")
num_tabla = int(input("Ingrese un número para mostrar su tabla de multiplicar: "))
lista = []
for i in range(1,11):
    lista.append(num_tabla*i)
print(lista)

'''Ejercicio 7: Juego adivina el número
Realizar un juego para adivinar un número. Para ello se debe
generar un número aleatorio entre 1 - 100, y luego ir pidiendo
números indicando "es mayor" o "es menor" según sea mayor o menor
con respecto a N. El proceso termina cuando el usuario acierta
y allí se debe mostrar el número de intentos'''
print("\nEJERCICIO 7")
print("Juego adivina el número")
num_aleatorio = random.randint(1,100)
num_adivinar = int(input("Ingrese el número que crea que es: "))
while num_adivinar!=num_aleatorio:
    if num_adivinar > num_aleatorio:
        num_adivinar = int(input("Ingrese un número más chico: "))
    elif num_adivinar < num_aleatorio:
        num_adivinar = int(input("Ingrese un número más grande: "))
print("¡Adivinaste! El número era", num_aleatorio)


'''Ejercicio 8: Menú interactivo - Cajero automatico
Hacer un programa que simule un cajero automatico con un saldo
inicial de 1000$ y tendrá el siguiente menú de opciones:
1. Ingresar dinero en la cuenta
2. Retirar dinero de la cuenta
3. Mostrar dinero disponible
4. Salir'''
texto = ''' CAJERO AUTOMÁTICO
Escriba el número según lo que desea hacer
1. Ingresar dinero en la cuenta
2. Retirar dinero de la cuenta
3. Mostrar dinero disponible
4. Salir'''
print("\nEJERCICIO 8")
print(texto)
opcion = int(input("Ingrese el número de opción "))
if opcion == 1: 
    print("¿Cuánto dinero desea ingresar en su cuenta?")
    dinero_ingresar = float(input("Digite el monto: "))
    dinero_total = dinero_ingresar + 1000
    print(f"Ahora tiene ${dinero_total} en su cuenta")
elif opcion == 2: 
    print ("¿Cuánto dinero desea retirar de su cuenta? ")
    dinero_retirar= float(input("Digite el monto: "))
    if dinero_retirar>1000: 
        print("No tiene tanto dinero para retirar")
        dinero_retirar = float(input("Ingrese nuevamente un monto menor a 1000 "))
        dinero_total = 1000 - dinero_retirar
        print(f"Ahora tiene ${dinero_total} en su cuenta")
elif opcion == 3: 
    print("El dinero disponible en su cuenta es de $1000")
elif opcion == 4:
    exit()
else: 
    print("Opción no válida")


'''Ejercicio 9: Mostrar una frase sin espacios y contar su Longitud
Hacer un programa donde el usuario ingrese una frase, se le
devolvera la misma frase pero sin espacios en blanco, y
además un contador de cuántos caracteres tiene la frase
(sin contar los espacios en blanco)
Ejemplo:
frase = vivir por siempre en paz
frase final = vivirporsiempreenpaz
Nº de caracteres = 20'''
print("\nEJERCICIO 9")
frase = input("Ingrese una frase: ")
frase_sin_espacios = frase.replace(" ", "")
longitud_frase = len(frase_sin_espacios)
print(f"Frase sin espacios: {frase_sin_espacios}")
print(f"La longitud de caracteres de frase es de: {longitud_frase}")