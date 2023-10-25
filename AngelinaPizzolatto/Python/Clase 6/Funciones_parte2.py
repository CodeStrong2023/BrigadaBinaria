# Funciones parte2
def show(name,last_name):
    print(f"Hola {name} {last_name}")

person = ["Angi", "Pizzolatto"]
show(person[0], person[1]) #Los datos se pasan uno por uno 
show(*person) #Los datos se pasan todos juntos 
person2 = ("Azul", "Martínez") #ahora usamos tuplas
show(*person2)
person3 = {"last_name": "Pérez", "name": "Jazmín"} #usamos un diccionario 
show(**person3)

#Repaso for else
numbers = [1,2,3,4,5]
for i in numbers: 
    print(i) 
else: #para que no se muestre el else debe tener un break antes
    print("Finalizó el ciclo")
    
#List comprehension, lista de comprensión 
nombres = ["Camilo", "Uma", "Inti", "Roco", "Moli", "Chispa"]
nueva_lista = [c for c in nombres if c[0] == "C"] #Esto regrsea una nueva lista 
print(nueva_lista)

jugos = [
    {"marca":"Baggio", "sabor":"Multifruta"},
    {"marca":"Citric", "sabor":"Naranja"},
    {"marca":"Cepita", "sabor":"Durazno"}
]
lista_jugos = [c for c in jugos if c["marca"] == "Cepita"]
print(lista_jugos)

#Paso de argumentos
def mi_funcion2(name,last_name): #parámetros
    print("Buen día, buen comienzo de semana")
    print(f"Nombre: {name} / Apellido: {last_name}")

#Llamamos a la función 
mi_funcion2("Vale","Pizzolatto") #argumentos

#Palabra return
def suma(num1, num2):
    return num1 + num2
    
resultado = suma(789,457)
print(f"El resultado de la suma es: {resultado}")
print(f"El resultado de la suma es: {suma(255,577)}")

def suma2(a = 0,b = 0): #se le da un valor por default 
    return a + b 
resultado = suma2()
print(f"Resultado de la suma {resultado}")
print(f"Resultado de la suma {suma2(35,65)}")

#Argumentos, variables en funciones 
def listar_nombres(*nombres): #La cantidad de argumentos varía (normalmente se utiliza: *args)
    for nombre in nombres: #se convierte en tupla
        print(nombre)
        
listar_nombres("Lucas", "José","Claudia", "Rosa", "Marta") #argumentos
listar_nombres("Marcos", "Romina", "Carlos", "Juan Cruz")

def listarTerminos(**kwargs):
    for llave, valor in kwargs.items():
        print(f"{llave} : {valor}")
        
listarTerminos() #No recibe nada, solo va a mostrar
listarTerminos(IDE = "Integrated Develoment Enviroment", PK = "Primary Key")
listarTerminos(Nombre = "Angelina Jolie")

def desplegarNombres(nombres): 
    for nombre in nombres: 
        print(nombre)
nombres2 = ["Tito", "Pedro", "Carlos"]
desplegarNombres(nombres2)
desplegarNombres("MARTINA") 
#desplegarNombres(100) si le pasamos un número nos tirará error ya que no es iterable
desplegarNombres((10, 11)) #le pasamos una tupla
desplegarNombres([22,55]) #le pasamos una lista 

#Funciones Recursivas 
def factorial(numero): 
    if numero == 1: #Caso base
        return 1 
    else: 
        return numero * factorial(numero - 1) #llamada recursiva
    
resultado1 = factorial(5) #código duro
print(f"El factorial del número 5 es: {resultado1}")

#TAREA: que el usuario ingrese el número para calculaar el factorial
numeroFactorial = int(input("Ingrese un número entero: "))
def factorialUsuario(numeroFactorial):
    if numeroFactorial == 1:
        return 1
    else: 
        return numeroFactorial *factorialUsuario(numeroFactorial -1)
    
resultado2 = factorialUsuario(numeroFactorial) #código duro
print(f"El factorial del número {numeroFactorial} es: {resultado2}")