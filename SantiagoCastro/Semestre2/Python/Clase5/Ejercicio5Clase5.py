#Ejejrcicio 5:Menú interactivo - Cajero automatico
#Hacer un programa que simule un cajero automatico con un saldo inicial de $1000 y tendrá el siguiente menú de opciones:
#1- Ingresar dinero a la cuenta
#2- Retirar dinero de la cuenta
#3- Mostrar dinero disponible
#4- Salir

saldo = 1000

while True:
    print("\t--MENU--")
    print("1.Ingresar dinero a la cuenta")
    print("2.Retirar dinero de la cuenta")
    print("3.Mostrar dinero disponible")
    print("4.Salir")
    opcion = int(input("Ingrese una opcion: "))
    if opcion == 1:
        ingreso = float(input("Igrese dinero -->"))
        saldo+=ingreso
        print(f"Su saldo total es de {saldo}")
    elif opcion == 2:
        egreso = float(input("Cuanto dinero desea extraer -->"))
        if egreso > saldo:
            print("Saldo insuficiente")
            print(f"Su saldo total es de {saldo}")
            egreso = float(input("Cuanto dinero desea extraer -->"))
            saldo -= egreso
        else:
            saldo -= egreso
            print(f"Su saldo total es de --> {saldo}")
    elif opcion == 3:
        print(f"Su saldo disponible es de --> {saldo}")
    elif opcion == 4:
        print("Salió del cajero")
        break
    else:
        opcion = int(input("Esa no es una opcion,ingrese una opcion nuevamente: "))
