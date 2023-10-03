"""
Ejercicio 11: Agenda telefonica
Hcaer un rograma que simule una agenda de contactos. Crear un diccionario donde la clave
sea el nombre y el valor sea el telefono, el programa tendra el siguiente menú:
        1_ Nuevo contacto
        2_ Borrar contacto
        3_ Ver contactos existentes
        4_ Salir
"""

agenda = {}
while True:
    print("1 Nuevo contacto")
    print("2 Borrar contacto")
    print("3 Ver contactos existentes")
    print("4 Salir")

    opcion = int(input("Ingrese una opción: "))
    if opcion == 1:
        nombre = input("Nombre de contacto: ")
        telefono = input("Número de teléfono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado")
        else:
            print("Contacto ya existente")

    elif opcion == 2:
        nombre = input("Nombre de contacto: ")
        if nombre in agenda:
            del(agenda[nombre])
            print ("Contacto borrado")
        else:
            print("Contacto no encontrado")
    elif opcion == 3:
        for clave,valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor}")
    elif opcion == 4:
        print("Gracias por utilizar su agenda")
        break
    else:
        print("Opcion incorrecta")
    print()