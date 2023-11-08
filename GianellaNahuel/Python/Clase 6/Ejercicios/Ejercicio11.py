"""
Ejercicio 11: Agenda telefonica
#Hacer un programa que simule una agenda de contactos. Crear un diccionario donde la clave
#Sea el nombre del usuario  y el valor sea el teléfono, el programa tendrá el siguiente menú de opciones:
 #      1_ Nuevo contacto
  #    2_ Borrar contacto
  #    3_ Ver contactos existentes
   #    4_ Salir

agenda = {}
while True:
    print("1 Nuevo contacto")
    print("2 Borrar contacto")
    print("3 Ver contactos existentes")
    print("4 Salir")

    opcion = int(input("Digitar una opción del menu: "))
    if opcion == 1:
        nombre = input("Digite nombre de contacto: ")
        telefono = input("Digite el número de teléfono: ")
        if nombre not in agenda:
            agenda[nombre] = telefono
            print("Contacto agregado exitosamente")
        else:
            print("Este nombre de contacto ya existente")

    elif opcion == 2:
        nombre = input("Cual es el nombre de contacto: ")
        if nombre in agenda:
            del(agenda[nombre])
            print ("Se ha eliminado el contacto referido ")
        else:
            print("Este contacto no existe en la agenda")
    elif opcion == 3:
        for clave,valor in agenda.items():
            print(f"Nombre: {clave}, Telefono: {valor}")
    elif opcion == 4:
        print("Gracias por utilizar su agenda de contactos")
        break
    else:
        print("Opcion incorrecta")
    print()
