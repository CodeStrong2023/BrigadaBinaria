#Ejercicio 3: Tabla de multiplicar
#Hacer un prgrama que pida un numero por teclado y gurde una lista de su tabla de multiplicar
#hasta el 10.Por ejemplo: Si digita el 5 la lista tendrá:5,10,15,20,25,30,35,40,45,50.

num = int(input("Ingrese un numero: "))
lista=[]

for i in range(1,11):
    lista.append(i*num)

for indice,i in enumerate(lista):
    print(f"{num} x {i} = {lista[indice]}")