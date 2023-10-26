class Persona: #Creamos nuestra primera clase
    def __init__(self, nombre, apellido, edad): 
        #self es el parámetro por default y al método se lo llama Init Dunder
        self.nombre = nombre
        self.apellido = apellido
        self.edad = edad
    #pass significa que no se procesa más 
    def mostrar_detalle(self):
        print(f"Persona: {self.nombre} {self.apellido} {self.edad}")
#print(type(Persona))

persona1 = Persona("Angelina", "Pizzolatto", 18) #Tarea: Hacer el print igual que con el objeto2
print(persona1.nombre)
print(persona1.apellido)
print(persona1.edad)
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")


persona2 = Persona("Martín", "Guzmán", 32)
print(f"El objeto2 de la clase persona: {persona2.nombre} {persona2.apellido} {persona2.edad}")

persona1.nombre = "Antonella"
persona1.apellido = "Russo"
persona1.edad = 24
print(f"El objeto1 de la clase persona: {persona1.nombre} {persona1.apellido} {persona1.edad}")


#Los atributos son características 
#Los métodos son el comportamiento que van a tener los objetos (acciones)

persona1.mostrar_detalle()
persona2.mostrar_detalle()