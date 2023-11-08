def show(name,last_name):
    print(f"Hola {name} {last_name}")

person = ["Gianella", "Nahuel"]
show(person[0], person[1]) show(*person)  
person2 = ("Katalina", "Martínez") # usamos tuplas
show(*person2)
person3 = {"last_name": "Nahuel", "name": "Franco"} #usamos un diccionario 
show(**person3)

numbers = [1,2,3,4,5]
for i in numbers: 
    print(i) 
else:    print("El ciclo Finalizo")
    
#List comprehension, lista de comprensión 
nombres = ["Lula", "Dani", "Luz", "Ciro", “Pili", "Thor"]
nueva_lista = [c for c in nombres if c[0] == "C"] #Esto no da  una nueva lista 
print(nueva_lista)


#Paso de argumentos
def mi_funcion2(name,last_name): #parámetros
    print("Buenas")
    print(f"Nombre: {name} / Apellido: {last_name}")

#Llamamos a la función 
mi_funcion2("Gianella","Nahuel") #argumentos

def suma2(a = 0,b = 0): #se le da un valor por default 
    return a + b 

#Argumentos, variables en funciones 
def listar_nombres(*nombres): #Los argumentos (generalmente se utiliza: *args)
    for nombre in nombres: #= tupla
        print(nombre)
        
listar_nombres("Agustin", "Sebastian","Luciano", "Mariano", "Enzo") #argumentos
listar_nombres("Leo", "Alma", "Mar", "Isabel")

def listarTerminos(**kwargs):
    for llave, valor in kwargs.items():
        print(f"{llave} : {valor}")
        
listarTerminos()listarTerminos(IDE = "Integrated Develoment Enviroment", PK = "Primary Key")
listarTerminos(Nombre = "Daniel")

def desplegarNombres(nombres): 
    for nombre in nombres: 
        print(nombre)
nombres2 = ["leo", "paloma", "Juana"]
desplegarNombres(nombres2)
desplegarNombres("marta") 
#desplegarNombres(100)
desplegarNombres((10, 11)) 
desplegarNombres([22,55]) 

#Funciones Recursivas 
def factorial(numero): 
    if numero == 1: #Caso base
        return 1 
    else: 
        return numero * factorial(numero - 1)    
resultado1 = factorial(5)
print(f"El factorial del número 5 es: {resultado1}")

