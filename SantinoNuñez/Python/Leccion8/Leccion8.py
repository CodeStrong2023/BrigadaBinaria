class Persona:  # Creamos la clase
# el constructor esta oculto, se llama init Dunder.  self es un parametro default
    def __init__(self):
        self.nombre = "Juan"
        self.apellido ="zalazar"
        self.edad = 22
    def mostrar_detalle(self):  # Estando dentro del metodo llamamos con self
        print(f"Persona: {self.nombre} { self.apellido} {self.edad}")
persona1 = Persona()
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
print(Persona)
# Clase con argumentos
class Personaa():
    def __init__(self,nombre,apellido,edad):
        self.nombre = nombre
        self.apellido = apellido        # Atributos
        self.edad = edad
persona2 = Personaa("santino","Nuñez",18) # Necesita recivir argumentos
print(persona2.nombre)
print(persona2.apellido)
print(persona2.edad)

persona3 = Personaa("Nicolas","Nuñez",21)
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

# Los atributos son caracteristicas
# los metodos son el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle()