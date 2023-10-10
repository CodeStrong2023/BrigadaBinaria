# Argumentos variables para un diccionario
def listaTerminos(**terminos):  # **kwargs mas utilizado
    for llave, valor in terminos.items():
        print(f"{llave} : {valor}")
listaTerminos() #No resive ningun dato
listaTerminos(IDE = "Integrated Development Enviroment", PK= "Prymary Key")
listaTerminos(nombre = "Santino Nuñez")

# Lista de elementos con funciones
def desplegarNombres(nombres):
    for nombre in nombres:
        print(nombre)
nombres = ["tito","Pedro","Carlos Sainz"]
desplegarNombres(nombres)
desplegarNombres("hola")
# desplegarNombres(10,11) no es unn objeto iterable
desplegarNombres((10,11)) # Convertimos a una tupla
desplegarNombres([34,12]) # Convertimos en una lista

# Funciones recursivas
def factorial(numero):
    if numero == 1: # Caso base
        return 1
    else:
        return numero * factorial(numero-1) # Caso Recursivo
numero = int(input("Ingrese un número: "))
resultado = factorial(numero)
print(f"El factorial de 5 es: {resultado}")