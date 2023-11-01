'''Ejercicio 10: No repetir caracteres
Hacer un programa que pida una cadena por teclado, luego
meter los caracteres en una lista sin repetir caracteres
'''
cadena = str(input("Ingrese una cadena de texto: "))
cadena_sin_espacios = cadena.replace(" ", "")
caracteres_sin_repetir = []
for caracter in cadena_sin_espacios:
    if caracter not in caracteres_sin_repetir:
        caracteres_sin_repetir.append(caracter)
print(f"Caracteres sin repetir en la cadena: {caracteres_sin_repetir}")


'''Ejercicio 11: Agenda telefonica
Hacer un programa que simule una agenda de contactos
Crear un diccionario donde la clave sea el nombre del usuario y el valor
sea el teléfono, el programa tendrá el siguiente menú de opciones:
1. Nuevo contacto
2. Borrar contacto
3. Ver contactos existentes
4. Salir
'''
print("EJERCICIO 11: Agenda telefónica")
agenda = {
    "Cande" : 260482345,
    "Leo" : 260434568,
    "Eliana" : 260403458,
    "Agus" : 260408646
}
while True:
    print("\nMenú de opciones:")
    print("1. Nuevo contacto")
    print("2. Borrar contacto")
    print("3. Ver contactos existentes")
    print("4. Salir")

    opcion = input("Selecciona una opción: ")
    if opcion == "1": #Agregamos un nuevo contacto
        nombre = input("Ingrese el nombre del contacto: ")
        telefono = input("Ingrese el número de teléfono: ")
        agenda[nombre] = telefono
        print(f"El contacto '{nombre}' fue añadido")
    elif opcion == "2": #Borramos un contacto
        nombre = input("Ingrese el nombre del contacto a borrar: ")
        if nombre in agenda:
            del agenda[nombre]
            print(f"El contacto '{nombre}' fue eliminado correctamente")
        else:
            print(f"El contacto '{nombre}' no existe en la agenda")
    elif opcion == "3": #Mostramos la lista de contactos existentes
        print("Lista de contactos")
        for nombre, telefono in agenda.items():
            print(f"{nombre}: {telefono}")
    elif opcion == "4":
        print("Salió")
        break
    else:
        print("Opción no válida")


'''EJERCICIOS FUNCIONES 
Ejercicio 1: Crear una función para sumar los valores recibidos de tipo
numéricos, utilizando argumentos variables *args como parametros de la función 
y agregar como resultado la suma de todos los valores pasados como argumentos
'''
print("EJERCICIO 1: FUNCIONES")
def suma_valores(*args): #se recibe una cantidad de parámetros indefinidos
    resultado = 0
    for valor in args: #se itera cada elemento
            resultado += valor
    return resultado

# Llamamos a la función (probamos 3 veces)
resultado1 = suma_valores(1, 2, 3, 4, 5)
resultado2 = suma_valores(10.5, 20.5, 30.5)
resultado3 = suma_valores(2, 4, 6, 8)

print("Resultado 1:", resultado1)
print("Resultado 2:", resultado2)
print("Resultado 3:", resultado3)