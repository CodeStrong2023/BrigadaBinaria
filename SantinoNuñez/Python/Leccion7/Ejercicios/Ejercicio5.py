"""
Ejercicio 5: Convertidor de temeraturas
Realizar dos funciones para convertir de grados celsius a fahrenheit y viceversa
"""
# Conversion de celsius a fharenheit
def celsius_fharenheit(grados_celsius):
    fharenheit = (grados_celsius * (9/5)+32)
    return fharenheit

grados_celsius = float(input("Ingrese los grados celsius: "))
fharenheit = celsius_fharenheit(grados_celsius)
print(f"La conversion de {grados_celsius}°C a °F es: {fharenheit:.2f}°F ")
print("")
# Conversion de fharenheit a celsius
def fharenheit_celsius(grados_fharenheit):
    celsius = ((grados_fharenheit - 32) * 5/9)
    return celsius

grados_fharenheit = float(input("Ingrese los grados fharenheit: "))
celsius = fharenheit_celsius(grados_fharenheit)
print(f"La conversion de {grados_fharenheit}°F a °C es: {celsius:.2f}°C ")