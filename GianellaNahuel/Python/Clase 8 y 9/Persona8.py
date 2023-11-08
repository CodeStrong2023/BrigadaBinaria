class Persona:  
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

persona1 = Persona("Raquel","Martinez", 50, 23065215) # necesitamos enviar argumentos

print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
print(Persona)  # Ruta de donde se encuentra
class Personaa():
    def __init__(self,nombre,apellido,edad):
        self.nombre = nombre
        self.apellido = apellido        # Atributos
        self.edad = edad
"""
persona2 = Persona("Nahuel",”Gianella",19,46061882) 
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)

persona3 = Persona(“Joel","Lucero",20, 43657892)
print(f"El objeto3 de la clase persona: {persona3.nombre} {persona3.apellido}, su edad es: {persona3.edad}")
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido}, su edad es: {persona2.edad}")

