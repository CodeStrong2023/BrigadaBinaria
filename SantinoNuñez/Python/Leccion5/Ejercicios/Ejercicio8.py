"""
Ejercicio 8: Menú interactivo - Cajero automatico
Hacer un progrma que simule un cajero automatico con un saldo
inicial de 1000$ y tendrá el siguiente menú de opciones:
            1.Ingresar dinero en la cuenta
            2.Retirar dinero de la cuenta
            3.Mostrar dinero disponible
            4.Salir
"""
saldo = 1000
print("   CAJERO AUTOMATICO")
while True:
    print()
    print(   "MENÚ")
    print("1.Ingresar dinero en la cuenta ")
    print("2.Retirar dinero de la cuenta")
    print("3.Mostrar dinero disponible")
    print("4.Salir")
    print()

    opcion = int(input("Digite una opción "))
    if opcion == 1:
        ingreso = float(input("Digite la cantidad a ingresar -> "))
        saldo += ingreso
        print(f"Dinero en cuenta ${saldo}")
    elif opcion == 2:
        print(f"Saldo disponible ${saldo}")
        retiro = float(input("Ingrese la cantidad a retirar -> "))
        if retiro > saldo:
            print("Saldo insuficiente")
        else:
            saldo -= retiro
    elif opcion == 3:
        print(f"Saldo disponible ${saldo}")
    elif opcion == 4:
        print("  Gracias por utilizas su cajero, Vuelva pronto")
        break
    else:
        print("Opcion Incorrecta")
