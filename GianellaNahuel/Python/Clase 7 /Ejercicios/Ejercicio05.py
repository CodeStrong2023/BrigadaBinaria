'''
Convertidor de temperaturas (Celsius a Fahrenheit)
Realizar dos funciones para convertir de grados celsius a fahrenheit y viseversa
Investigar las formulas
'''
def celsius_a_fahrenheit(celsius):
    fahrenheit = (celsius * 9/5) + 32
    return fahrenheit
def fahrenheit_a_celsius(fahrenheit):
    celsius = (fahrenheit - 32) * 5/9
    return celsius

temperatura_celsius = float(input("Ingrese la temperatura celsius a calcular: "))
temperatura_fahrenheit = float(input("Ingrese la temperatura fahrenheit a calcular: "))

resultado_celsius = celsius_a_fahrenheit(temperatura_celsius)
resultado_fahrenheit = fahrenheit_a_celsius(temperatura_fahrenheit)

print(f"\n{temperatura_celsius} grados Celsius son equivalentes a {resultado_celsius:.2f} grados Fahrenheit")
print(f"{temperatura_fahrenheit} grados Fahrenheit son equivalentes a {resultado_fahrenheit:.2f} grados Celsius")


