"""
Ejercicio 8: Menú interactivo - Cajero automatico
Hacer un programa que simule un cajero automatico con un saldo
inicial de 1000$ y tendrá el siguiente menú de opciones:
            1.Ingresar dinero en la cuenta
            2.Retirar dinero de la cuenta
            3.Mostrar dinero disponible
            4.Salir
"""
saldo = 1000
while True:
    print()
    print(   "MENÚ")
    print("1.Ingresar dinero en la cuenta ")
    print("2.Retirar dinero de la cuenta")
    print("3.Mostrar dinero disponible")
    print("4.Salir")
    print()

    opcion = int(input("Digite una opción de menú "))
    if opcion == 1:
        ingreso = float(input("Cuanto dinero desea ingresar -> "))
        saldo += ingreso
        print(f"Dinero en cuenta hasta el momento:${saldo}")
    elif opcion == 2:
        print(f"Saldo disponible ${saldo}")
        retiro = float(input("Cuanto dinero desea retirar -> "))
        if retiro > saldo:
            print("No tiene esa cantidad de dinero")
        else:
            saldo -= retirar
    elif opcion == 3:
        print(f"Dinero en la cuenta hasta el momento: ${saldo}")
    elif opcion == 4:
        print("  Gracias por utilizas su cajero automatico, Hasta pronto")
        break
    else:
        print("Error")
