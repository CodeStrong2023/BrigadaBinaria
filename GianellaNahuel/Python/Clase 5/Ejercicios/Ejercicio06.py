# Ejercicio 6: tabla de multiplicar
# Hacer un programa que pida un número por teclado y guarde
# en una lista su tabla de multiplicar hasta el 10. Por ejemplo:
# Si digita el 5 la lista tendrá: 5,10,15,20,25,30,35,40,45,50

numero = int(input("Digite un número:  "))
for i in range(1,11):
    lista.append(i*numero)
print(f" Tabla de multiplicacion del {numero}: \n {lista}")

# Arreglado el del profe (cambio i por indice+1)
for indice,i in enumerate(lista):
    print(f"{numero} x {indice+1} = {lista[indice]}")# Este ciclo es paraa ver el formato de una tablas de multiplicar
