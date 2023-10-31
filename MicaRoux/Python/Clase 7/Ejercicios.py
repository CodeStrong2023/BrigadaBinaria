#EJERCICIOS CON FUNCIONES Y ARGUMENTOS VARIABLES
'''Ejercicio 2: Función con *args para multiplicar
Crear una función para multiplicar los valores recibidos
de tipo numérico, utilizando argumentos variables *args
como parámetro de la función y regresar como resultado
la multiplicación de todos los valores pasados como argumento'''
def multiplicar_valores(*args):
    resultado = 1  
    for valor in args:
            resultado *= valor
    return resultado
#Llamamos a la función y le pasamos argumentos
resultado1 = multiplicar_valores(28, 33, 45)
resultado2 = multiplicar_valores(5, 2, 19)
#Mostramos los resultados
print("Resultado 1:", resultado1)
print("Resultado 2:", resultado2)


'''Ejercicio 3: Función Recursiva con factorial
Imprimir números de 5 a 1 de manera descendente usando funciones recursivas
Puede ser cualquier valor positivo, por ejemplo, si pasamos el
valor de 5, debe imprimir:
5
4
3
2
En case de ser el númere 3 debe imprimir
2
1
Si se ingresan números negativos no imprime nada'''
def descendentes_recursivos(num):
    if num <= 0:
        return
    print(num)
    descendentes_recursivos(num - 1)
numero = int(input("\nIngrese un número positivo: "))
if numero > 0:
    descendentes_recursivos(numero)
else:
    print("No puede ingresar números negativos")


'''Ejercicio 4: Calculadora de Impuestos
Crear una función para calcular el total de un pago incluyendo un impuesto aplicado. (IVA)
Formula: pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100,
Proporcione el pago sin impuesto: 1000
Proporcione el monto del impuesto: 21%
Pago con impuesto: xxxxx'''
#Función que calcula el total del pago con el impuesto
def calcular_pago_con_impuesto(pago_sin_impuesto, impuesto):
    pago_total = pago_sin_impuesto + pago_sin_impuesto * (impuesto/100)
    return pago_total

# Solicitamos al usuario el pago sin impuesto y el monto del impuesto
pago_sin_impuesto = float(input("\nProporcione el pago sin impuesto: "))
impuesto = float(input("Proporcione el monto del impuesto: "))

# Calcular el pago con impuesto
pago_final = calcular_pago_con_impuesto(pago_sin_impuesto, impuesto)
print(f"\nEl pago con impuesto incluido es de: ${pago_final}")



'''Ejercicio 5: Convertidor de temperaturas (Celsius a Fahrenheit)
Realizar dos funciones para convertir de grados celsius a fahrenheit y viseversa
Investigar las formulas
'''
def celsius_a_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit
def fahrenheit_a_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

temperatura_celsius = float(input("Ingrese la temepratura celsius a calcular: "))
temperatura_fahrenheit = float(input("Ingrese la temperatura fahrenheit a calcular: "))

resultado_celsius = celsius_a_fahrenheit(temperatura_celsius)
resultado_fahrenheit = fahrenheit_a_celsius(temperatura_fahrenheit)

print(f"\n{temperatura_celsius} grados Celsius son equivalentes a {resultado_celsius:.2f} grados Fahrenheit")
print(f"{temperatura_fahrenheit} grados Fahrenheit son equivalentes a {resultado_fahrenheit:.2f} grados Celsius")