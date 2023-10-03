# Return en funciones
# Creamos una funcion para sumar
def sumar(a,b):
    return a+b
# resultado = sumar(55,23)
# print(f"El resultado es: {resultado}")
print(f"El resultado de la suma es: {sumar(38,23)}")

# Valor por default (es el 0, a=0 b=0)
def sumar2(a = 0,b = 0):
    return a+b
resultado = sumar2()
print(f"Resultado de la suma es: {resultado}")
print(f"Resultado de la suma es: {sumar2(45,28)}")  # Se le atribuyen valores

# Argumentos, variables de una funcion
def listaNombres(*nombres):     # Si no conocemos la cantidad ponemos *args
    for nombre in nombres:      # Se convierte en una tupla
        print(nombre)
listaNombres("santino","Raúl","Nicolas","Viviana")
listaNombres("Santiago", "Angelina")