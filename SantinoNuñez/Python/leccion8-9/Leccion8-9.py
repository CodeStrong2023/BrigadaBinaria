class Persona:  # Creamos la clase
# el constructor esta oculto, se llama init Dunder.  self es un parametro default
    def __init__(self, nombre, apellido, edad, dni, *args, **kwargs):
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
        self._dni = dni  # Este atributo esta encapruslado de una mnaera sugerida
        self.args = args
        self.kwargs = kwargs
    def mostrar_detalle(self):  # Estando dentro del metodo llamamos con self
        print(f"La clase Persona tiene los siguientes datos: {self.nombre} { self.apellido} {self.edad} {self._dni}, la direccion es:{self.args}, los datos importantes son: {self.kwargs} ")

persona1 = Persona("Viviana","Saez", 45, 23478356) # necesitamos enviar argumentos

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
print(Persona)  # Ruta de donde se encuentra

# Clase con argumentos
"""
class Personaa():
    def __init__(self,nombre,apellido,edad):
        self.nombre = nombre
        self.apellido = apellido        # Atributos
        self.edad = edad
"""
persona2 = Persona("santino","Nuñez",18, 34587345) # Necesita recivir argumentos
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)

persona3 = Persona("Nicolas","Nuñez",21, 44890368)
print(f"El objeto3 de la clase persona: {persona3.nombre} {persona3.apellido}, su edad es: {persona3.edad}")
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido}, su edad es: {persona2.edad}")

#Modificar los atributos de un objeto
persona1.nombre = "Sergio"
persona1.apellido = "Perez"
persona1.edad = 32
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
print(f"El objeto1 modificado de la clase persona: {persona1.nombre} {persona1.apellido}, su edad es: {persona1.edad}")

    #   CLASE 9

# Los atributos son caracteristicas
# los metodos son el comportamiento que van a tener los objetos (acciones)
persona1.mostrar_detalle()      # la referencia se pasa de forma automatica
# persona2.mostrar_detalle()    está en otra clase, x eso error

# Persona.mostrar_detalle(persona1) # Debemos pasarle referencia para el self, sinó da error
persona1.telefono = "2604569878"
print(f"El número de telefono es de: {persona1.nombre} {persona1.telefono}") # Creamos un atributo a un objeto
# print(persona2.telefono) #persona2 no tiene el atributo telefono

persona4 = Persona("Lando","Norris", 22, 34654983,"Nacionalidad","Britanico",altura=1.78, numero=4)
persona5 = Persona("Charles","Leclerc", 24, 3498205, "Nacionalidad","Monegasco",altura=1.80, numero=16)
persona4.mostrar_detalle()
persona5.mostrar_detalle()
print(persona5._dni) # Esto no se debe utilizar
# persona4.__nombre   Está totalmente encapsulado, no se va a poder modificar sus valores