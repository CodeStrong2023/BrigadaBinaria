#Ejercicio 4: Convertidor de temperaturas
#Realizar dos funciones para convertir de grados celsius
#a fahrenheit y viseversa.
#Investigar las formulas.

def celcsius_fahrenheit (celcius):
    return celcius * 9 / 5 + 32

def fahrenheit_celsius (fahrenheit):
    return (fahrenheit - 32) * 5 / 9

celcius = float(input("Ingrese el valor de los grados celsius: "))
resultado = celcsius_fahrenheit(celcius)

print(f"{celcius} Celsius a fahrenheit {resultado:.2f}")

fahrenheit = float(input("Ingrese el valor de los grados fahrenheit: "))
resultado = fahrenheit_celsius(fahrenheit)

print(f"{fahrenheit} Fahrenheit a celsius {resultado:.2f}")