# Ejercicio 6: tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo
# Si digita 5 la lista tendrá: 5,10,15,20,25,30,35,40,45,50

numero = int(input("Ingrese un número para ver su tabla de multiplicar "))
for i in range(1,11):
    multi = numero*i
    print(f"{numero} x {i} = {multi}")


lista = []  #Lista vacia
for i in range(1,11):
    lista.append(i*numero)
print(f" Tabla de multiplicacion del {numero}: \n {lista}")

# Arreglado el del profe (cambio i por indice+1)
for indice,i in enumerate(lista):
    print(f"{numero} x {indice+1} = {lista[indice]}")