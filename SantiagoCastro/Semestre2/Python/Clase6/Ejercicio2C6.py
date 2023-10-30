#Ejercicio: Agenda telefonica
#Hacer un programa que simule una agenda de contactos.Crear un diccionario donde la clave sea
#el nombre del usuario y el valor sea el telefono,
# el programa tendrá el siguiente menú de opciones:
#               1-Nuevo contacto
#               2-Borrar contacto
#               3-Ver contactos existentes
#               4-Salir

agenda = []

while True:
    print("\t <>*MENU*<>")
    print("1-NUEVO CONTACTO")
    print("2-BORRAR CONTACTO")
    print("3-CONTACTOS EXISTENTES")
    print("4-SALIR")
    opcion = int(input("\nIngrese una opcion: "))
    if opcion == 1:
        nombre = str(input("Ingrese el nombre del usuario: "))
        telefono = int(input("Ingrese su número de telefono: "))
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado")
        else:
            print("Contacto existente")
    elif opcion == 2:
        nombre = input("Ingrese el nombre del contacto a borrar")
        if nombre in agenda:
            del (agenda[nombre])
            print("Se ha borrado el contacto")
        else:
            print("El contacto ingresado no existe")
    elif opcion == 3:
        print("Agenda de contactos")
        for clave,valor in agenda.items():
            print(f"Nombre: {clave}, Teléfono: {valor}")
    elif opcion == 4:
        print("Saliendo de la agenda del contacto")
        break
    else:
        print("El numero que ingresó no se encuentra entre las opciones")

